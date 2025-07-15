
package ContaBancaria;

import java.util.Scanner;


public class NewMain {

    public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);
       
       Conta obj = new Conta(12345, "Lalaxixa", 500.00);
       
       System.out.println("Saldo atual: " + obj.getSaldo());
       
       System.out.println("Digite o valor que deseja creditar: ");
       double valorCredito = sc.nextDouble();
       obj.creditar(valorCredito);
       
       System.out.println("Saldo creditado: " + obj.getSaldo());
       
       System.out.println("Digite o valor que deseja debitar: ");
       double valorDebitado = sc.nextDouble();
       obj.debitar(valorDebitado);
       
        System.out.println("Saldo debitado. Total de: " + obj.getSaldo());
       
      
       
       //System.out.println("Saldo Creditado: " + obj.getSaldo());
       
        
    }
    
}
