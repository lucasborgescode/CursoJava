
package ArrayList;


public class NewMain {

  
    public static void main(String[] args) {
        
        Array obj = new Array();
        
        for( Produto p : obj.list) {
            System.out.println("Itens " + p.getNome());
            System.out.println("Valor " + p.getPreco());
        }
    }
    
}
