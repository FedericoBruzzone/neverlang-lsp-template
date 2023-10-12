package testlang;

import neverlang.compiler.plugins.translator.TranslatorPlugin;
import neverlang.runtime.DexterNeverlangModule;

import java.util.Map;

public class TypeLangModule extends DexterNeverlangModule {

    @Override
    public Map<String, Class<? extends TranslatorPlugin>> getTranslators() {
        return Map.of("typecheck", TypeLangTranslatorPlugin.class);
    }
}
