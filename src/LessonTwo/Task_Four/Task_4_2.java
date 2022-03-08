package Task_Four;

public class Task_4_2 {
    public static void main(String[] args) {
     /* 1.Реализовать метод setName, чтобы с его помощью можно было устанавливать
      значение переменной private String name равное переданному параметру String name.*/

        class Cat {
            private String name;
            public void setName(String name) {
                this.name = name;
            }
        }

     /* 2.Реализовать метод addNewCat, чтобы при его вызове (т.е. добавлении нового кота),
     количество котов увеличивалось на 1. За количество котов отвечает переменная catsCount.*/

        class Cat1 {
            private static int catsCount = 0;
            public static void addNewCat() {
                Cat1.catsCount++;
            }
        }

    /* 3.Реализовать метод setCatsCount так, чтобы с его помощью можно
      было устанавливать значение переменной catsCount равное переданному параметру.*/

        class Cat2 {
            private static int catsCount = 0;
            public static void setCatsCount(int catsCount) {
                Cat2.catsCount = catsCount;
            }
        }

    /* 4.Реализовать метод setName, чтобы с его помощью можно было устанавливать значение
      переменной private String fullName равное значению локальной переменной String fullName. */

        class Cat3
        {
            private String fullName;
            public void setName(String firstName, String lastName)
            {
                String fullName = firstName + lastName;
                this.fullName = fullName;
            }
        }
     /* 5.Написать код, который бы подсчитывал количество созданных
       котов (count) и на экран выдавалось правильно их количество.*/

        Cats cat_1 = new Cats();
        Cats.counts++;
        Cats cat_2 = new Cats();
        Cats.counts++;
        System.out.println("Cats count is " + Cats.counts);
    }
    public static class Cats {
        public static int counts = 0; {
        }
    }

}
