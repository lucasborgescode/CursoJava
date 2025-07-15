
package Enumeracao.EntitiesPedido;

import Enumeracao.Entities.Enum.OrderStatus;
import java.util.Date;


public class Order {
    
    private Integer Id;
    private Date data;
    private OrderStatus status;
    
    public Order() {
        
    }

    public Order(Integer Id, Date data, OrderStatus status) {
        this.Id = Id;
        this.data = data;
        this.status = status;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" + "Id=" + Id + ", data=" + data + ", status=" + status + '}';
    }
    
    
    
    
    
}
