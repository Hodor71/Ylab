package Task_Five;

public class Task_5_9 {
    public static void main(String[] args) {
        /* 1. Создать класс Friend (друг) с тремя конструкторами:
          - Имя
          - Имя, возраст
          - Имя, возраст, пол */
        class Friend {
            private String name;
            private int age;
            private Boolean gender;

            public Friend (String name) {
                this.name = name;
            }
            public Friend (String name, int age) {
                this.name=name;
                this.age=age;
            }
            public Friend (String name, int age, Boolean gender) {
                this.name=name;
                this.age=age;
                this.gender=gender;
            }
        }
        /* 2.Создать класс Cat (кот) с пятью конструкторами:
        - Имя,
        - Имя, вес, возраст
        - Имя, возраст (вес стандартный)
        - вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
        - вес, цвет, адрес ( чужой домашний кот)
        Задача конструктора – сделать объект валидным. Например, если вес не известен, то нужно
        указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста.
        А вот имени может и не быть (null). То же касается адреса: null. */
        class Cat {
            private String name;
            private double weight;
            private int age;
            private String color;
            private String address;

            public Cat(String name) {
                this.name = name;
            }
            public Cat(String name, int weight, int age){
                this.name = name;
                this.weight = weight;
                this.age = age;
            }
            public Cat(String name, int age){
                this.name = name;
                this.age = age;
                this.weight = 3;
            }
            public Cat(int weight, String color){
                this.weight = weight;
                this.color = color;
                this.age = 7;
            }
            public Cat(int weight, String color, String address){
                this.weight = weight;
                this.color = color;
                this.address = address;
            }
        }

        /* 3.Создать класс Dog (собака) с тремя конструкторами:
        - Имя
        - Имя, рост
        - Имя, рост, цвет*/
        class Dog {
            private String name;
            private double height;
            private String color;

            public Dog(String name) {
                this.name = name;
            }
            public Dog(String name, int height){
                this.name = name;
                this.height= height;
            }
            public Dog(String name, int height, String color){
                this.name = name;
                this.height = height;
                this.color = color;
            }
        }

        /* 4.Создать класс (Circle) круг, с тремя конструкторами:
        - centerX, centerY, radius
        - centerX, centerY, radius, width
        - centerX, centerY, radius, width, color */
        class Circle {
            private double centerX;
            private double centerY;
            private double radius;
            private double width;
            private String color;

            public void Circle(double centerX, double centerY, double radius) {
                this.centerX = centerX;
                this.centerY = centerY;
                this.radius = radius;
            }

            public void Circle(double centerX, double centerY,
                               double radius, double width) {
                this.centerX = centerX;
                this.centerY = centerY;
                this.radius = radius;
                this.width = width;
            }

            public void Circle(double centerX, double centerY,
                               double radius, double width, String color) {
                this.centerX = centerX;
                this.centerY = centerY;
                this.radius = radius;
                this.width = width;
                this.color = color;
            }
        }

        /* 5.Создать класс прямоугольник (Rectangle). Его данными будут
        top, left, width, height (левая координата, верхняя, ширина и высота).
        Создать для него как можно больше конструкторов:
        - заданы 4 параметра: left, top, width, height
        - ширина/высота не задана (оба равны 0)
        - высота не задана (равно ширине) создаём квадрат
        - создаём копию другого прямоугольника (он и передаётся в параметрах) */
        class Rectangle {
            private double top;
            private double left;
            private double width;
            private double height;

            public void Rectangle(double top, double left, double width, double height) {
                this.top = top;
                this.left = left;
                this.width = width;
                this.height = height;
            }
            public void Rectangle(double top, double left) {
                this.top = top;
                this.left = left;
                this.width = 0;
                this.height = 0;
            }
            public void Rectangle(double top, double left, double width) {
                this.top = top;
                this.left = left;
                this.width = width;
                this.height = width;
            }
            public void Rectangle(Rectangle anotherRectangle) {
                this.height = anotherRectangle.height;
                this.width = anotherRectangle.width;
                this.top = anotherRectangle.top;
                this.left = anotherRectangle.left;
            }
        }
    }
}
