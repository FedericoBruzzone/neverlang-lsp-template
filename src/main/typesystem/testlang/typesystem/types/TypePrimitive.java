package testlang.typesystem.types;

import neverlang.core.typelang.annotations.DocumentSymbol;
import neverlang.core.typelang.annotations.SemanticToken;
import neverlang.core.typelang.annotations.TypeLangAnnotation;
import neverlang.core.typelang.annotations.TypeSystemKind;
import neverlang.core.typesystem.Signature;
import neverlang.core.typesystem.SymbolTableEntry;
import neverlang.core.typesystem.Type;
import neverlang.core.typesystem.symboltable.EntryKind;
import org.eclipse.lsp4j.SemanticTokenTypes;
import org.eclipse.lsp4j.SymbolKind;
import testlang.TestLangModule;
import testlang.typesystem.signatures.IdentifierSignature;

@TypeLangAnnotation(
        label = TestLangModule.LANGUAGE,
        kind = TypeSystemKind.TYPE,
        keyword = "primitive"
)
public record TypePrimitive() implements Type {


    @Override
    public String id() {
        return "primitive";
    }


    @DocumentSymbol
    public SymbolKind documentSymbol(SymbolTableEntry entry) {
        return entry.entryKind().equals(EntryKind.DEFINE) ? SymbolKind.Class : null;
    }

    @SemanticToken(SemanticTokenTypes.Class)
    public String semanticToken(SymbolTableEntry entry) {
        return SemanticTokenTypes.Class;
    }

    @Override
    public boolean matchSignature(Signature signature) {
        return signature instanceof IdentifierSignature;
    }
}
