package set.Pesquisa;

import java.util.Objects;

public class Tarefa {

    private String descricao;
    private boolean terminada;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.terminada = false;
    }



    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isTerminada() {
        return terminada;
    }

    public void setTerminada(boolean terminada) {
        this.terminada = terminada;
    }

    @Override
    public String toString() {
        return "Tarefa {" +
                descricao + '\'' +
                ", terminada=" + terminada +
                " }";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Tarefa tarefa = (Tarefa) o;
        return Objects.equals(descricao, tarefa.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(descricao);
    }
}
