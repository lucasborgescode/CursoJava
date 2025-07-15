
package LISTA_POO2.EXERCICIO1;


public class Pessoa {
    
    private String nome;
    private int idade;
    private String sexo;
    
    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    
    public void ImprimirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Sexo: " + sexo);
    }
}
