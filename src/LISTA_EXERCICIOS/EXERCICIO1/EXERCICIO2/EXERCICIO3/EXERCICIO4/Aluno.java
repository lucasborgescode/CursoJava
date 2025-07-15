
package LISTA_EXERCICIOS.EXERCICIO1.EXERCICIO2.EXERCICIO3.EXERCICIO4;


public class Aluno {
    
    private String nome;
    private double nota1;
    private double nota2;
    
    public Aluno(String nome, double nota1, double nota2) {
        
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    
    public double calculaMedia() {
        
        double operacao = (this.nota1 + this.nota2) / 2;
        System.out.println("Sua nota é: " + operacao);
        
        if(operacao >= 6) {
            System.out.println("Aprovado com nota " + operacao);
        }
        return operacao;

    }
}
