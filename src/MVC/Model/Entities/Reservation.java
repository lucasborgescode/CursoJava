
package MVC.Model.Entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;


public class Reservation {
    
    private Integer roomNumber;
    private Date checkin;
    private Date checkout;
    
    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation(int roomNumber, Date checkin, Date checkout) {
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }
    
    //CALCULO DURACAO/DIFERENÇA ENTRE DATAS
    public long duration() {
        long diff = checkout.getTime() - checkin.getTime(); //AQUI OBTEM A DIFERENÇA DE DIAS EM MILISEGUNDOS
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
        //AQUI RETORNA E CONVERTE A DIFERENÇA DE DIAS EM MILISEGUNDOS PARA DIAS
    }
    
    public void validacao(Date checkin, Date checkout) {
        //LOGÍCA VALIDAÇÃO DAS DATAS DE CHECK-IN E CHECK-OUT
        Date now = new Date();
            
                if (checkin.before(now) || checkout.before(now)) {
                    throw new IllegalArgumentException("As datas informadas devem ser futuras ou atuais!");
                }else if (!checkout.after(checkin)) {
                    throw new IllegalArgumentException("A data de check-Out deve ser após o check-In");
                } else {
                    this.checkin = checkin;
                    this.checkout = checkout;
                }
            }
    
    
    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckin() {
        return checkin;
    }

    public Date getCheckout() {
        return checkout;
    }
    
    @Override
    public String toString() {
        return "Room" 
                + roomNumber
                + ", Date check-In: "
                + checkin
                + sdf.format(checkin)
                + ", Date check-Out: "
                + checkout
                + sdf.format(checkout)
                + ", "
                + duration()
                + "noites.";
                
                
    }
}
    

