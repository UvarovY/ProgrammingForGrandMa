package Core;

public class Arrays {

    public static void main(String[] args) {

        int[] numbers = new int [5];

        for (int i = 0; i < numbers.length; i++){
         numbers[i] = i*2;
            System.out.println(numbers[i]);
        }
        System.out.println();


        java.util.Arrays.sort(numbers);

       for (int h:numbers){
           System.out.println(h);
       }


    }
}
