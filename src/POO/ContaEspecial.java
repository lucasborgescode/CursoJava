
package POO;
/*Quando é criado uma classe que herda de uma classe pai,
é obrigatorio realizar a chamada de um constutor com base 
na classe pai
*/
public class ContaEspecial extends ContaBancaria {
    private double limiteConta;

   public ContaEspecial(int numero, String titular, double limiteConta) {
       super(numero, titular);
       this.limiteConta = limiteConta;
   }
   
   public boolean debitar(double valor) {
       if(super.saldo + this.limiteConta >= valor) {
           super.saldo -= valor;
           return true;
       }
       return false;
   }

    public double getLimiteConta() {
        return limiteConta;
    }
    public void setlimiteConta(double limiteConta) {
            this.limiteConta = limiteConta;
    }
    
    @Override
    public String toString() {
        return "ContaBancaria{" + "numero=" + numero + ", titular=" + titular + ", saldo=" + saldo + ", limiteConta" + limiteConta + '}';
    }
    
   
   
}
