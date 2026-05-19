package Loja.Controller;

import java.util.ArrayList;

import Loja.Exception.ProdutoNaoEncontrado;
import Loja.Model.Produto;
import Loja.Model.ProdutoPet;
import Loja.Repository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository {

    private ArrayList<Produto> listaProdutos = new ArrayList<>();

    @Override
    public void cadastrar(Produto produto) {
        listaProdutos.add(produto);
        System.out.println("Produto cadastrado com sucesso!");
    }

    @Override
    public void listarTodos() {
        if (listaProdutos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            for (Produto produto : listaProdutos) {
                produto.visualizar();
            }
        }
    }

    @Override
    public Produto buscarPorId(int id) {
        for (Produto produto : listaProdutos) {
            if (produto.getId() == id) {
                return produto;
            }
        }

        throw new ProdutoNaoEncontrado("Produto nao encontrado.");
    }

    @Override
    public void atualizar(Produto produtoAtualizado) {
        Produto produto = buscarPorId(produtoAtualizado.getId());

        produto.setNome(produtoAtualizado.getNome());
        produto.setPreco(produtoAtualizado.getPreco());
        produto.setEstoque(produtoAtualizado.getEstoque());

        if (produto instanceof ProdutoPet && produtoAtualizado instanceof ProdutoPet) {
            ProdutoPet produtoPet = (ProdutoPet) produto;
            ProdutoPet produtoPetAtualizado = (ProdutoPet) produtoAtualizado;

            produtoPet.setFaseDaVida(produtoPetAtualizado.getFaseDaVida());
            produtoPet.setPesoEmKg(produtoPetAtualizado.getPesoEmKg());
        }

        System.out.println("Produto atualizado com sucesso!");
    }

    @Override
    public void deletar(int id) {
        Produto produto = buscarPorId(id);
        listaProdutos.remove(produto);

        System.out.println("Produto deletado com sucesso!");
    }

    public String entradaEstoque(int id, int quantidade) {
        Produto produto = buscarPorId(id);
        return produto.entradaEstoque(quantidade);
    }

    public String saidaEstoque(int id, int quantidade) {
        Produto produto = buscarPorId(id);
        return produto.saidaEstoque(quantidade);
    }
}
