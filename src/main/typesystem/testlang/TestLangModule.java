package testlang;

import neverlang.core.typelang.TypeLangGenerator;

public class TestLangModule extends TypeLangGenerator {

    public final static String LANGUAGE = "testlang";
    public TestLangModule(){
        initPackage("testlang", LANGUAGE);
    }
}
