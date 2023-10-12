package testlang;


import neverlang.core.typesystem.defaults.Constants;
import testlang.symboltable.CompilationHelper;
import testlang.typesystem.signatures.IdentifierSignature;
import testlang.typesystem.types.TypePrimitive;

public class TypeLangTranslatorPlugin extends neverlang.core.typelang.TypeLangTranslatorPlugin {
    public TypeLangTranslatorPlugin() {
        super(
                new TypeLangModule(),
                new TestLangModule()
        );
        importAllPackages(Constants.class,TestLangModule.class, TypePrimitive.class, CompilationHelper.class, IdentifierSignature.class);
    }
}
