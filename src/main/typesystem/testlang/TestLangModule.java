package testlang;

import neverlang.core.typelang.TypeLangGenerator;
import neverlang.core.typesystem.CompilationUnit;
import neverlang.core.typesystem.defaults.Constants;
import neverlang.core.typesystem.graph.LSPGraph;
import testlang.symboltable.CompilationHelper;

import java.util.stream.Stream;

public class TestLangModule extends TypeLangGenerator {

    public final static String LANGUAGE = "testlang";
    //public final static String LANGUAGE2 = "testlang2";
    public TestLangModule(){
        initPackage("testlang", LANGUAGE);
    }
}
