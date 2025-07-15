
package Funcao_Matematica;

import java.util.Scanner;


public class Exercicio2 {

   
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
       
        double pi = 3.14159;
        
        System.out.println("Digite o valor do raio: ");
        double raio = leia.nextDouble();
        
        double area = pi * raio * raio;
        
        System.out.println( "A area do circulo é: " + area);
        
    }
    
}
