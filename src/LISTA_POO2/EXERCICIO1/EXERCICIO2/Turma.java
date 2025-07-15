
package LISTA_POO2.EXERCICIO1.EXERCICIO2;

import java.util.ArrayList;
import java.util.List;


public class Turma {
    
    private List<Aluno> alunos;

    public Turma() {
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public double calcularMediaTurma() {
        if (alunos.isEmpty()) {
            return 0.0;
        }

        double soma = 0.0;
        for (Aluno aluno : alunos) {
            soma += aluno.getNota();
        }

        return soma / alunos.size();
    }

    public void mostrarAprovados() {
        System.out.println("Alunos aprovados:");
        for (Aluno aluno : alunos) {
            if (aluno.isAprovado()) {
                System.out.println(aluno);
            }
        }
    }

    public void listarTodos() {
        System.out.println("Lista de todos os alunos:");
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }

}
