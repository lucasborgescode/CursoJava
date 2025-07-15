
package Repeticao_For;

import java.util.Scanner;


public class ExercicioFor_listaExer {

   
    public static void main(String[] args) {
        /* 
        O codigo abaixo varre o for e imprimi todos os
        numeros impares de 0 ate o numero digitado
        */
        
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Digite um numero: ");
         int num = sc.nextInt();
         
         for(int i = 0; i < num; i++) {
             if(i % 2 != 0) {
                 System.out.println(i);
             }
         }
         
         
    }
    
}
