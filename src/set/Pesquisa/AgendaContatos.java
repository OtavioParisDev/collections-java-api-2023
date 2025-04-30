package set.Pesquisa;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.StreamSupport;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet){
            if (c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("Gabriel Otavio",123);
        agendaContatos.adicionarContato("Gabriel Paris",1234);
        agendaContatos.adicionarContato("Gabriel Pimentel",1235);
        agendaContatos.adicionarContato("Gabriel da Costa",1236);
        agendaContatos.adicionarContato("Carlos",321);
        agendaContatos.adicionarContato("Tadeu",111);
        agendaContatos.adicionarContato("Tadeu",112);
        agendaContatos.adicionarContato("Tadeu",113);
        agendaContatos.adicionarContato("Charles",111);
        agendaContatos.adicionarContato("Marilza",222);

        agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisarPorNome("Gabriel"));
        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Carlos", 11111));
        agendaContatos.exibirContato();
    }

}
