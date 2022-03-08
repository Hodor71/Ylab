package Task_Five;

public class Task_5_5 {
    public static void main(String[] args) {
        /* 1.Создать класс Cat. У кота должно быть имя (name, String),
          возраст (age, int), вес (weight, int), сила (strength, int).*/
        class Cat {
            public String name;
            public int age;
            int weight;
            int strength;

            // 4 и 5. Дополнение класса.
            public static int count = 0;
            public static int fightCount = 0;
            public Cat(String name, int age, int weight, int strength) {
                count++;
                this.name = name;
                this.age = age;
                this.weight = weight;
                this.strength = strength;

            }
            public boolean fight5(Cat anotherCat) {
                fightCount++;
                int ageNew = this.age > anotherCat.age ? 1 : 0;
                int weightNew = this.weight > anotherCat.weight ? 1 : 0;
                int strengthNew = this.strength > anotherCat.strength ? 1 : 0;
                int Win = ageNew + weightNew + strengthNew;
                return Win > 2;
            }
        }

        /* 2.Реализовать метод boolean fight(Cat anotherCat): реализовать механизм драки котов в зависимости
        от их веса, возраста и силы. Зависимость придумать самому. Метод должен определять, выиграли ли мы (this)
        бой или нет, т.е. возвращать true, если выиграли и false - если нет.Должно выполняться условие:
        если cat1.fight(cat2) == true , то cat2.fight(cat1) == false */
        class Cats {
            public String name;
            public int age;
            int weight;
            int strength;

            public Cats() {
            }
            public boolean fight(Cats anotherCats) {
                if (this.age + (weight * strength) / 2 > anotherCats.age + (weight * strength) / 2)
                    return true;
                else return false;
            }
        }
        Cats cat1 = new Cats();
        cat1.name = "Klepa";
        cat1.age = 6;
        cat1.weight = 5;
        cat1.strength = 5;
        Cats cat2 = new Cats();
        cat2.name = "Bai";
        cat2.age = 3;
        cat2.weight = 8;
        cat2.strength = 6;
        System.out.println(cat1.fight(cat2) ? "Klepa - Lose!" : "Bai - Lose!");

        /* 3.Создать class Dog. У собаки должна быть кличка String name и возраст int age.
        Создайте геттеры и сеттеры для всех переменных класса Dog.*/
        class Dog {
            String name;
            int age;

            public String getName() {
                return name;
            }
            public void setName(String name) {
                this.name = name;
            }
            public int age() {
                return age;
            }
            public void setAge(int age) {
                this.age = age;
            }
        }

        /* 4.В методе main создать три объекта типа Cat и заполнить их данными.
          Использовать класс Cat из первой задачи. Класс Cat создавать не надо.*/
        Cat Klepan = new Cat("Klepan", 6, 5,5);
        Cat Baiyn = new Cat("Baiyn", 3,8,6);
        Cat Kotleta = new Cat("Kot leta", 1,2,2);

        /* 5. Создать три кота используя класс Cat. Провести три боя попарно между котами.
          Класс Cat создавать не надо. Для боя использовать метод boolean fight(Cat anotherCat).
          Результат каждого боя вывести на экран.*/
        Cat Vasya = new Cat("Vasya", 10, 9, 4);
        Cat Tishka = new Cat("Tishka", 4,6, 5);
        Cat Erik = new Cat("Erik", 5,7,6);
        System.out.println(Vasya.fight5(Tishka));
        System.out.println(Vasya.fight5(Erik));
        System.out.println(Tishka.fight5(Erik));
    }
}

