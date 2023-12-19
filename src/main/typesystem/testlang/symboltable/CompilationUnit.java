package testlang.symboltable;

import neverlang.core.typelang.annotations.TypeLangAnnotation;
import neverlang.core.typelang.annotations.TypeSystemKind;
import neverlang.core.typesystem.InferencingStrategy;
import neverlang.core.typesystem.Scope;
import neverlang.core.typesystem.symbols.Location;
import testlang.TestLangModule;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@TypeLangAnnotation(
        label = TestLangModule.LANGUAGE,
        kind = TypeSystemKind.COMPILATION_UNIT
)
public class CompilationUnit extends neverlang.core.typesystem.CompilationUnit<String> {
    public CompilationUnit(Scope<String> scope,
                           InferencingStrategy inferencingStrategy,
                           neverlang.core.typesystem.CompilationUnit<String> compilationUnitParent,
                           Location location,
                           String id) {
        super(scope, inferencingStrategy, compilationUnitParent, location, id);
    }
}
