
package MVC2.Model.Exceptions;


public class DomainException extends Exception{
    
    public static final long serialVersionUID = 1L;
    
    public DomainException(String message) {
        super(message);
    }
}
