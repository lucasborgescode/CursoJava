
package Enumeracao.Aplicacao;

import Enumeracao.Entities.Enum.OrderStatus;
import Enumeracao.EntitiesPedido.Order;
import java.util.Date;


public class Program {
    
    public static void main(String[] args) {
            
        Order order = new Order(100, new Date(), OrderStatus.PAGAMENTO_PENDENTE);
        System.out.println(order);
    }
    
}
