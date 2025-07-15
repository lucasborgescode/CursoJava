
package ArrayList.Aulas;

import java.util.ArrayList;
import java.util.List;

public class Aula1 {
    
    public static void main(String[] args) {
        
         List<String> lista = new ArrayList<>();
         lista.add("Maria");
         lista.add("Alex");
         lista.add("Ana");
         
         //ADICIONANDO ALGO EM POSICAO ESPECIFICA
         lista.add(2, "Lucao Dev");
         //REMOVENDO ALGO EM POSICAO ESPECIFICA
         lista.remove(3);
         
         //IMPRIMINDO TAMANHO DA LISTA
         System.out.println(lista.size());
         
         
         for(String i: lista) {
             System.out.println(i);
         }
         
         System.out.println("***************");
         
         //ENCONTRANDO A POSICAO DE UM ELEMENTO
         System.out.println("Index of Lucao Dev: " + lista.indexOf("Lucao Dev"));
         System.out.println("Index of Marco: " + lista.indexOf("Marco"));

    }
    
   
}
