package Core;

import java.util.Scanner;

public class Swith {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи возраст");
        String age = sc.nextLine();

        switch(age){
            case "ноль" :
                System.out.println("новорожденный");
                break;
            case "десять" :
                System.out.println("Ходишь в школу");
                break;
            case "восемнадцать" :
                System.out.println("Поступил в университет");
                 break;
                 default:
                     System.out.println("Ни один возраст не подходит");

        }

        }
    }

