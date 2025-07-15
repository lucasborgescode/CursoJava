
package POO_EXERCICIO2;

import java.util.Scanner;


public class NewMain {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Retangulo obj = new Retangulo();
        
        System.out.println("Digite o valor da largura: ");
        obj.largura = sc.nextDouble();
        System.out.println("Digite o valor da altura: ");
        obj.altura = sc.nextDouble();
        
        double resultado_A, resultado_B, resultado_C;
        resultado_A = obj.Area();
        resultado_B = obj.Perimetro();
        resultado_C = obj.Diagonal();
        
        System.out.println("Area" + " " + resultado_A + ", " + "Perimetro" + " " + resultado_B + ", " + "Diagonal" + " " + resultado_C );

        
        
    }
    
}
