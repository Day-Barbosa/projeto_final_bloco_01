package Loja.util;

public class Cores {

    public static final String TEXT_RESET = "\u001B[0m";

    public static final String TEXT_BLACK = "\u001B[30m";
    public static final String TEXT_RED = "\u001B[31m";
    public static final String TEXT_GREEN = "\u001B[32m";
    public static final String TEXT_YELLOW = "\u001B[33m";
    public static final String TEXT_BLUE = "\u001B[34m";
    public static final String TEXT_PURPLE = "\u001B[35m";
    public static final String TEXT_CYAN = "\u001B[36m";
    public static final String TEXT_WHITE = "\u001B[37m";

    public static final String BG_BLUE_DARK = "\033[48;5;17m";

    public static final String TEXT_RED_BOLD = "\033[1;31m";
    public static final String TEXT_GREEN_BOLD = "\033[1;32m";
    public static final String TEXT_WHITE_BOLD = "\033[1;37m";
    public static final String TEXT_CYAN_BOLD_BRIGHT = "\033[1;96m";

    public static void cabecalho() {
        System.out.print(BG_BLUE_DARK + TEXT_CYAN_BOLD_BRIGHT);
        System.out.println("╔══════════════════════════════════════╗");
        System.out.printf("║ %-36s ║%n", "🐱 LOJINHA DO LOGAN 🐱");
        System.out.println("╠══════════════════════════════════════╣");
        System.out.print(TEXT_RESET);
    }

    public static void linha() {
        System.out.print(TEXT_CYAN_BOLD_BRIGHT);
        System.out.println("╠══════════════════════════════════════╣");
        System.out.print(TEXT_RESET);
    }

    public static void rodape() {
        System.out.print(TEXT_CYAN_BOLD_BRIGHT);
        System.out.println("╚══════════════════════════════════════╝");
        System.out.print(TEXT_RESET);
    }

    public static void sucesso(String texto) {
        System.out.println(TEXT_GREEN_BOLD + "\n✅ " + texto + TEXT_RESET);
    }

    public static void erro(String texto) {
        System.out.println(TEXT_RED_BOLD + "\n❌ " + texto + TEXT_RESET);
    }

    public static void tituloSecao(String texto) {
        System.out.println(TEXT_CYAN_BOLD_BRIGHT + "\n======================================" + TEXT_RESET);
        System.out.println(TEXT_WHITE_BOLD + texto + TEXT_RESET);
        System.out.println(TEXT_CYAN_BOLD_BRIGHT + "======================================" + TEXT_RESET);
    }

    public static void limparTela() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}