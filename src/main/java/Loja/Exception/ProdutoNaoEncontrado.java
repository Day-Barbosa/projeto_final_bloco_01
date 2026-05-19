package Loja.Exception;

public class ProdutoNaoEncontrado extends RuntimeException {

    public ProdutoNaoEncontrado(String mensagem) {
        super(mensagem);
    }
}
