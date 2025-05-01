package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        Set<Tarefa> tarefasParaRemover = new HashSet<>();
        for (Tarefa t : tarefaSet){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
                break;
            }
        }
        tarefaSet.remove(tarefasParaRemover);
    }

    public void exibirTarefas(){
        System.out.println(tarefaSet);
    }

    public void contarTarefas(){
        System.out.println("O numero de tarefas no Set é de: " + tarefaSet.size());
    }

    public Set<Tarefa>obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : tarefaSet){
            if (t.isTerminada()){
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa>obterTarefasPendentes(){
        Set<Tarefa>tarefasPendentes = new HashSet<>();
        for (Tarefa t : tarefaSet){
            if (!t.isTerminada()){
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        for (Tarefa t : tarefaSet){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                t.setTerminada(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao){
        for (Tarefa t : tarefaSet){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                t.setTerminada(false);
            }
        }
    }

    public void limparListaTarefas(){
        tarefaSet.removeAll(tarefaSet);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        listaTarefas.adicionarTarefa("aaaaa");
        listaTarefas.adicionarTarefa("bbbbb");
        listaTarefas.adicionarTarefa("ccccc");
        listaTarefas.adicionarTarefa("ddddd");
        listaTarefas.adicionarTarefa("eeeee");
        listaTarefas.adicionarTarefa("eeeee");

        listaTarefas.exibirTarefas();

        listaTarefas.contarTarefas();

        System.out.println("O numero de tarefas concluidas é: " + listaTarefas.obterTarefasConcluidas().size() + " " + listaTarefas.obterTarefasConcluidas());
        System.out.println("O numero de tarefas pendentes é: " + listaTarefas.obterTarefasPendentes().size() + " " + listaTarefas.obterTarefasPendentes());

        listaTarefas.marcarTarefaConcluida("aaaaa");
        listaTarefas.marcarTarefaConcluida("ddddd");
        listaTarefas.marcarTarefaPendente("aaaaa");

        System.out.println("O numero de tarefas concluidas é: " + listaTarefas.obterTarefasConcluidas().size() + " " + listaTarefas.obterTarefasConcluidas());
        System.out.println("O numero de tarefas pendentes é: " + listaTarefas.obterTarefasPendentes().size() + " " + listaTarefas.obterTarefasPendentes());

        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
    }

}
