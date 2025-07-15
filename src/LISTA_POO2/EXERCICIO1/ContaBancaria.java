
package LISTA_POO2.EXERCICIO1;


public class ContaBancaria {
    
    private int numero;
    private String nome;
    private double saldo;
    
    public ContaBancaria(int numero, String nome, double saldo) {
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
    }
    
    public double creditar(double valor) {
        System.out.println("Valor inicial de: " + this.saldo);
        if(valor > 0){
            this.saldo += valor;
        }
        return this.saldo;
    }
    
    public double debitar(double valor) {
        System.out.println("Valor + saldo creditado: " + this.saldo);
        if(valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
        }
        System.out.println("Valor debitado" + this.saldo);

        return this.saldo;
    }
}
