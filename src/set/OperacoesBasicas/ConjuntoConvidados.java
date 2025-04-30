package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet){
            if (c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do set de convidados");

        conjuntoConvidados.adicionarConvidado("Gabriel", 11111);
        conjuntoConvidados.adicionarConvidado("Marcos", 11111);
        conjuntoConvidados.adicionarConvidado("Carlos", 22222);
        conjuntoConvidados.adicionarConvidado("Amauri", 33333);
        conjuntoConvidados.adicionarConvidado("Isa", 44444);

        conjuntoConvidados.exibirConvidados();

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do set de convidados");

        conjuntoConvidados.removerConvidadoPorCodigoConvite(11111);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do set de convidados");

        conjuntoConvidados.exibirConvidados();

    }
}
