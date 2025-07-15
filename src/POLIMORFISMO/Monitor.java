
package POLIMORFISMO;


public class Monitor extends Produto{
    
    public final static double IMPOSTO = 0.06;
    
    public Monitor(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        this.valor += IMPOSTO;
        return this.valor;
    }
    
    
}
