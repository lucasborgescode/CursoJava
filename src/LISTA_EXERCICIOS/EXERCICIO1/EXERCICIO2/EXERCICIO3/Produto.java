
package LISTA_EXERCICIOS.EXERCICIO1.EXERCICIO2.EXERCICIO3;


public class Produto {
    
    private String nome;
    private double preco;
    private final static double desconto = 0.35;
    
    public Produto(String nome, double preco) {
        
        this.nome = nome;
        this.preco = preco;
    }
    
    public double calcularDesconto() {
        
        double valor = this.preco * desconto;
        return this.preco - valor;
        
    }
}
