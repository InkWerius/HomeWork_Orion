package HW_4;
//2. Фруктовая абстрактность
//        Создать класс AbstractFabric с одним абстрактным методом makeFruit(), который возвращает фрукт.
//        Создайте следующие подклассы:
//
//        ThinOrangeFactory - которая создает только апельсины с толщиной кожуры от 1 до 5
//        RedApplesFactory - которая создает только красные яблоки
//        GreenApplesFactory - которая создает только зеленые яблоки.
//        LongPinepplesFactory - которая создает только ананасы с длиной хвоста больше 10
//
//        Создайте массив на 10 элементов и поместите туда 10 случайных фабрик одного из 4 описанных выше типов.
//        Создайте массив типа Fruit на 20 элементов и заполните его фруктами из всех фабрик - по 2 фрукта от одной фабрики.

import java.util.Random;

abstract class AbstractFabric {
    abstract Fruit makeFruit();
}

//        ThinOrangeFactory - которая создает только апельсины с толщиной кожуры от 1 до 5
class ThinOrangeFactory extends AbstractFabric {
    @Override
    Fruit makeFruit() {
        Orange orange;
        int peel_thickness = new Random().nextInt(6);
        if (peel_thickness <= 0) {
            peel_thickness = 1;
        }
        orange = new Orange(new Random().nextInt(200), peel_thickness);
        return orange;
    }
}

//        RedApplesFactory - которая создает только красные яблоки
class RedApplesFactory extends AbstractFabric {
    @Override
    Fruit makeFruit() {
        Apple apple = new Apple(new Random().nextInt(200), "Red");
        return apple;
    }
}

//GreenApplesFactory - которая создает только зеленые яблоки.
class GreenApplesFactory extends AbstractFabric {
    @Override
    Fruit makeFruit() {
        Apple apple = new Apple(new Random().nextInt(200), "Green");
        return apple;
    }
}

//        LongPinepplesFactory - которая создает только ананасы с длиной хвоста больше 10
class LongPinepplesFactory extends AbstractFabric {
    @Override
    Fruit makeFruit() {
        Pineapple pineapple;
        int crown_length = new Random().nextInt(21);
        if (crown_length <= 10) {
            crown_length = 11;
        }
        pineapple = new Pineapple(new Random().nextInt(200), crown_length);
        return pineapple;
    }
}

class FruitFactoryController {

    static AbstractFabric getRandomFabric() {

        AbstractFabric rand_fabric = null;
        int fabric_id = new Random().nextInt(4);

        switch (fabric_id) {
            case 0:
                rand_fabric = new ThinOrangeFactory();
                break;
            case 1:
                rand_fabric = new RedApplesFactory();
                break;
            case 2:
                rand_fabric = new GreenApplesFactory();
                break;
            case 3:
                rand_fabric = new LongPinepplesFactory();
                break;
        }
        return rand_fabric;
    }


    //        Создайте массив на 10 элементов и поместите туда 10 случайных фабрик одного из 4 описанных выше типов.
    //        Создайте массив типа Fruit на 20 элементов и заполните его фруктами из всех фабрик - по 2 фрукта от одной фабрики.
    public static void main(String[] args) {

        AbstractFabric[] randomFabrics = new AbstractFabric[10];

        for (int i = 0; i < randomFabrics.length; i++) {
            randomFabrics[i] = FruitFactoryController.getRandomFabric();
        }

        Fruit[] fruits = new Fruit[20];

        //put the fruit from same fabric in "i" pos and in opposite side of array
        for (int i = 0; i < 10; i++) {
            fruits[i] = randomFabrics[i].makeFruit();
            fruits[fruits.length - i - 1] = randomFabrics[i].makeFruit();
        }

        for (Fruit f : fruits) {
            System.out.println(f);
        }

    }
}






