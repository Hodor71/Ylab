package Task_Four;
import java.util.Scanner;
public class Task_4_13 {
    public static void main(String[] args) {
        /* 1.Используя цикл for вывести на экран чётные числа от 1 до 100 включительно.
         Через пробел либо с новой строки.*/
         for (int i = 1; i <= 100; i++)
             if (i % 2 == 0)
                 System.out.print(i + " ");

         /* 2.Ввести с клавиатуры два числа m и n.
           Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.*/
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                System.out.print("8");
            System.out.println();
        }

        /* 3.Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.*/
        String a = "8";
        String b = "8";
        for (int i = 0; i < 10; i++) {
            System.out.println(a + " ");
            a = a + b;
        }

        /* 4.Используя цикл for вывести на экран:- горизонтальную линию из 10 восьмёрок
                                                 - вертикальную линию из 10 восьмёрок. */
        String string="8";
        for(int i=0;i<9;i++)
            System.out.print(string);
        for (int j = 0; j < 11; j++)
            System.out.println(string);

        /* 5.Ввести с клавиатуры имя и, используя цикл for 10 раз, вывести: [*имя* любит меня.]*/
        Scanner scName = new Scanner(System.in) ;
        String name = scName.nextLine();
        for (int i = 0; i < 10; i++)
            System.out.println(name + " любит меня.");

    }
}
