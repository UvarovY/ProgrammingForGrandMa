package Core;

public class Break_Continue {

    public static void main(String[] args) {

        int i;

        for(i=0; i <=16; i++){
            if(i%2>0){
                continue;
            }
            System.out.println(" Четное число выводим "+i);
        }
        System.out.println("Цикл завершен");
    }
}
