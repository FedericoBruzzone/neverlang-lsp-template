package testlang.lsp;

import neverlang.core.lsp.compiler.WorkspaceHandler;
import neverlang.core.lsp.services.Workspace;
import neverlang.core.typesystem.compiler.Compiler;
import neverlang.core.typesystem.compiler.SourceSet;
import neverlang.core.typesystem.defaults.DefaultIncrementalCompilationHelper;
import neverlang.core.typesystem.defaults.DefaultSourceSet;
import org.jetbrains.annotations.NotNull;
import testlang.TestLang;
import testlang.TestLangModule;
import testlang.symboltable.CompilationHelper;

import java.nio.file.Path;

public class TestLangWorkspaceHandler extends WorkspaceHandler {

    public TestLangWorkspaceHandler(Workspace workspace) {
        super(workspace, new DefaultIncrementalCompilationHelper());
    }

    @Override
    public SourceSet getSourceSet(Path rootDir) {
        return new DefaultSourceSet.Builder(".tst").buildFromRootDir(rootDir);
    }

    @NotNull
    @Override
    public Compiler buildCompiler() {
        return new Compiler(
                new TestLang(new TestLangModule()), // TODO
                CompilationHelper.class
        );
    }
}
