package list.Ordenacao;

import list.Pesquisa.Numero;

import java.util.*;

public class OrdenacaoNumeros {
    //atributo
    private List<Integer> numerolist;

    public OrdenacaoNumeros() {
        this.numerolist = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numerolist.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer>numerosAcendentes = new ArrayList<>(this.numerolist);
        if (!numerolist.isEmpty()){
            Collections.sort(numerosAcendentes);
            return numerosAcendentes;
        }else {
            throw new RuntimeException(" A lista está vazia!");
        }
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> numerosAscendente = new ArrayList<>(this.numerolist);
        if (!numerolist.isEmpty()) {
            numerosAscendente.sort(Collections.reverseOrder());
            return numerosAscendente;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }
    public void exibirNumeros() {
        if (!numerolist.isEmpty()) {
            System.out.println(this.numerolist);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoNumeros
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        // Adicionando números à lista
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);

        // Exibindo a lista de números adicionados
        numeros.exibirNumeros();

        // Ordenando e exibindo em ordem ascendente
        System.out.println(numeros.ordenarAscendente());

        // Exibindo a lista
        numeros.exibirNumeros();

        // Ordenando e exibindo em ordem descendente
        System.out.println(numeros.ordenarDescendente());

        // Exibindo a lista
        numeros.exibirNumeros();
    }

}
