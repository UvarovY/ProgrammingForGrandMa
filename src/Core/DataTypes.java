package Core;

import Core.Constants.*;

import static Core.Constants.PAGE_SIZE;
import static Core.Constants.PAGE_WEIGHT;


public class DataTypes {



    public static void main(String [] args) {

        long myLong = 64L;
        int myInt = 32;
        short myShort = 16;
        byte myBite = 8;

        /*-----*/
        float myFloat = 4F;
        double myDouble = 8D; //tochnost vdvoe vishe float.
        /*--------------*/

        char myChar = 'A';
        boolean myBoolean = false;
       String  h = "Hello";
       String  s = " ";
       String n= "Bob!";

       String name2 = h + s + n;

       System.out.println(name2);

            System.out.println("Размер страницы в сантимерах " + PAGE_SIZE);
            System.out.println("Вес сраницы в сантимерах " + PAGE_WEIGHT);



    }
}
