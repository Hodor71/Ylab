package Task_Four;

public class Task_4_2 {

    /* 1.Реализовать метод setName, чтобы с его помощью можно было устанавливать
      значение переменной private String name равное переданному параметру String name.*/

    class Cat
    {
        private String name;
        public void setName(String name)
        {
            this.name = name;
        }
    }

     /* 2.Реализовать метод addNewCat, чтобы при его вызове (т.е. добавлении нового кота),
     количество котов увеличивалось на 1. За количество котов отвечает переменная catsCount.*/

    class Cat_1
    {
        private static int catsCount = 0;
        public static void addNewCat()
        {
            catsCount++;
        }
    }

}
