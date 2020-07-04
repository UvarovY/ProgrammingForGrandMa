package Core;

public class IfLoop {

    public static void main(String[] args) {

         int value = 6;

        if (value > 5) {
            System.out.println(value + " value" + " условие верное!");

        }
        else if(value > 3) {
            System.out.println(value + " value" + " условие НЕ верное, но value > 3");
        }
        else {
            System.out.println(value + " value" + " условие НЕ верное!");
        }
    }
}
