package Loja.Model;

public abstract class Produto {

    private int id;
    private String nome;
    private double preco;
    private int estoque;

    public Produto(int id, String nome, double preco, int estoque) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    } 

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    } 

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    } 

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public String entradaEstoque(int quantidade) {
        if (quantidade <= 0) {
            return "Quantidade invalida.";
        }

        estoque += quantidade;
        return "Estoque atualizado com sucesso.";
    }

    public String entradaEstoque(int quantidade, String observacao) {
        if (quantidade <= 0) {
            return "Quantidade invalida.";
        }

        estoque += quantidade;
        return "Estoque atualizado com sucesso. Observacao: " + observacao;
    }

    public String saidaEstoque(int quantidade) {
        if (quantidade <= 0) {
            return "Quantidade invalida.";
        }

        if (quantidade > estoque) {
            return "Estoque insuficiente para realizar a venda.";
        }

        estoque -= quantidade;
        return "Venda realizada com sucesso.";
    }

    public abstract String getTipo();

    public void visualizar() {
        System.out.println("======================================");
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.printf("Preco: R$ %.2f%n", preco);
        System.out.println("Estoque: " + estoque);
        System.out.println("Tipo: " + getTipo());
    }
}
