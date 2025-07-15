
package String;


public class ModificacaoString {

    public static void main(String[] args) {
        
        String original = "Lucas DEVELOPER Pleno 2026";
        
        String s1 = original.toLowerCase();
        
        String s2 = s1.toUpperCase();
        
        String s3 = "---abxdferduvkevc---      ";
        String espaco = s3.trim(); //Retira espaco final de frase
        
        /*Essa funcao recorta a frase de um ponto a outro, ou seja,
        do caracter 2 ao 9
        */
        String s4 = original.substring(2, 9);
        
         /*Troca uma letra determinada da frase por outra, no caso, 
        u por x
        */
        String s5 = original.replace("u", "x");
        
        /*O replace é case-sensitive, ou seja, se na frase Lucas começa maiusculo 
        e foi passa lucas minusculo no parametro, nao sera alterado
        */
        String s6 = original.replace("Lucas", "borges");

        
        System.out.println(original);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(espaco);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
        
        
    }
    
}
