
package Condicional;

import java.util.Scanner;


public class Exercicio {

   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite quantos minutos a pessoa usou o telefone: ");
        int minutos = sc.nextInt();
        
        double conta = 50;
        
        if(minutos > 100) {
            conta = (minutos - 100) * 2;
            System.out.println("Conta de" + conta + "Reais");
        }
        
        System.out.println("Digite quantos minutos a pessoa 2 usou o telefone: ");
        int minutos2 = sc.nextInt();
        double conta2 = 50;
        if(minutos2 < 100) {
            conta2 = conta2;
            System.out.println("Pagara" + conta2 + "Reais");
        }
        
       
        
    }
    
}
