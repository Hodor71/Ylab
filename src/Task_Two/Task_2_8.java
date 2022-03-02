package Task_Two;
import java.util.Scanner;

public class Task_2_8 {

        //1.Написать функцию, которая возвращает минимум из двух чисел.

        public static double minTwo(double a, double b) {
            if (a < b)
                return a;
            else return b;
        }

        //2.Написать функцию, которая вычисляет максимум из двух чисел.

        public static double max(double a, double b) {
            if (a > b)
                return a;
            else return b;
        }

        //3.Написать функцию, которая вычисляет минимум из трёх чисел.
        public static double minThree(double a, double b, double c) {
            if (a < b && a < c)
                return a;
            else if (a >= b && b < c)
                return b;
            else return c;
        }

        /* 4.Написать функцию, которая вычисляет минимум из четырёх чисел.
         Функция min(a,b,c,d) должна использовать (вызывать) функцию min(a,b).*/

        public static double minFour(double a, double b, double c, double d) {

            if ((minTwo(a,b)) < c && (minTwo(a,b)) < d)
                return minTwo(a,b);
            else if (c < d)
                return c;
            else return d;
        }

        // 5.Написать функцию, которая выводит переданную строку на экран три раза, каждый раз с новой строки.

        public static void printThree(String string) {
            for (int i = 0; i < 3; i++)
                System.out.println(string);
        }

        /*Написать функцию, которая выводит переданную строку (слово) на экран три раза, но в одной строке.
         Слова должны быть разделены пробелом и не должны сливаться в одно*/

        public static void print_Three(String string) {
            System.out.print(string + " " + string + " " + string + "\n");
        }



        public static void main(String[] args) {
            // Проверка Функций
            Scanner sc = new Scanner(System.in);
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            double d = sc.nextDouble();
            //System.out.println(minTwo(a, b));
            //System.out.println(minThree(a, b, c));
            //System.out.println(minFour(a, b, c, d));
            //printThree("Hello!");
            //print_Three("Five!");

        }
}


