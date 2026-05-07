package Menu;

import java.util.Scanner;

import Loja.util.Cores;

public class Menu_Logan {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int opcao;
        boolean continuar = true;

        while (continuar) {

            Cores.limparTela();
            System.out.print(Cores.BG_BLUE_DARK + Cores.TEXT_CYAN_BOLD_BRIGHT);

            System.out.println("╔══════════════════════════════════════╗");
            System.out.printf("║ %-36s ║%n", "🐱 LOJINHA DO LOGAN 🐱");
            System.out.println("╠══════════════════════════════════════╣");

            System.out.print(Cores.TEXT_WHITE_BOLD);
            System.out.printf("║ %-36s ║%n", "1 | Cadastrar Produto");
            System.out.printf("║ %-36s ║%n", "2 | Listar Todos os Produtos");
            System.out.printf("║ %-36s ║%n", "3 | Buscar Produto por ID");
            System.out.printf("║ %-36s ║%n", "4 | Atualizar Produto");
            System.out.printf("║ %-36s ║%n", "5 | Deletar Produto");
            System.out.printf("║ %-36s ║%n", "6 | Saída de Produto");
            System.out.printf("║ %-36s ║%n", "7 | Atualizar Estoque");

            System.out.print(Cores.TEXT_RED_BOLD);
            System.out.printf("║ %-36s ║%n", "0 | Sair");

            System.out.print(Cores.TEXT_CYAN_BOLD_BRIGHT);
            System.out.println("╠══════════════════════════════════════╣");

            System.out.print(Cores.TEXT_WHITE_BOLD);
            System.out.printf("║ %-36s ║%n", "➜ Digite a opção desejada");

            System.out.print(Cores.TEXT_CYAN_BOLD_BRIGHT);
            System.out.println("╚══════════════════════════════════════╝");
            System.out.print(Cores.TEXT_RESET);

            System.out.print("Opção: ");
            opcao = leia.nextInt();

            if (opcao < 0 || opcao > 7) {
                Cores.erro("Opção inválida!");
            } else {
                switch (opcao) {
                    case 1 -> Cores.sucesso("Produto cadastrado!");
                    case 2 -> Cores.sucesso("Listando produtos...");
                    case 3 -> Cores.sucesso("Buscando produto...");
                    case 4 -> Cores.sucesso("Atualizando produto...");
                    case 5 -> Cores.sucesso("Produto deletado!");
                    case 6 -> Cores.sucesso("Saída de produto realizada!");
                    case 7 -> Cores.sucesso("Estoque atualizado!");
                    case 0 -> {
                        System.out.println(
                                Cores.TEXT_RED_BOLD +
                                "\nSistema finalizado com sucesso!" +
                                Cores.TEXT_RESET
                        );
                        continuar = false;
                    }
                }
            }

            if (continuar) {
                System.out.println("\nPressione ENTER para continuar...");
                leia.nextLine();
                leia.nextLine();
            }
        }

        leia.close();
    }
}
