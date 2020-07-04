package Core;
public class ArraysOfString {
    public static void main(String[] args) {
        String[] numbers = new String[5];
        numbers[0] = "Нулевой елемент масссива!";
        numbers[1] = "Первый елемент масссива!";
        numbers[2] = "Второй елемент масссива!";
        numbers[3] = "Третий елемент масссива!";
        numbers[4] = "Четвертый елемент масссива! из пяти элементов";

        int i;
        for(i = 0; i <numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        for (String j:numbers)
              {
                  System.out.println(j);
          }
  int[] num2 = new int[5];
        int[] num3 = {10, 20, 30, 40, 50};

        int sum = 0;
        for (int h : num3) {
            System.out.println(h);
            sum = sum + h;
            System.out.println("Сумма выглядит так " + sum);
        }

        System.out.println("Результирующая сумма: " + sum);

    }
    }
