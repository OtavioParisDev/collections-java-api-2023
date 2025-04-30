package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<Palavra> palavraSet;

    public ConjuntoPalavrasUnicas() {
        this.palavraSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavraSet.add(new Palavra(palavra));
    }

    public void removerPalavra(String palavra){
        Palavra palavraParaRemover = null;
        for (Palavra p : palavraSet){
            if (p.getPalavra() == palavra){
                palavraParaRemover = p;
                break;
            }
        }
        palavraSet.remove(palavraParaRemover);
    }

    public void verificarPalavra(String palavra){
        Palavra palavraParaVerificar = null;
        for (Palavra p : palavraSet){
            if (p.getPalavra().equalsIgnoreCase(palavra)){
                palavraParaVerificar = p;
                System.out.println("A palavra " + p + " ESTÁ no conjunto!");
                break;
            }else {
                System.out.println("Essa palavra não está no conjunto!");
                break;
            }
        }

    }

    public void exibirPalavrasUnicas(){
        System.out.println(palavraSet);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("um");
        conjuntoPalavrasUnicas.adicionarPalavra("dois");
        conjuntoPalavrasUnicas.adicionarPalavra("tres");
        conjuntoPalavrasUnicas.adicionarPalavra("tres");
        conjuntoPalavrasUnicas.adicionarPalavra("quatro");
        conjuntoPalavrasUnicas.adicionarPalavra("cinco");
        conjuntoPalavrasUnicas.adicionarPalavra("seis");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.removerPalavra("tres");
        conjuntoPalavrasUnicas.removerPalavra("quatro");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.verificarPalavra("tres");
        conjuntoPalavrasUnicas.verificarPalavra("cinco");

    }

}
