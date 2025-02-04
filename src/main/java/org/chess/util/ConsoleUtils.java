package org.chess.util;

public class ConsoleUtils {
    public static void clearScreen() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                // Limpiar pantalla en Windows
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                // Limpiar pantalla en Linux o macOS
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final Exception e) {
            System.out.println("No se pudo limpiar la pantalla: " + e.getMessage());
        }
    }
}
