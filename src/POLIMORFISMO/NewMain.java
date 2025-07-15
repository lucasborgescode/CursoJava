
package POLIMORFISMO;


public class NewMain {

   
    public static void main(String[] args) {
        
        Computador computador = new Computador("Macbook", 2500 );
        Monitor monitor = new Monitor("APPLE", 5000);
        
        CalculadoraImposto.calcularImpostoComputador(computador);
        System.out.println("********************************");
        CalculadoraImposto.calcularImpostoMonitor(monitor);
        
        
    }
    
}
