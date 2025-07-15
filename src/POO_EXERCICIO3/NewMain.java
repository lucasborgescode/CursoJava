
package POO_EXERCICIO3;

import java.util.Scanner;


public class NewMain {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Funcionario obj = new Funcionario();
        
        System.out.println("Digite seu nome: ");
        obj.nome = sc.nextLine();
        System.out.println("Digite seu salario bruto: ");
        obj.salarioBruto = sc.nextDouble();
        System.out.println("Digite o imposto sobre o salario: ");
        obj.imposto = sc.nextDouble();
        
        System.out.println("nome: " + obj.nome + ", " + obj.SalarioLiquido());
        
        System.out.println("Digite a porcentagem de desconto em cima do salario bruto: ");
        obj.desconto = sc.nextDouble();
        
        System.out.println("nome: " + obj.nome + ", " + obj.SalarioAumentado());
        
        
        
    }
    
}
