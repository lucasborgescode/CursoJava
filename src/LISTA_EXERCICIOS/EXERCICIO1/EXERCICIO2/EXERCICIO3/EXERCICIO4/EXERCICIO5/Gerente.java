
package LISTA_EXERCICIOS.EXERCICIO1.EXERCICIO2.EXERCICIO3.EXERCICIO4.EXERCICIO5;


public class Gerente extends Funcionario{
    
    private double bonus;
    
    public Gerente(String nome, double salario, double bonus) {
        super(nome, salario);
        this.bonus = bonus;
    }
    
    public double salarioBonus() {
        
        double salarioTotal = this.salario * bonus;
        return this.salario + salarioTotal;
        
    }
    
}
