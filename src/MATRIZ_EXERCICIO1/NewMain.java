
package MATRIZ_EXERCICIO1;

import java.util.Scanner;

public class NewMain {

  
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        int [][] numeros = new int [3][3];
        
        System.out.println("Digite o numeros da matriz: ");
        
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.println("elemento" + " " + i + " " + j + " ");
                numeros[i][j] = sc.nextInt();
        }
    }
        
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.println(numeros[i][j]);
        }
            System.out.println();
    }
    
}
}
