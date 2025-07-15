
package LISTA_EXERCICIOS.EXERCICIO1.EXERCICIO2.EXERCICIO3.EXERCICIO4.EXERCICIO5;


public class NewMain {

  
    public static void main(String[] args) {
        
        Gerente gerente = new Gerente("Vanessa", 5000, 0.25);
        
        System.out.println("Essa gerente ganha com o bonus o valor de R$" + gerente.salarioBonus());
        System.out.println("Salario liquido de R$" + gerente.getSalario());
    }
    
}
