package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    private Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

   public void adicionarAluno(String nome, long matricula, double media){
        alunoSet.add(new Aluno(nome, matricula, media));
   }

   public void removerAluno(long matricula){
       Aluno alunoParaRemover = null;
        for (Aluno a : alunoSet){
            if (a.getMatricula() == matricula){
                alunoParaRemover = a;
                break;
            }
        }
        alunoSet.remove(alunoParaRemover);
   }

   public Set<Aluno> exibirAlunosPorNome(){
        Set<Aluno> alunoPorNome = new TreeSet<>(alunoSet);
        return alunoPorNome;
   }

   public Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        alunosPorNota.addAll(alunoSet);
        return alunosPorNota;
   }

   public void exibirAlunos(){
       System.out.println(alunoSet);
   }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();
        gerenciadorAlunos.adicionarAluno("Carlos", 3782L, 7.3);
        gerenciadorAlunos.adicionarAluno("Kauan", 3782L, 9.0);
        gerenciadorAlunos.adicionarAluno("Gabriel", 4827L, 10.0);
        gerenciadorAlunos.adicionarAluno("Tadeu", 9682L, 8.0);
        gerenciadorAlunos.adicionarAluno("Josney", 1111L, 3.0);

        gerenciadorAlunos.exibirAlunos();
       // gerenciadorAlunos.removerAluno(4827L);

        gerenciadorAlunos.exibirAlunos();

        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());

        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());



    }

}
