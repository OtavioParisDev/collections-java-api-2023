package list.OperacoesBasicas.CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    //atributo
    private List<Item> itemList;

    //construtor
    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    //adicionar item
    public void adicionarItem(String nome, double preco, int qtde){
        Item item = new Item(nome, preco, qtde);
        itemList.add(item);
    }

    //remover item
    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        if (!itemList.isEmpty()) {
            for (Item i : itemList) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(i);
                }
            }
            itemList.removeAll(itensParaRemover);
        }else {
            System.out.println("A lista está vazia");
        }
    }

    //calcular valor total
    public double calcularValorTotal(){
        double vt = 0d;
        if (!itemList.isEmpty()){
            for (Item i : itemList) {
                double valorItem = i.getPreco() * i.getQtde();
                vt += valorItem; //valorTotal = valorTotal + valorItem;
            }
            return vt;
        }else {
            throw new RuntimeException("A lista está vazia.");
        }
    }

    //exibir itens
    public void exibirItens() {
        if (!itemList.isEmpty()) {
            System.out.println(this.itemList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }



    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Pão", 2d, 3);
        carrinhoDeCompras.adicionarItem("Macarrão", 5d, 2);
        carrinhoDeCompras.adicionarItem("Carne", 10d, 1);
        carrinhoDeCompras.removerItem("Pão");
        carrinhoDeCompras.exibirItens();
        System.out.println("O valot total do carrinho é: "+ carrinhoDeCompras.calcularValorTotal());

    }
}
