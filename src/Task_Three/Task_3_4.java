package Task_Three;

public class Task_3_4 {

    public static void main(String[] args) {
        // 1.Вывести на экран дату своего рождения в виде: MAY 1 2012.

        System.out.println("MAY 1 2012");

        /* 3.Создать 10 зергов, 5 протосов и 12 терран.
         Дать им всем уникальные имена.*/

        Zerg zerg1 = new Zerg();
        zerg1.name = "Zerg 1";
        Zerg zerg2 = new Zerg();
        zerg2.name = "Zerg 2";
        Zerg zerg3 = new Zerg();
        zerg3.name = "Zerg 3";
        Zerg zerg4 = new Zerg();
        zerg4.name = "Zerg 4";
        Zerg zerg5 = new Zerg();
        zerg5.name = "Zerg 5";
        Zerg zerg6 = new Zerg();
        zerg6.name = "Zerg 6";
        Zerg zerg7 = new Zerg();
        zerg7.name = "Zerg 7";
        Zerg zerg8 = new Zerg();
        zerg8.name = "Zerg 8";
        Zerg zerg9 = new Zerg();
        zerg9.name = "Zerg 9";
        Zerg zerg10 = new Zerg();
        zerg10.name = "Zerg 10";

        Protos protos1 = new Protos();
        protos1.name = "Protos1";
        Protos protos2 = new Protos();
        protos2.name = "Protos2";
        Protos protos3 = new Protos();
        protos3.name = "Protos3";
        Protos protos4 = new Protos();
        protos4.name = "Protos4";
        Protos protos5 = new Protos();
        protos5.name = "Protos5";

        Terran terran1 = new Terran();
        terran1.name = "Terran1";
        Terran terran2 = new Terran();
        terran2.name = "Terran2";
        Terran terran3 = new Terran();
        terran3.name = "Terran3";
        Terran terran4 = new Terran();
        terran4.name = "Terran4";
        Terran terran5 = new Terran();
        terran5.name = "Terran5";
        Terran terran6 = new Terran();
        terran6.name = "Terran6";
        Terran terran7 = new Terran();
        terran7.name = "Terran7";
        Terran terran8 = new Terran();
        terran8.name = "Terran8";
        Terran terran9 = new Terran();
        terran9.name = "Terran9";
        Terran terran10 = new Terran();
        terran10.name = "Terran10";
        Terran terran11 = new Terran();
        terran11.name = "Terran11";
        Terran terran12 = new Terran();
        terran12.name = "Terran12";

        /* 4.Вывести на экран произведение чисел от 1 до 10.
          Подсказка: будет три миллиона с хвостиком*/

        int mult = 1;
        for (int i = 1; i < 11; i++)
            mult = i * mult;
        System.out.println(mult);

        /* 5.Вывести на экран сумму чисел от 1 до 10 построчно:
        1
        1+2=3
        1+2+3=6
        1+2+3+4=10*/

        int first = 0;
        for (int i = 1; i < 11; i++) {
            first = first + i;
            System.out.println(first);
        }
    }
    public static class Zerg {
        String name;
    }
    public static class Protos {
        String name;
    }
    public static class Terran {
        String name;
    }
}
