module testlang.all {

    imports {
        neverlang.core.typesystem.symbols.Token;
    }

    reference syntax {
        Identifier: Identifier <-- /[a-zA-Z_][a-zA-Z0-9_]*/;
        Create: Stmt <-- "create" Identifier;
        Use: Stmt <-- "use" Identifier;
        MoreStmt: StmtList <-- Stmt ";" StmtList;
        OneStmt: StmtList <-- Stmt ";";
        Program <-- StmtList;
    }

    role(useless) {  }

    role(type-checker) {

        Identifier: .{
            $Identifier[0].token = Token.fromASTNode($n, 0);
        }.

        1 <typecheck> .{
            eval $2
            define primitive $2
        }.

        3 <typecheck> .{
            eval $4
            infer identifier $4 => $3
        }.

        10 <typecheck> .{
	        initRoot sources
	   }.
    }
}

endemic slice testlang.CompilationEndemicSlices {
    declare {
        static CompilationHelper: testlang.symboltable.CompilationHelper; // Die after compilation
        static LSPGraph: neverlang.core.typesystem.graph.LSPGraph; // With static dont die
        Test2: testlang.lsp.Test2;
        static TestStatic: testlang.lsp.TestStatic;
    }
}


language testlang.TestLang {
    slices
        testlang.all

    endemic slices
        testlang.CompilationEndemicSlices

    // How to remove `<+ type-checker` from here without introducing `useless` role?
    roles syntax < useless <+ type-checker
}

language testlang.TestLangLSP {
    slices
        bundle (testlang.TestLang)

    endemic slices
        testlang.CompilationEndemicSlices

    roles syntax <+ type-checker
}
