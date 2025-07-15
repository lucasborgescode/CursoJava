
package POLIMORFISMO;


public class Computador extends Produto {
    
    public final static double IMPOSTO = 0.2;
    
    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        
        this.valor += IMPOSTO;
        return this.valor;
        
    }
    
}
