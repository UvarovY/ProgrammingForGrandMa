package Core;

public class ClassesAndObjects {

    final int AGE_TO_PENS = 65;

    public static void main(String[] args) {

        Person person1 = new Person();
        person1.setName("Age", 10);
        String s1 = "Lusja";
        int a1 = 10000;
        person1.setName(s1, a1);
        String ps = person1.speakPerson();

        Person person2 = new Person();
        person2.setName("ANKA", 20);
        String ps2 = person2.speakPerson();

    }
}


class Person {
        String name = "defoult name";
        int age = 23;


        void setName(String x, int a){
         this.name = x;
         this.age = a;
        }


String speakPerson(){

             System.out.println(name + " " + age);
             return name + age;
        }
    }
