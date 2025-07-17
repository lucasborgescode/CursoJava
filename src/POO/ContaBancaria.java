
package POO;


public class ContaBancaria {
    protected int numero;
    protected String titular;
    protected double saldo;

    public ContaBancaria(int numero, String titular) {
        super();
        this.numero = numero;
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    //CREDITAR VALOR EM SALDO
    public void creditar(double valor) {
        this.saldo += valor;
    }
    
    public boolean debitar(double valor) {
        if(saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }
    
    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" + "numero=" + numero + ", titular=" + titular + ", saldo=" + saldo + '}';
    }
    
    
    
    
   
}
