
package LISTA_POO2.EXERCICIO1.EXERCICIO2;


public class Aluno {
    
    private String nome;
    private double nota;
    
    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }
    
    

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }
    
    public boolean isAprovado() {
        return nota >= 6;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", nota=" + nota + '}';
    }
    
    

   
    
    
}
