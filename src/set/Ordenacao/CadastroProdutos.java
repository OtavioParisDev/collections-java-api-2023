package set.Ordenacao;

import java.sql.SQLOutput;
import java.util.*;

public class CadastroProdutos {

    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantdade){
        produtoSet.add(new Produto(cod, nome, preco, quantdade));
    }

    public Set<Produto> exibirAlunosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto>exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        cadastroProdutos.adicionarProduto(1L, "Produto 0", 13.90 , 3);
        cadastroProdutos.adicionarProduto(4L, "Produto 7", 14.90 , 3);
        cadastroProdutos.adicionarProduto(4L, "Produto 2", 15.90 , 3);
        cadastroProdutos.adicionarProduto(6L, "Produto 9", 16.90 , 3);
        cadastroProdutos.adicionarProduto(8L, "Produto 3", 17.90 , 3);

        System.out.println(cadastroProdutos.produtoSet);
        System.out.println(cadastroProdutos.exibirAlunosPorNome());
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());

    }

}

