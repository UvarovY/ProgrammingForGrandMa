package Core;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class MultiArrays {

    public static void main(String[] args) {

        int[] ma3 = new int[5];


        Random random = new Random();

        for (int i = 0; i < ma3.length; i++){
            ma3[i]=random.nextInt(10);
            System.out.print(ma3[i]+ " ");
        }

        System.out.println();

        Arrays.sort(ma3);

    for (int i = 0; i < ma3.length; i++){
        System.out.print(ma3[i]+" ");
    }



//        int[][] ma = {{1, 2, 3, 4, 5}, {5, 6, 6}, {7, 8, 9, 6}};
//
//
//        for (int i = 0; i < ma.length; i++) {
//            for (int j = 0; j < ma[i].length; j++) {
//                System.out.print(ma[i][j]);
//            }
//            System.out.println();
//        }


    }
}
