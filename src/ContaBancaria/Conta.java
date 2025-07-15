
package ContaBancaria;


public class Conta {
    
    private int numeroConta;
    private String nomeTitular;
    private double saldo;
    double valor;
    
    public Conta(int numeroConta, String nomeTitular, double saldo) {
        super();
        this.saldo = saldo;
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        
    }
    
    public double creditar(double valor) {
        if(valor > 0) {
            this.saldo += valor;
        }
        return this.saldo;
    }
    
    public double debitar(double valor) {
        if(valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
        }else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
        return this.saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

}
    
    
