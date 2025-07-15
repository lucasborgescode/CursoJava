
package Repeticao;

import java.util.Scanner;


public class ExercicioWhille {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        int x = sc.nextInt();
        int soma = 0;
        
        while(x != 0){
            soma += x;
            x = sc.nextInt();
            
        }
        System.out.println(soma);
        
        sc.close();
        
        
        
        
    }
    
}
