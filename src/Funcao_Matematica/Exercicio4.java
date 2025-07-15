
package Funcao_Matematica;

import java.util.Scanner;


public class Exercicio4 {

  
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

            // Leitura dos dados
        System.out.print("Digite o número do funcionário: ");
        int numeroFuncionario = sc.nextInt();

        System.out.print("Digite o número de horas trabalhadas: ");
        int horasTrabalhadas = sc.nextInt();

        System.out.print("Digite o valor que recebe por hora: ");
        double valorPorHora = sc.nextDouble();

        // Cálculo do salário
        double salario = horasTrabalhadas * valorPorHora;

        // Saída formatada
        System.out.printf("Número = %d%n", numeroFuncionario);
        System.out.printf("Salário = R$ %.2f%n", salario);

        sc.close();
		
		
    }
    
}
