
package Array_Multidimensional;


public class Array_Multidimensional_foreach {

   
    public static void main(String[] args) {
        
       int[][] dias = new int[3][3];
        dias[0][0] = 55;
        dias[0][1] = 27;
        dias[0][2] = 33;
        
        dias[1][0] = 150;
        dias[1][1] = 158;
        dias[1][2] = 10;
        
        dias[2][0] = 36;
        dias[2][1] = 91;
        dias[2][2] = 5;
        
        for(int[] i: dias) {
            for(int j: i) {
                System.out.println(j);
            }
        }
    }
    
}
