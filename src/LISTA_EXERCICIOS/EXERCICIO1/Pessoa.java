
package LISTA_EXERCICIOS.EXERCICIO1;


public class Pessoa {
    
    private String nome;
    private int idade;
    
    public Pessoa (String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    public void dadosPessoa() {
        System.out.println("O nome da pessoa é: " + this.nome);
        System.out.println("Essa pessoa tem: " + this.idade + "anos");
    }
}
