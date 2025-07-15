
package String;


public class Split {

    public static void main(String[] args) {
        
        /* O split separou o texto por espaço e jogou cada palavra
        em um indice do array criado
        */
        String s1 = "Lucas developer 2026";
        
        String[] vect = s1.split(" ");
        String word1 = vect[0];
        String word2 = vect[1];
        String word3 = vect[2];
        
        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);
    }
    
}
