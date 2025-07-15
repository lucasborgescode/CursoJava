
package LISTA_EXERCICIOS.EXERCICIO1.EXERCICIO2.EXERCICIO3.EXERCICIO4.EXERCICIO5.EXERCICIO6;


public abstract class Animal {
    
    protected String nome;
    
    public Animal(String nome) {
        this.nome = nome;
    }
    
    public void fazerSom() {
        
        System.out.println("Cada animal tem seu som");
    }
}
