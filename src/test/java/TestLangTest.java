import neverlang.junit.Lang;
import neverlang.junit.NeverlangExt;
import neverlang.junit.NeverlangUnit;
import neverlang.junit.NeverlangUnitParam;
import neverlang.runtime.ASTNode;
import neverlang.runtime.Language;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import testlang.TestLang;

@ExtendWith(NeverlangExt.class)
@NeverlangUnit(language= TestLang.class)
public class TestLangTest {
    @Disabled
    @Test
    void firstTest(@NeverlangUnitParam(source = "create fede use fede") ASTNode s) {

    }

    @Disabled
    @Test
    void secondTest(@Lang Language lang) {
        // lang.
    }

}
