
package POO_EXERCICIO;


public class Produto {
    public String nome;
    public double preco;
    public int qtde_estoque;
    
    
    public double totalValueInStock () {
        return preco * qtde_estoque;
    }
    
    public void addProducts (int qtde_estoque) {
        this.qtde_estoque += qtde_estoque;
    }
    
     public void removeProducts (int qtde_estoque) {
        this.qtde_estoque -= qtde_estoque;
    }
   
    
    
}
