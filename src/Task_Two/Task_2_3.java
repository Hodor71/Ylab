package Task_Two;

public class Task_2_3 {
    public static void main(String[] args) {
        // 1. Создать объект типа Cat 2 раза.
        class Cat {
        }
        Cat CatOne = new Cat();
        Cat CatTwo = new Cat();
        // 2.Создать 3 объекта типа Dog (собака) и присвоить им имена "Max", "Bella", "Jack".

        class Dog {
            String name;
        }
        Dog Max = new Dog();
        Dog Bella = new Dog();
        Dog Jack = new Dog();

        Max.name = "Max";
        Bella.name = "Bella";
        Jack.name = "Jack";

        /* 3.Напиши программу, которая выводит на экран надпись:
         «Мне так плохо! Хочу, чтобы все умерли!».*/

        System.out.print("Мне так плохо! Хочу, чтобы все умерли!");
    }
}



