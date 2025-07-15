
package SwitchCase;

import java.util.Scanner;


public class SwitchCase {

   
    public static void main(String[] args) {
        
        /*
        Quando se tem varias opcoes de fluxo a serem tratadas em cima do valor
        de uma mesma variavel, usamos o SWITCH CASE para evitar a repetição de muitos
        if e elses.
        */
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        int x = sc.nextInt();
        String dia;
        
        switch(x) {
            case 1: 
                dia = "domingo";
                break;
            
            case 2: 
                dia = "segunda";
                break;
            
            case 3: 
                dia = "terça";
                break;
            
            case 4: 
                dia = "quarta";
                break;
            
            case 5: 
                dia = "quinta";
                break;
            
            case 6: 
                dia = "sexta";
                break;
            
            case 7: 
                dia = "sabado";
            
            default: 
                dia = "valor invalido";
                break;
        }
        System.out.println("Dia da semana: " + dia);
        
    }
    
}
