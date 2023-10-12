package testlang.symboltable;

import neverlang.core.typelang.annotations.TypeLangAnnotation;
import neverlang.core.typelang.annotations.TypeSystemKind;
import testlang.TestLangModule;

@TypeLangAnnotation(
        label = TestLangModule.LANGUAGE,
        kind = TypeSystemKind.PRIORITY
)
public enum Priorities implements Comparable<Priorities> {
    SOURCES
}
