
package Vetores;

import java.util.Scanner;

public class NewMain {

  
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        int numero = sc.nextInt();
        
        double[] vect = new double[numero];
        
        for(int i = 0; i < numero; i++) {
            vect[i] = sc.nextInt();            
        }
        
        double soma = 0.0;
        for(int i = 0; i < numero; i++) {
            soma += vect[i];
        }
        double avg = soma / numero;
        System.out.println(avg);
        
    }
    
}
