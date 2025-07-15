
package Repeticao;

import java.util.Scanner;


public class Exercicio6_listaExer {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int senhaCorreta = 2002;
        int tentativa = 0;
        
        
        while(tentativa != senhaCorreta) {
            
            System.out.println("Digite a senha");
            tentativa = sc.nextInt();
            
            if(tentativa == senhaCorreta) {
                System.out.println("Senha correta");
            } else {
                System.out.println("Senha Incorreta");
            }

        }
    }
    
}
