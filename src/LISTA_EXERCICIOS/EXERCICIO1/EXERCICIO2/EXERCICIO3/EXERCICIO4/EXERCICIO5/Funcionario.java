
package LISTA_EXERCICIOS.EXERCICIO1.EXERCICIO2.EXERCICIO3.EXERCICIO4.EXERCICIO5;


public abstract class Funcionario {
    
    protected String nome;
    protected double salario;
    
    public Funcionario(String nome, double salario) {
        
        this.nome = nome;
        this.salario = salario;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
