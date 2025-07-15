package Array_Multidimensional;

public class NewMain {

    public static void main(String[] args) {
        // Primeiro array representa os meses
        // Segundo array representa os dias do mes

        /*Array multidimensionais sao array aninhados, ou seja,
        array dentro de array
         */
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
        
        for(int i = 0; i < dias.length; i++) {
            for( int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }

    }

}
