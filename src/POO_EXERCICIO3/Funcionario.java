
package POO_EXERCICIO3;


public class Funcionario {
    public String nome;
    public double salarioBruto;
    public double imposto;
    public double desconto;
    double livre;
    
    public double SalarioLiquido() {
        livre = salarioBruto - imposto;
        return livre;
    }
    
    public double SalarioAumentado() {
        double aumentado = livre + (salarioBruto * desconto);
        
        return aumentado;
    }
        
    
    
}
