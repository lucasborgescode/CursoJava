
package POO;


public class NewMain {

    
    public static void main(String[] args) {
        
        ContaBancaria c1 = new ContaBancaria(123, "Lucas");
        ContaEspecial c2 = new ContaEspecial(124, "jose", 200);
        
        c1.creditar(100);
        c2.creditar(100);
        
        System.out.println(c1);
        System.out.println(c2);
        
        if (c1.debitar(150)) {
            System.out.println("Debito efetuado");
        } else {
            System.out.println("Saldo insuficiente para conta " + c1.getNumero());
        }
        
         if (c2.debitar(150)) {
            System.out.println("Debito efetuado");
        } else {
            System.out.println("Saldo insuficiente para conta " + c2.getNumero());
        }
    }
    
}
