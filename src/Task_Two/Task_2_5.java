package Task_Two;
// Создайте 10 переменных типа Cat и 8 объектов типа Cat.
public class Task_2_5 {
    public static void main(String[] args) {
        class Cat {
        }
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        Cat cat5 = new Cat();
        Cat cat6 = new Cat();
        Cat cat7 = new Cat();
        Cat cat8 = new Cat();
        Cat cat9;
        Cat cat10;

        /*Создайте объект типа Cat(кот), объект типа Dog (собака),
          объект типа Fish (рыбка) и объект типа Woman.
          Присвойте каждому животному владельца (owner).*/
        Woman Anna = new Woman();
        Catt cat = new Catt();
        cat.owner = Anna;
        Dog dog = new Dog();
        dog.owner = Anna;
        Fish fish = new Fish();
        fish.owner = Anna;
    }
    public static class Catt {
        Woman owner;
    }
    public static class Dog {
        Woman owner;
    }
    public static class Fish {
        Woman owner;
    }
    public static class Woman {
    }
}
