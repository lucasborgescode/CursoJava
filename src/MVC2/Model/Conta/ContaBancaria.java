
package MVC2.Model.Conta;

import MVC2.Model.Exceptions.DomainException;


public class ContaBancaria {
    
    private Integer numero;
    private String titularConta;
    private final double limiteSaque;
    private double saldo;

    public ContaBancaria(Integer numero, String titularConta, double limiteSaque, double saldo) {
        this.numero = numero;
        this.titularConta = titularConta;
        this.limiteSaque = limiteSaque;
        this.saldo = saldo;
    }
    //METODO PARA DEPOSITAR E EXCESSOES CASO HAJA ERRO
    public void depositar(double valor) throws DomainException {
        if(valor < 0) {
            throw new DomainException("Digite um valor maior que 0.");
        }else {
            this.saldo += valor;
            System.out.println("Valor após o deposito" + saldo);
        }
    }
    //METODO PARA SACAR VERIFICANDO O LIMITE DE SAQUE E EXCESSOES CASO HAJA ERRO
    public void sacar(double valor) throws DomainException {
        if(valor > 0 && valor < limiteSaque) {
            this.saldo -= valor;
            System.out.println("Valor após o saque: " + saldo);
        } else {
            throw new DomainException("Erro no saque. Verifique se o valor é maior que 0 e se esta dentro do limite da conta.");
        }
    }
    
    
    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTitularConta() {
        return titularConta;
    }

    public void setTitularConta(String titularConta) {
        this.titularConta = titularConta;
    }
    public double getLimiteSaque() {
        return limiteSaque;
    }

    public double getSaldo() {
        return saldo;
    }
    
    @Override
    public String toString() {
        return "Numero conta: "
                + numero
                + ", Titular: "
                + titularConta
                + ", limite de saque: "
                + limiteSaque
                + ", saldo: "
                + saldo;
    }
    
    
    
    
    
}
