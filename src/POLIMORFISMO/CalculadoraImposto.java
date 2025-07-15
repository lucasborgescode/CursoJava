package POLIMORFISMO;

public class CalculadoraImposto {
    
    public static void calcularImpostoComputador(Computador computador) {
        
        double preco = computador.calcularImposto();
        System.out.println("Relatorio de imposto do computador");
        System.out.println("Computador: " + computador.getNome());
        System.out.println("Valor: " + computador.getValor());
        System.out.println("Imposto calculado: " + preco);
        
    }
    
    public static void calcularImpostoMonitor(Monitor monitor) {
        
        double preco = monitor.calcularImposto();
        System.out.println("Relatorio de imposto do monitor");
        System.out.println("Monitor: " + monitor.getNome());
        System.out.println("Valor: " + monitor.getValor());
        System.out.println("Imposto calculado: " + preco);
    }
}
