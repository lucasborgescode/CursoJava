
package POO_EXERCICIO;

import java.util.Locale;
import java.util.Scanner;


public class NewMain {

    
    public static void main(String[] args) {
        
      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);
      
      
      Produto pd = new Produto();
      
        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        pd.nome = sc.nextLine();
        System.out.println("Preço: ");
        pd.preco = sc.nextDouble();
        System.out.println("Quantidade no estoque: ");
        pd.qtde_estoque = sc.nextInt();
        
        System.out.println(pd.nome + ", " + pd.preco + ", " + pd.qtde_estoque);
        
        sc.close();
      
    }
    
}
