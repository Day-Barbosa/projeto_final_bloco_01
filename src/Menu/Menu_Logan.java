package Menu;

import java.util.Random;
import java.util.Scanner;

import Loja.Controller.ProdutoController;
import Loja.Exception.ProdutoNaoEncontrado;
import Loja.Model.Produto;
import Loja.Model.ProdutoPet;
import Loja.util.Cores;

public class Menu_Logan {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        Random random = new Random();
        ProdutoController produtos = new ProdutoController();

        int opcao;
        boolean continuar = true;

        while (continuar) {

            Cores.limparTela();
            Cores.cabecalho();

            System.out.print(Cores.TEXT_WHITE_BOLD);
            System.out.printf("║ %-36s ║%n", "1 | Cadastrar Produto");
            System.out.printf("║ %-36s ║%n", "2 | Listar Todos os Produtos");
            System.out.printf("║ %-36s ║%n", "3 | Buscar Produto por ID");
            System.out.printf("║ %-36s ║%n", "4 | Atualizar Produto");
            System.out.printf("║ %-36s ║%n", "5 | Deletar Produto");
            System.out.printf("║ %-36s ║%n", "6 | Saida de Produto");
            System.out.printf("║ %-36s ║%n", "7 | Atualizar Estoque");

            System.out.print(Cores.TEXT_RED_BOLD);
            System.out.printf("║ %-36s ║%n", "0 | Sair");

            Cores.linha();

            System.out.print(Cores.TEXT_WHITE_BOLD);
            System.out.printf("║ %-36s ║%n", "Digite a opcao desejada");

            Cores.rodape();
            System.out.print(Cores.TEXT_RESET);

            System.out.print("Opcao: ");
            opcao = leia.nextInt();

            if (opcao < 0 || opcao > 7) {
                Cores.erro("Opcao invalida!");
            } else {
                switch (opcao) {

                    case 1:
                        Cores.tituloSecao("Cadastrar Produto");

                        int idAleatorio = random.nextInt(9000) + 1000;

                        System.out.println("Escolha a fase da vida:");
                        System.out.println("1 - Biofree Filhotes");
                        System.out.println("2 - Biofree Adultos");
                        System.out.println("3 - Biofree Castrados");
                        System.out.print("Opcao: ");
                        int opcaoFase = leia.nextInt();

                        String faseDaVida;
                        String nomeBase;

                        if (opcaoFase == 1) {
                            faseDaVida = "Filhotes";
                            nomeBase = "Biofree - Filhotes";
                        } else if (opcaoFase == 2) {
                            faseDaVida = "Adultos";
                            nomeBase = "Biofree - Adultos";
                        } else if (opcaoFase == 3) {
                            faseDaVida = "Castrados";
                            nomeBase = "Biofree - Castrados";
                        } else {
                            Cores.erro("Fase da vida invalida!");
                            break;
                        }

                        System.out.println("\nEscolha a embalagem:");
                        System.out.println("1 - 3kg");
                        System.out.println("2 - 7kg");
                        System.out.println("3 - 12kg");
                        System.out.print("Opcao: ");
                        int opcaoEmbalagem = leia.nextInt();

                        double pesoEmKg;
                        double preco;

                        if (opcaoEmbalagem == 1) {
                            pesoEmKg = 3.0;
                            preco = 99.90;
                        } else if (opcaoEmbalagem == 2) {
                            pesoEmKg = 7.0;
                            preco = 189.90;
                        } else if (opcaoEmbalagem == 3) {
                            pesoEmKg = 12.0;
                            preco = 289.90;
                        } else {
                            Cores.erro("Embalagem invalida!");
                            break;
                        }

                        String nomeProduto = nomeBase + " " + pesoEmKg + "kg";

                        System.out.print("Digite a quantidade inicial em estoque: ");
                        int estoque = leia.nextInt();

                        ProdutoPet produto = new ProdutoPet(
                                idAleatorio,
                                nomeProduto,
                                preco,
                                estoque,
                                faseDaVida,
                                pesoEmKg
                        );

                        produtos.cadastrar(produto);
                        System.out.println("ID gerado automaticamente: " + idAleatorio);
                        break;

                    case 2:
                        Cores.tituloSecao("Listar Produtos");
                        produtos.listarTodos();
                        break;

                    case 3:
                        Cores.tituloSecao("Buscar Produto");

                        System.out.print("Digite o ID do produto: ");
                        int idBusca = leia.nextInt();

                        try {
                            Produto produtoEncontrado = produtos.buscarPorId(idBusca);
                            produtoEncontrado.visualizar();
                        } catch (ProdutoNaoEncontrado e) {
                            Cores.erro(e.getMessage());
                        }
                        break;

                    case 4:
                        Cores.tituloSecao("Atualizar Produto");

                        System.out.print("Digite o ID do produto que deseja atualizar: ");
                        int idAtualizar = leia.nextInt();

                        System.out.println("\nEscolha a nova fase da vida:");
                        System.out.println("1 - Biofree Filhotes");
                        System.out.println("2 - Biofree Adultos");
                        System.out.println("3 - Biofree Castrados");
                        System.out.print("Opcao: ");
                        int novaFase = leia.nextInt();

                        String novaFaseDaVida;
                        String novoNomeBase;

                        if (novaFase == 1) {
                            novaFaseDaVida = "Filhotes";
                            novoNomeBase = "Biofree - Filhotes";
                        } else if (novaFase == 2) {
                            novaFaseDaVida = "Adultos";
                            novoNomeBase = "Biofree - Adultos";
                        } else if (novaFase == 3) {
                            novaFaseDaVida = "Castrados";
                            novoNomeBase = "Biofree - Castrados";
                        } else {
                            Cores.erro("Fase da vida invalida!");
                            break;
                        }

                        System.out.println("\nEscolha a nova embalagem:");
                        System.out.println("1 - 3kg");
                        System.out.println("2 - 7kg");
                        System.out.println("3 - 12kg");
                        System.out.print("Opcao: ");
                        int novaEmbalagem = leia.nextInt();

                        double novoPesoEmKg;
                        double novoPreco;

                        if (novaEmbalagem == 1) {
                            novoPesoEmKg = 3.0;
                            novoPreco = 99.90;
                        } else if (novaEmbalagem == 2) {
                            novoPesoEmKg = 7.0;
                            novoPreco = 189.90;
                        } else if (novaEmbalagem == 3) {
                            novoPesoEmKg = 12.0;
                            novoPreco = 289.90;
                        } else {
                            Cores.erro("Embalagem invalida!");
                            break;
                        }

                        String novoNomeProduto = novoNomeBase + " " + novoPesoEmKg + "kg";

                        try {
                            Produto produtoAtual = produtos.buscarPorId(idAtualizar);

                            ProdutoPet produtoAtualizado = new ProdutoPet(
                                    produtoAtual.getId(),
                                    novoNomeProduto,
                                    novoPreco,
                                    produtoAtual.getEstoque(),
                                    novaFaseDaVida,
                                    novoPesoEmKg
                            );

                            produtos.atualizar(produtoAtualizado);
                        } catch (ProdutoNaoEncontrado e) {
                            Cores.erro(e.getMessage());
                        }
                        break;

                    case 5:
                        Cores.tituloSecao("Deletar Produto");

                        System.out.print("Digite o ID do produto que deseja deletar: ");
                        int idDeletar = leia.nextInt();

                        try {
                            produtos.deletar(idDeletar);
                        } catch (ProdutoNaoEncontrado e) {
                            Cores.erro(e.getMessage());
                        }
                        break;

                    case 6:
                        Cores.tituloSecao("Saida de Produto");

                        System.out.print("Digite o ID do produto: ");
                        int idSaida = leia.nextInt();

                        System.out.print("Digite a quantidade de saida: ");
                        int quantidadeSaida = leia.nextInt();

                        try {
                            String mensagem = produtos.saidaEstoque(idSaida, quantidadeSaida);
                            Cores.sucesso(mensagem);
                        } catch (ProdutoNaoEncontrado e) {
                            Cores.erro(e.getMessage());
                        }
                        break;

                    case 7:
                        Cores.tituloSecao("Atualizar Estoque");

                        System.out.print("Digite o ID do produto: ");
                        int idEntrada = leia.nextInt();

                        System.out.print("Digite a quantidade de entrada: ");
                        int quantidadeEntrada = leia.nextInt();

                        try {
                            String mensagem = produtos.entradaEstoque(idEntrada, quantidadeEntrada);
                            Cores.sucesso(mensagem);
                        } catch (ProdutoNaoEncontrado e) {
                            Cores.erro(e.getMessage());
                        }
                        break;

                    case 0:
                        System.out.println(
                                Cores.TEXT_RED_BOLD +
                                "\nSistema finalizado com sucesso!" +
                                Cores.TEXT_RESET
                        );
                        continuar = false;
                        break;
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
