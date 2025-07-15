
package LISTA_EXERCICIOS.EXERCICIO1.EXERCICIO2.EXERCICIO3;


public class NewMain {

  
    public static void main(String[] args) {

        Produto produto = new Produto("Curso Javeiro", 1500);
        
        System.out.println("O valor do curso com desconto é de R$" + produto.calcularDesconto());
    }
    
}
