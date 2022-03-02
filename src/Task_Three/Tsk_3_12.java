package Task_Three;
import java.util.Scanner;
public class Tsk_3_12 {
    public static void main(String[] args) {
        // 1.Жить хорошо, а хорошо жить еще лучше.
        System.out.println("Жить хорошо, а хорошо жить еще лучше");

        // 2.Вывести на экран десять раз надпись «Я не хочу изучать Java, я хочу большую зарплату»
        for (int i = 0; i <10; i++)
            System.out.println("Я не хочу изучать Java, я хочу большую зарплату");

        /* 3.Ввести с клавиатуры число n.
        Вывести на экран надпись «Я буду зарабатывать $n в час».*/

        Scanner scanner = new Scanner(System.in);
        int money = scanner.nextInt();
        System.out.println("Я буду зарабатывать $" + money + " в час.");
    }
}
