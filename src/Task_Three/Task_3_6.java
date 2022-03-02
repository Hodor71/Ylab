package Task_Three;

public class Task_3_6 {
    public static void main(String[] args) {
        /* 1.Вывести на экран все возможные комбинации слов «Мама», «Мыла», «Раму».
        Подсказка: их 6 штук. Каждую комбинацию вывести с новой строки. Слова не разделять.*/
        String Mama = "Мама";
        String Mula = "Мыла";
        String Ramy = "Раму";
        System.out.println(Mama+Mula+Ramy);
        System.out.println(Mama+Ramy+Mula);
        System.out.println(Mula+Mama+Ramy);
        System.out.println(Mula+Ramy+Mama);
        System.out.println(Ramy+Mama+Mula);
        System.out.println(Ramy+Mula+Mama);

        /* 2.Выведи на экран таблицу умножения 10 на 10 в следующем виде:
            1 2 3 …
            2 4 6 …
            3 6 9 …*/

        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++)
                System.out.print(i * j + " ");
            System.out.println();
        }

        /* 3.Создать 7 объектов, чтобы на экран вывелись 7 цветов радуги (ROYGBIV).
            Каждый объект при создании выводит на экран определенный цвет.*/

        Red red = new Red();
        Orange orange = new Orange();
        Yellow yellow = new Yellow();
        Green green = new Green();
        Blue blue = new Blue();
        Dark_Blue dark_blue = new Dark_Blue();
        Purple purple = new Purple();

        /* 4.Вывести на экран следующий текст - две строки:
        It's Windows path: "C:\Program Files\Java\jdk1.7.0\bin"
        It's Java string: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"*/

        System.out.println("It's Windows path: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"");
        System.out.println("It's Java string: \\\"C:\\\\Program Files\\\\Java\\\\jdk1.7.0\\\\bin\\\"");

        // 5.Выведи на экран 日本語.

        System.out.println("日本語");

    }
    // 3
    public static class Red {
        public Red() {
            System.out.println("Red");
        }
    }
    public static class Orange {
        public Orange() {
            System.out.println("Orange");
        }
    }
    public static class Yellow {
        public Yellow() {
            System.out.println("Yellow");
        }
    }
    public static class Green {
        public Green() {
            System.out.println("Green");
        }
    }
    public static class Blue {
        public Blue() {
            System.out.println("Blue");
        }
    }
    public static class Dark_Blue {
        public Dark_Blue() {
            System.out.println("Dark Blue");
        }
    }
    public static class Purple {
        public Purple() {
            System.out.println("Purple");
        }
    }
}
