
package LISTA_POO2.EXERCICIO1.EXERCICIO2;


public class NewMain {

   
    public static void main(String[] args) {
        
        Turma turma = new Turma();

        turma.adicionarAluno(new Aluno("Lucas", 8.5));
        turma.adicionarAluno(new Aluno("Mariana", 5.0));
        turma.adicionarAluno(new Aluno("Carlos", 7.2));

        turma.listarTodos();
        System.out.printf("Média da turma: %.2f\n", turma.calcularMediaTurma());
        turma.mostrarAprovados();
    }
    
}
