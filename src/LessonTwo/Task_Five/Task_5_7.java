package Task_Five;

public class Task_5_7 {
    public static void main(String[] args) {
        /* 1.Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
          - Имя
          - Имя, возраст
          - Имя, возраст, пол */
        class Friend {
            private String name;
            private int age;
            private String gender;

            public void initialize(String name) {
                this.name = name;
            }

            public void initialize(String name, int age) {
                this.name = name;
                this.age = age;
            }

            public void initialize(String name, int age, String gender) {
                this.name = name;
                this.age = age;
                this.gender = gender;
            }
        }

            /* 2. Создать класс Cat (кот) с пятью инициализаторами:
              - Имя
              - Имя, вес, возраст
              - Имя, возраст (вес стандартный)
              - вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
              - вес, цвет, адрес (чужой домашний кот)

              Задача инициализатора – сделать объект валидным. Например, если вес неизвестен, то нужно указать
              какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста.
              А вот имени может и не быть (null). То же касается адреса: null.*/
            class Cat {
                private String name = null;
                private int weight;
                private int age;
                private String color;
                private String address = null;

                public void initialize(String name) {
                    this.name = name;
                }
                public void initialize(String name, int weight, int age) {
                    this.name = name;
                    this.weight = weight;
                    this.age = age;
                }
                public void initialize(String name, int age) {
                    this.name = name;
                    this.age = age;
                    this.weight = weight;
                }
                public void initialize(int weight, String color) {
                    this.weight = weight;
                    this.color = color;
                    this.age = 4;
                }
                public void initialize(int weight, String color, String address) {
                    this.weight = weight;
                    this.color = color;
                    this.address = address;
                    this.age = 3;
                }
            }

            /* 3.Создать класс Dog (собака) с тремя инициализаторами:
              - Имя
              - Имя, рост
              - Имя, рост, цвет */
            class Dog {
                private String name;
                private int height;
                private int age;

                public void initialize(String name) {
                    this.name = name;
                }

                public void initialize(String name, int height) {
                    this.name = name;
                    this.height = height;
                }

                public void initialize(String name, int height, int age) {
                    this.name = name;
                    this.height = height;
                    this.age = age;
                }
            }

                /* 4.Создать класс (Circle) круг, с тремя инициализаторами:
                - centerX, centerY, radius
                - centerX, centerY, radius, width
                - centerX, centerY, radius, width, color */
                class Circle{
                    private double centerX;
                    private double centerY;
                    private double radius;
                    private double width;
                    private String color;

                    public void initialize(double centerX, double centerY, double radius) {
                        this.centerX = centerX;
                        this.centerY =centerY;
                        this.radius = radius;
                    }
                    public void initialize(double centerX, double centerY,
                                           double radius, double width) {
                        this.centerX = centerX;
                        this.centerY =centerY;
                        this.radius = radius;
                        this.width = width;
                    }
                    public void initialize(double centerX, double centerY,
                                           double radius, double width, String color) {
                        this.centerX = centerX;
                        this.centerY =centerY;
                        this.radius = radius;
                        this.width = width;
                        this.color = color;
                    }
                }

                /* 5.Создать класс прямоугольник (Rectangle). Его данными будут
                top, left, width, height (левая координата, верхняя, ширина и высота).
                Создать для него как можно больше методов initialize(…)*/
                class Rectangle {
                    private double top;
                    private double left;
                    private double width;
                    private double height;

                    public void initialize(double top, double left, double width, double height) {
                        this.top = top;
                        this.left = left;
                        this.width = width;
                        this.height = height;
                    }
                    public void initialize(double top, double left) {
                        this.top = top;
                        this.left = left;
                        this.width = 0;
                        this.height = 0;
                    }
                    public void initialize(double top, double left, double width) {
                        this.top = top;
                        this.left = left;
                        this.width = width;
                        this.height = width;
                    }
                    public void initialize(Rectangle anotherRectangle) {
                        this.height = anotherRectangle.height;
                        this.width = anotherRectangle.width;
                        this.top = anotherRectangle.top;
                        this.left = anotherRectangle.left;
                    }
                }
    }
}
