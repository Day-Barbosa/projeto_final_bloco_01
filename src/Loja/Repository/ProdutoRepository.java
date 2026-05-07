package Loja.Repository;

import Loja.Model.Produto;

public interface ProdutoRepository {

    void cadastrar(Produto produto);

    void listarTodos();

    void buscarPorId(int id);

    void atualizar(Produto produto);

    void deletar(int id);
}
