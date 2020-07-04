package Core;

import java.util.Scanner;

public class LoopsWhilleAndDoWhile {

    public static void main(String[] args) {

        Scanner value = new Scanner(System.in);
        int a;

        do {
            System.out.println("Введите 5");
            a = value.nextInt();
        } while (a != 5 );
        System.out.println("Вы ввели 5!");
    }
}