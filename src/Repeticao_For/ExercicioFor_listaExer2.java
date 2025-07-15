
package Repeticao_For;

import java.util.Scanner;


public class ExercicioFor_listaExer2 {

   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int in = 0;
        int out = 0;

        System.out.print("Quantos números serão digitados? ");
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.print("Digite um número: ");
            int X = sc.nextInt();

            if (X >= 10 && X <= 20) {
                in++;
            } else {
                out++;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");

        sc.close();
        
        
    }
    
}
