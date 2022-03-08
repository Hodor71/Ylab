package Task_Four;

import java.util.Scanner;

public class Task_4_16 {
    public static void main(String[] args) {
        // 1.Используя цикл вывести на экран сто раз надпись: «Я никогда не буду работать за копейки. Амиго»
        for (int i = 0; i < 100; i++)
            System.out.println("Я никогда не буду работать за копейки. Амиго");

        // 2.Ввести с клавиатуры три числа, вывести на экран среднее из них, т.е. не самое большое и не самое маленькое.
        double one, two, three;
        Scanner scanner = new Scanner(System.in);
        one = scanner.nextDouble();
        two = scanner.nextDouble();
        three = scanner.nextDouble();
        if ( one > two && two > three || one < two && two < three)
            System.out.println(two);
        else if (one < two && one > three || one < three && one > two)
            System.out.println(one);
        else System.out.println(three);

        /* 3.Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1,
          вывести на экран сумму и завершить программу. -1 должно учитываться в сумме.*/
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int  sum =num;
        while (num!=-1) {
            num = sc.nextInt();
            sum=sum+num;
        }
        System.out.print(sum);

        /* 4. Ввести с клавиатуры строку name. Ввести с клавиатуры дату рождения (три числа): y, m, d.
        Вывести на экран текст:
        «Меня зовут name
        Я родился d.m.y»*/
        Scanner scanner1 = new Scanner(System.in);
        String name_1 = scanner1.nextLine();
        int y = scanner1.nextInt();
        int m = scanner1.nextInt();
        int d = scanner1.nextInt();
        System.out.println("Меня зовут " + name_1);
        System.out.println("Я родился " + d +"." + m + "." + y);
    }
}
