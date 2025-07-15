
package MVC.Model.Application;

import MVC.Model.Entities.Reservation;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Program {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        while(true) {
            try {
                System.out.println("Digite o numero do quarto: ");
                int number = sc.nextInt();
                System.out.println("Digite a data de check-in: ");
                Date checkin = sdf.parse(sc.next());
                System.out.println("Digite a data de check-out: ");
                Date checkout = sdf.parse(sc.next());
                
                Reservation reservation = new Reservation(number, checkin, checkout);
                reservation.validacao(checkin, checkout);
                System.out.println("Reserva criada com sucesso!!");
                System.out.println(reservation);
                break;
                
            } catch (ParseException e) {
                System.out.println("ERRO: " + e.getMessage());
            }catch (IllegalArgumentException e) {
                System.out.println("ERRO: " + e.getMessage());
            }
        }
        
    }
}
