
package LISTA_POO2.EXERCICIO1;


public class NewMain {

   
    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa("Manu", 22, "Feminino");
        Produto produto = new Produto("PC", 5000.00, 10);
        ContaBancaria conta = new ContaBancaria(12345, "Duda", 12000);
        Livro livro = new Livro("Dev Java", "Lucas", 2025);
        
        double creditarValor = 375;
        double debitarValor = 7500;
        
        pessoa.ImprimirDados();
        System.out.println();
        
        produto.exibirDados();
        produto.calcularTotalEstoque();
        System.out.println();
        
        conta.creditar(creditarValor);
        conta.debitar(debitarValor);
        System.out.println();
        
        livro.exibirDados();
        
    }
    
}
