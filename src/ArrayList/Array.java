
package ArrayList;

import java.util.ArrayList;
import java.util.List;


public class Array { 
    
    public  List<Produto> list = new ArrayList<>();
    
    public Array () {
        
        list.add(new Produto("Camiseta", 150.00));
        list.add(new Produto("Shorts", 99.00));
        list.add(new Produto("Tenis", 300.00));  
    }
    
   
}