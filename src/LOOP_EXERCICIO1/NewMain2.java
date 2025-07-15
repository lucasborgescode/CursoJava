
package LOOP_EXERCICIO1;

import java.util.Scanner;


public class NewMain2 {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int numero;
        int soma = 0;
        
        System.out.println("Digite números para somar (0 para sair):");
        
        while (true) {
            System.out.print("Digite um número: ");
            numero = sc.nextInt();
            
            if (numero == 0) {
                break;
            }
            
            soma += numero;
        }
        
        System.out.println("A soma dos números digitados é: " + soma);
        
        sc.close();
    
}
}
