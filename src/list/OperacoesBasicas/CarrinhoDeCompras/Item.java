package list.OperacoesBasicas.CarrinhoDeCompras;

public class Item {
    String nome;
    double preco;
    int qtde;

    public Item(String nome, double preco, int qtde) {
        this.nome = nome;
        this.preco = preco;
        this.qtde = qtde;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQtde() {
        return qtde;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", qtde=" + qtde +
                '}';
    }
}
