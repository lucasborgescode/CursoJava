
package MVC2.Model.Aplicacao;

import MVC2.Model.Conta.ContaBancaria;
import MVC2.Model.Exceptions.DomainException;
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) throws DomainException {
        
        Scanner sc = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria(123, "Joao", 500.00, 10000.00 );
        
        while(true) {
            try {
                System.out.println("*****INICIO PROGRAMA *****");
                System.out.println("Digite o valor que deseja depositar: ");
                double depositarValor = sc.nextDouble();
                conta.depositar(depositarValor);
                
                System.out.println("Digite o valor que deseja sacar: ");
                double sacarValor = sc.nextDouble();
                conta.sacar(sacarValor);
                break;
                
            }catch (DomainException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("***** DADOS FINAIS DA CONTA *****");
        System.out.println(conta);
    }
}
