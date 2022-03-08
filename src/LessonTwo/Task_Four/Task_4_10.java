package Task_Four;
import java.util.Scanner;

public class Task_4_10 {
    public static void main(String[] args) {
        // 1.Вывести на экран числа от 1 до 10, используя цикл while.
        int number = 1;
        while (number <= 10) {
            System.out.println(number);
            number++;
        }

        // 2. Вывести на экран числа от 10 до 1, используя цикл while.
        int number_1 = 10;
        while (number_1 >= 1) {
            System.out.println(number_1);
            number_1--;
        }

        // 3.Ввести с клавиатуры строку и число N. Вывести на экран строку N раз, используя цикл while.
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int number_2 = scanner.nextInt();
        int i = 0;
        while (i != number_2) {
            System.out.println(string);
            i++;
        }

        /* 4.Вывести на экран квадрат из 10х10 букв S используя цикл while.
        Буквы в каждой строке не разделять.*/
        int ii = 0;
        while (ii < 10) {
            int j = 0;
            while (j < 10) {
                System.out.print("S");
                j++;
        }
            System.out.println("");
            ii++;
        }

        /* 5.Вывести на экран таблицу умножения 10х10 используя цикл while.
          Числа разделить пробелом.*/
        int n = 1;
        while (n <= 10) {
            int m = 1;
            while (m <= 10) {
                System.out.print(n * m + " ");
                m++;
            }
            System.out.println("");
            n++;
        }
    }
}
