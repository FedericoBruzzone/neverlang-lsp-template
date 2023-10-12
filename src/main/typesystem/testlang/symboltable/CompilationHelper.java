package testlang.symboltable;

import neverlang.core.typelang.annotations.TypeLangAnnotation;
import neverlang.core.typelang.annotations.TypeSystemKind;
import neverlang.core.typesystem.Scope;
import neverlang.core.typesystem.defaults.DefaultTypeSourceSet;
import testlang.TestLangModule;

@TypeLangAnnotation(
        label = TestLangModule.LANGUAGE,
        kind = TypeSystemKind.COMPILATION_HELPER
)
public class CompilationHelper extends neverlang.core.typesystem.CompilationHelper<String, Priorities>{
    @Override
    protected Scope<String> generateRootType() {
        return new DefaultTypeSourceSet();
    }

}
