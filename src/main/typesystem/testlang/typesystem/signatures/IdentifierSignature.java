package testlang.typesystem.signatures;

import neverlang.core.typesystem.Signature;
import neverlang.core.typelang.annotations.TypeLangAnnotation;
import neverlang.core.typelang.annotations.TypeSystemKind;
import testlang.TestLangModule;

@TypeLangAnnotation(
        keyword = "identifier",
        label = TestLangModule.LANGUAGE,
        kind = TypeSystemKind.SIGNATURE
)
public class IdentifierSignature implements Signature {

}
