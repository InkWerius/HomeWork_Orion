package HW_4;
//1. Фруктовая неоднозначность
//        Создать класс Fruit со свойством "вес" типа int и методом toString
//        Создать наследники:
//        Apple - с дополнительным свойством цвет (красное, зеленое, желтое) - String
//        Orange - с дополнительном свойством толщина кожуры - int от 0 до 20
//        Pineapple - с дополнительным свойством - высота хвоста - int, от 5 до 20
//
//        переопределить во всех фруктах toString, чтобы выводил все свойства фрукта и тип
//        фрукта (яблоко, апельсин, ананас)
//
//        создать метод getRandomFruit - которое возвращает случаный фрукт со случайными характеристиками.
//        Создать массив типа Fruit, заполнить его 4 разными случаными фруктами и вывести их на экран

import java.util.*;

class Fruit {
    int weight;

    public Fruit() {
        weight = 0;
    }

    public Fruit(int weight) {
        if (weight < 0) {
            weight = 0;
        } else {
            this.weight = weight;
        }
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "weight=" + weight +
                '}';
    }
}

class Apple extends Fruit {
    private String color;
    static String[] colors = {"Red", "Green", "Yellow"};

    public Apple() {
        color = colors[new Random().nextInt(3)];
    }

    public Apple(int weight, String color) {
        super(weight);
        if (color == "Red" | color == "Green" | color == "Yellow") {
            this.color = color;
        } else {
            System.out.println("Colors you can set only: Red, Green, Yellow");
            System.out.println("Default color set: Green");
            this.color = "Green";
        }
    }

    @Override
    public String toString() {
        return "Apple{" +
                "Weight=" + weight +
                ", Color='" + color + '\'' +
                '}';
    }
}

class Orange extends Fruit {
    private int peel_thickness;

    public Orange() {
        peel_thickness = 0;
    }

    public Orange(int weight, int peel_thickness) {
        super(weight);

        if (peel_thickness > 20) {
            this.peel_thickness = 20;
        } else if (peel_thickness < 0) {
            this.peel_thickness = 0;
        } else {
            this.peel_thickness = peel_thickness;
        }
    }

    @Override
    public String toString() {
        return "Orange{" +
                "Weight=" + weight +
                ", Peel thickness=" + peel_thickness +
                '}';
    }
}

class Pineapple extends Fruit {
    private int crown_length;

    public Pineapple() {
        crown_length = 5;
    }

    public Pineapple(int weight, int crown_length) {
        super(weight);
        if (crown_length > 20) {
            this.crown_length = 20;
        } else if (crown_length < 5) {
            this.crown_length = 5;
        } else {
            this.crown_length = crown_length;
        }

    }

    @Override
    public String toString() {
        return "Pineapple{" +
                "weight=" + weight +
                ", Crown length=" + crown_length +
                '}';
    }
}

public class FruitDemo {

// создать метод getRandomFruit - который возвращает случаный фрукт со случайными характеристиками.
// apple (weight,color), orange(weight, peel 0-20), pineapple(weight, crown 5-20)

    static Fruit getRandomFruit() {
        Fruit rand_fruit = null;
        int fruit_id = new Random().nextInt(3);

        switch (fruit_id) {
            case 0:
                rand_fruit = new Apple(new Random().nextInt(300), Apple.colors[new Random().nextInt(3)]);
                break;
            case 1:
                rand_fruit = new Orange(new Random().nextInt(300), new Random().nextInt(21));
                break;
            case 2:
                rand_fruit = new Pineapple(new Random().nextInt(500), new Random().nextInt(21));
                break;
        }
        return rand_fruit;
    }

//        Создать массив типа Fruit, заполнить его 4 разными случаными фруктами и вывести их на экран

    public static void main(String[] args) {
        Fruit[] random_fruits = new Fruit[4];

        for (int i = 0; i < random_fruits.length; i++) {
            random_fruits[i] = FruitDemo.getRandomFruit();
        }

        for (int i = 0; i < random_fruits.length; i++) {
            System.out.println(random_fruits[i]);
        }

    }
}