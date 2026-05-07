package Loja.util;

public class Cores {

    // RESET
    public static final String TEXT_RESET = "\u001B[0m";

    // CORES
    public static final String TEXT_BLACK = "\u001B[30m";
    public static final String TEXT_RED = "\u001B[31m";
    public static final String TEXT_GREEN = "\u001B[32m";
    public static final String TEXT_YELLOW = "\u001B[33m";
    public static final String TEXT_BLUE = "\u001B[34m";
    public static final String TEXT_PURPLE = "\u001B[35m";
    public static final String TEXT_CYAN = "\u001B[36m";
    public static final String TEXT_WHITE = "\u001B[37m";

    // BACKGROUND
    public static final String BG_BLUE_DARK = "\033[48;5;17m";

    // BOLD
    public static final String TEXT_RED_BOLD = "\033[1;31m";
    public static final String TEXT_GREEN_BOLD = "\033[1;32m";
    public static final String TEXT_WHITE_BOLD = "\033[1;37m";
    public static final String TEXT_CYAN_BOLD_BRIGHT = "\033[1;96m";

    // MÉTODOS VISUAIS
    public static void linha() {
        System.out.println(TEXT_CYAN_BOLD_BRIGHT +
                "╠══════════════════════════════════════╣"
                + TEXT_RESET);
    }

    public static void cabecalho() {
        System.out.print(TEXT_CYAN_BOLD_BRIGHT);
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║                                      ║");
        System.out.println("║         🐱 LOJINHA DO LOGAN 🐱       ║");
        System.out.println("║                                      ║");
        System.out.println("╠══════════════════════════════════════╣");
        System.out.print(TEXT_RESET);
    }

    public static void rodape() {
        System.out.println(TEXT_CYAN_BOLD_BRIGHT +
                "╚══════════════════════════════════════╝"
                + TEXT_RESET);
    }

    public static void erro(String texto) {
        System.out.println(TEXT_RED_BOLD +
                "\n❌ " + texto + "\n"
                + TEXT_RESET);
    }

    public static void sucesso(String texto) {
        System.out.println(TEXT_GREEN_BOLD +
                "\n✅ " + texto + "\n"
                + TEXT_RESET);
    }

    public static void limparTela() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}