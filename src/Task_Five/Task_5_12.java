package Task_Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task_5_12 {

    public static class Man {
        private String name;
        private int age;
        private String address;
        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public String toString() {
            return name + " " + age + " " + address;
        }
    }
    public static class Woman {
        private String name;
        private int age;
        private String address;
        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public String toString() {
            return name + " " + age + " " + address;
        }
    }

    public static void main(String[] args) throws IOException {
        /* 2.
           1. Внутри класса Solution создай public static классы Man и Woman.
           2. У классов должны быть поля: name(String), age(int), address(String).
           3. Создай конструкторы, в которые передаются все возможные параметры.
           4. Создай по два объекта каждого класса со всеми данными, используя конструктор.
           5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].*/
        Man man1 = new Man("Oleg", 22, "Moscow");
        Man man2 = new Man("Vasya", 23, "Moscow");
        Woman woman1 = new Woman("Olya", 36, "Moscow");
        Woman woman2 = new Woman("Sofi", 25, "Moscow");
        System.out.println(man1);
        System.out.println(man2);
        System.out.println(woman1);
        System.out.println(woman2);

        // 3.
        Dog Spaik = new Dog("Spaik", 6,32);
        Cat Tom = new Cat("Tom", 8,7);
        Mouse Jerry = new Mouse("Jerry", 3, 0.2);

        /* 4. Вывести на экран сегодняшнюю дату.
          Вывести на экран текущую дату в аналогичном виде «21 06 2015».*/

        DateTimeFormatter dmy = DateTimeFormatter.ofPattern("dd MM yyy");
        LocalDate localDate = LocalDate.now();
        System.out.println(dmy.format(localDate));

        /* 5.Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма».
          Вывести на экран полученную сумму.*/
        int i = 0;
        int summa = 0;
        String control;
        String stop = "сумма";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (1 > 0) {
            control = reader.readLine();
            if (control.equals(stop))
                break;
            i = Integer.parseInt(control);
            summa = summa + i;
        }
        System.out.println(summa);

        /* Доп.3.Задача по алгоритмам. Задача: Написать программу, которая:
            1. вводит с консоли число N > 0
            2. потом вводит N чисел с консоли
            3. выводит на экран максимальное из введенных N чисел.*/
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader1.readLine());
        int max;
        int number ;
        max = Integer.parseInt(reader1.readLine());
        for (int j =0; j < n-1; j++ )
        {
            number = Integer.parseInt(reader1.readLine());
            if (number > max)
                max = number;
        }
        System.out.println(max);
    }



    /* 3.Создай public static классы Dog, Cat. Добавь по три поля в каждый класс, на твой выбор.
        Создай объекты для героев мультика Том и Джерри. Так много, как только вспомнишь.*/
    public static class Dog {
        private String name;
        private int age;
        private int weight;

        public Dog(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }
    }
    public static class Cat {
        private String name;
        private int age;
        private int weight;

        public Cat(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }
    }
    public static class Mouse {
        private String name;
        private int age;
        private double weight;

        public Mouse(String name, int age, double weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }
    }


}
