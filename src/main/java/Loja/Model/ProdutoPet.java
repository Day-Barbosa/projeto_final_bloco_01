package Loja.Model;

public class ProdutoPet extends Produto {

    private String faseDaVida;
    private double pesoEmKg;

    public ProdutoPet(int id, String nome, double preco, int estoque, String faseDaVida, double pesoEmKg) {
        super(id, nome, preco, estoque);
        this.faseDaVida = faseDaVida;
        this.pesoEmKg = pesoEmKg;
    }

    public String getFaseDaVida() {
        return faseDaVida;
    }

    public void setFaseDaVida(String faseDaVida) {
        this.faseDaVida = faseDaVida;
    }

    public double getPesoEmKg() {
        return pesoEmKg;
    }

    public void setPesoEmKg(double pesoEmKg) {
        this.pesoEmKg = pesoEmKg;
    }

    @Override
    public String getTipo() {
        return "Produto para Gatos";
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("Fase da vida: " + faseDaVida);
        System.out.println("Peso da embalagem: " + pesoEmKg + "kg");
        System.out.println("======================================");
    }
}
