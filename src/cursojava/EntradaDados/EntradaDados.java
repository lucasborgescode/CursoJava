
package cursojava.EntradaDados;

import java.util.Scanner;

public class EntradaDados {

    
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);
         
         String nome;
         int idade;
         int ano;
         
         

            
            System.out.println("Digite seu nome: ");
            nome = input.nextLine();
            System.out.println(nome);
            

            System.out.println("Digite sua idade: ");
            idade = input.nextInt();
            System.out.println(idade);


            System.out.println("Digite o ano: ");
            ano = input.nextInt();
            System.out.println(ano);
            
          
            
            
    }
    
}
