
package TratamentoExcecoes;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Aula1 {
    
    /*UMA EXCEÇÃO É QUALQUER CONDIÇÃO DE ERRO OU COMPORTAMENTO 
    INESPERADO ENCONTRADO POR UM PROGRAMA EM EXECUÇÃO*/
    
    public static void main(String[] args) {
        
        metodo2();
        System.out.println("Fim do programa");

    }
    
    public static void metodo2() {
        
        Scanner sc = new Scanner(System.in);
        
        try{
        String[] vect = sc.nextLine().split(" ");
        int posicao = sc.nextInt();
        System.out.println(vect[posicao]);
        
        //CATCH DE ARRAYS
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Posicao invalida");
            
            //CATCH DE ENTRADA DE DADOS
        }catch(InputMismatchException e) {
            System.out.println("Digite um numero inteiro");
        }
      
        sc.close();
    } 
}
