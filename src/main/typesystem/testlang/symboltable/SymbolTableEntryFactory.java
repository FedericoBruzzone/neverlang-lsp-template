package testlang.symboltable;


import neverlang.core.typelang.annotations.TypeLangAnnotation;
import neverlang.core.typelang.annotations.TypeSystemKind;
import neverlang.core.typesystem.symbols.Token;
import testlang.TestLangModule;

@TypeLangAnnotation(
        label = TestLangModule.LANGUAGE,
        kind = TypeSystemKind.SYMBOL_TABLE_ENTRY_FACTORY
)
public class SymbolTableEntryFactory extends neverlang.core.typesystem.SymbolTableEntryFactory<String, SymbolTableEntryFactory> {
    @Override
    public String getIdentifierFromToken(Token token) {
        return token.text();
    }
}
