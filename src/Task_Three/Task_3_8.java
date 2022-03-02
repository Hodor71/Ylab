package Task_Three;
import java.util.Scanner;

public class Task_3_8 {

    public static void main(String[] args) {
        /* 1.Ввести с клавиатуры число и имя, вывести на экран строку:
            «имя» захватит мир через «число» лет. Му-ха-ха! */

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        System.out.println(name + " захватит мир через " + age + " лет. Му-ха-ха!");

        /* 2.Ввести с клавиатуры отдельно Имя, число1, число2. Вывести надпись:
         «Имя» получает «число1» через «число2» лет.*/

        Scanner sc = new Scanner(System.in);
        String name2 = sc.nextLine();
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        System.out.println(name2 + " получает " + number1 + " через " + number2 + " лет.");

        /* 3.Ввести с клавиатуры имя и вывести надпись:
            name зарабатывает $5,000. Ха-ха-ха!*/

        Scanner sc1 = new Scanner(System.in);
        String name3 = sc1.nextLine();
        System.out.println(name3 + " зарабатывает $5,000. Ха-ха-ха!");

        /* 4.Ввести с клавиатуры два имени и вывести надпись:
            name1 проспонсировал name2, и она стала известной певицей.*/

        Scanner sc2 = new Scanner(System.in);
        String name_1 = sc2.nextLine();
        String name_2 = sc2.nextLine();
        System.out.println(name_1 + " проспонсировал " + name_2 + ", и она стала известной певицей.");

        /* 5.Ввести с клавиатуры три имени, вывести на экран надпись
            name1 + name2 + name3 = Чистая любовь, да-да! */

        Scanner sc3 = new Scanner(System.in);
        String nameOne = sc3.nextLine();
        String nameTwo = sc3.nextLine();
        String nameThree = sc3.nextLine();
        System.out.println(nameOne + " + " + nameTwo + " + " + nameThree + " = Чистая любовь, да-да!");
    }


}
