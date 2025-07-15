
package Datas;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;


public class Local {
    
    public static void main(String[] args) {
        //DATA LOCAL
        LocalDate d01 = LocalDate.now();
        System.out.println("d01: " + d01);
        
        LocalDateTime d02 = LocalDateTime.now();
        System.out.println("d02: " + d02);
        
        //DATA GLOBAL, PADRAO 3HORAS A FRENTE, HORAIRO DE LONDRES
        Instant d03 = Instant.now();
        System.out.println("d03: " + d03);
    }   
    
}
