package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    //atributo
    private List<Numero> numeroList;

    public SomaNumeros() {
        this.numeroList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numeroList.add(new Numero(numero));
    }

    public int calcularSoma(){
        int vt = 0;
        if (!numeroList.isEmpty()){
            for (Numero n : numeroList){
                int numero = n.getNumero();
                vt += numero;
            }
        }else {
            System.out.println("Lista vazia");
        }
        return vt;
    }

    public int encontrarMaiorNumero(){
        int maiorNum = Integer.MIN_VALUE;
        if (!numeroList.isEmpty()){
            for (Numero n : numeroList){
                if (n.getNumero() >= maiorNum){
                    maiorNum = n.getNumero();
                }
            }
        }else {
            System.out.println("Lista vazia!");
        }
        return maiorNum;
    }

    public int encontrarMenorNumero(){
        int menorNum = Integer.MAX_VALUE;
        if (!numeroList.isEmpty()){
            for (Numero n : numeroList){
                if (n.getNumero() < menorNum){
                    menorNum = n.getNumero();
                }
            }
        }else {
            System.out.println("Lista vazia!");
        }
        return menorNum;
    }

    public void exibirNumeros(){
        if (!numeroList.isEmpty()){
            System.out.println(this.numeroList);
        }else {
            System.out.println("Lista vazia!");
        }
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(120);
        somaNumeros.adicionarNumero(121);
        somaNumeros.adicionarNumero(122);
        somaNumeros.adicionarNumero(123);
        somaNumeros.adicionarNumero(124);
        somaNumeros.adicionarNumero(1000);
        somaNumeros.exibirNumeros();
        System.out.println("a soma dos numeros na lista é:" + somaNumeros.calcularSoma());
        System.out.println("O maior número da lista é:" + somaNumeros.encontrarMaiorNumero());
        System.out.println("O menor número da lista é:" + somaNumeros.encontrarMenorNumero());
        somaNumeros.exibirNumeros();

    }
}

