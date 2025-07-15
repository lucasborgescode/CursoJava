
package Condicional;

import java.util.Scanner;

public class Condicional {

  
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        int number = sc.nextInt();
        if(number < 0) {
            System.out.println("Numero negativo");
        } else {
            System.out.println("numero positivo");
        }
        
        System.out.println("Digite outro numero: ");
        int number2 = sc.nextInt();
        if (!(number2 < 0)) {
            System.out.println("Numero positivo");
        }else {
            System.out.println("Numero negativo");
        }
    }
    
}
