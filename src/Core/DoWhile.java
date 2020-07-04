package Core;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int value;

/*
        while (value != 5) {
            System.out.println("Вы ввели не 5 а: " + value);
            System.out.println("Еще раз введите 5");
            value = sc.nextInt();
        }
        System.out.println("Вы ввели 5, выполнение программы закончилось");

*/
        do {System.out.println("ВВедите 5");

            value = sc.nextInt();
        }
        while (value != 5);
        System.out.println("Вы ввели 5");
    }

}
