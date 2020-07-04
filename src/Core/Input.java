package Core;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Input {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("НАпиши что то и нажмаите Ентер");
        String str = s.nextLine();
        System.out.println("Вы ввели: "+str);

    }

}
