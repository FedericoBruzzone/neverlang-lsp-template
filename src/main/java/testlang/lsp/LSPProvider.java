package testlang.lsp;

import neverlang.core.lsp.capabilities.CapabilityBuilder;
import neverlang.core.lsp.defaults.DefaultDiagnostic;
import neverlang.core.lsp.defaults.DefaultDocumentSymbol;
import neverlang.core.lsp.defaults.DefaultSemanticToken;
import neverlang.core.lsp.launcher.NeverlangLSPProvider;
import neverlang.core.lsp.services.WorkspaceBuilder;
import testlang.TestLangModule;

import java.util.List;
import java.util.stream.Stream;
import neverlang.core.lsp.defaults.*;
import testlang.typesystem.types.TypePrimitive;

public class LSPProvider extends NeverlangLSPProvider {

    private static final String typesystem = TypePrimitive.class.getPackageName();

    @Override
    public WorkspaceBuilder workspaceBuilder() {
        return (workspace) -> Stream.of(new TestLangWorkspaceHandler(workspace));
    }

    @Override
    public List<CapabilityBuilder> capabilities() {
        return List.of(
                () -> new DefaultDocumentSymbol(typesystem),
                () -> new DefaultSemanticToken(typesystem),
                () -> new DefaultDiagnostic(TestLangModule.LANGUAGE),
                DefaultGoToDefinition::new,
                DefaultReferences::new,
                DefaultFoldingRange::new,
                () -> new DefaultInlayHint(typesystem)
        );
    }

}
