
package Datas;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;


public class Convert_Global_Local {
    public static void main(String[] args) {
        
        Instant d01 = Instant.now();
        LocalDateTime r1 = LocalDateTime.ofInstant(d01, ZoneId.systemDefault());
        System.out.println(d01);
        System.out.println(r1);
    }
}
