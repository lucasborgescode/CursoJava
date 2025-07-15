
package TratamentoExcecoes;


public class Exercicio1 {
    
    private double preco;
    private double entrada;
    private int parcelas;

    public Exercicio1(double preco, double entrada, int parcelas) {
        
        if (entrada < preco * 0.2) {
            throw new RuntimeException("A entrada minima é de 20% do valor");
        } else if (parcelas < 6) {
            throw new RuntimeException("O minimo de parcelas são 6");
        }else{
            
            this.preco = preco;
            this.entrada = entrada;
            this.parcelas = parcelas;
        }
        
        
    }
    
    public double precoAPagar() {
        return (preco - entrada) - parcelas;
    }
    
    
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getEntrada() {
        return entrada;
    }

    public void setEntrada(double entrada) {
        this.entrada = entrada;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }
    
    
    
    
    public static void main(String[] args) {
        
        
        try {  
            Exercicio1 obj = new Exercicio1(5000, 1500, 10);
            System.out.println("O valor de cada parcela é " + obj.precoAPagar());
        } catch(RuntimeException e) {
            System.out.println(e.getMessage());
        }
        
    }
}
