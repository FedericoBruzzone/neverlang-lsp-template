package testlang.lsp;


import neverlang.core.lsp.launcher.NeverlangLSPSocketLauncher;
import neverlang.core.typesystem.compiler.Compiler;

import java.util.logging.Level;

public class SocketLauncher {
    public static void main(String[] args) {
        Compiler.logger.setLevel(Level.INFO);
        var lspProvider = new LSPProvider();
        new NeverlangLSPSocketLauncher(lspProvider, 5123)
                .run();
    }
}
