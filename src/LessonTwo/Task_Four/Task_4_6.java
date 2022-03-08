package Task_Four;
import java.util.Scanner;
public class Task_4_6 {
    public static void main(String[] args) {

        // 1.Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
        Scanner scanner = new Scanner(System.in);
        double first =scanner.nextDouble();
        double second = scanner.nextDouble();
        System.out.println(first < second ? first : second);

        // 2.Ввести с клавиатуры четыре числа, и вывести максимальное из них.
        Scanner scanner1 = new Scanner(System.in);
        double one = scanner1.nextDouble();
        double two = scanner1.nextDouble();
        double three = scanner1.nextDouble();
        double four = scanner1.nextDouble();
        if (one > two && one >three && one > four)
            System.out.println(one);
        else if (two > three && two > four)
            System.out.println(two);
        else if (three > four)
            System.out.println(three);
        else System.out.println(four);

        // 3.Ввести с клавиатуры три числа, и вывести их в порядке убывания.
        Scanner scanner2 = new Scanner(System.in);
        double number_1 = scanner2.nextDouble();
        double number_2 = scanner2.nextDouble();
        double number_3 = scanner2.nextDouble();
        if (number_1 > number_2 && number_1 > number_3 && number_2 > number_3)
            System.out.println(number_1 + " " + number_2 + " " + number_3);
        else if (number_1 > number_2 && number_1 > number_3 && number_2 < number_3)
            System.out.println(number_1 + " " + number_3 + " " + number_2);
        else if (number_1 < number_2 && number_1 > number_3 && number_2 > number_3)
            System.out.println(number_2 + " " + number_1 + " " + number_3);
        else if (number_1 < number_2 && number_1 < number_3 && number_2 > number_3)
            System.out.println(number_2 + " " + number_3 + " " + number_1);
        else if (number_1 < number_2 && number_1 < number_3 && number_2 < number_3)
            System.out.println(number_3 + " " + number_2 + " " + number_1);
        else System.out.println(number_3 + " " + number_1 + " " + number_2);

        /* 4.Ввести с клавиатуры два имени, и если имена одинаковые, вывести сообщение «Имена идентичны».
          Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».*/
        Scanner scanner_3 = new Scanner(System.in);
        String nameOne = scanner_3.nextLine();
        String nameTwo = scanner_3.nextLine();
        if (nameOne.equals(nameTwo))
            System.out.println("Имена идентичны");
        else if (nameOne.length() == nameTwo.length())
            System.out.println("Длины имен равны");

        // 5.Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись «Подрасти еще».
        Scanner scanner_4 = new Scanner(System.in);
        String firstName = scanner_4.nextLine();
        double age = scanner_4.nextDouble();
        System.out.println(age < 18 ? "Подрасти еще" : "");

        // 6.Ввести с клавиатуры имя и возраст. Если возраст больше 20 вывести надпись «И 18-ти достаточно».
        Scanner scanner_5 = new Scanner(System.in);
        String firstNameOne = scanner_5.nextLine();
        double year = scanner_5.nextDouble();
        System.out.println(year > 20 ? "И 18-ти достаточно" : "");

    }

}
