
package POO_EXERCICIO4;

import java.util.Scanner;


public class NewMain {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Aluno obj = new Aluno();
        obj.name = sc.nextLine();
        obj.grade1 = sc.nextDouble();
        obj.grade2 = sc.nextDouble();
        obj.grade3 = sc.nextDouble();
        System.out.printf("FINAL GRADE: %.2f%n", obj.finalGrade());
        if (obj.finalGrade() < 60.0) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", obj.missingPoints());
        } else {
            System.out.println("PASS");
        }
        sc.close();
    }

}
