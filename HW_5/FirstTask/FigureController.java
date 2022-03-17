package HW_5;

//1. Абстрактный супрематизм
////
//Создать абстрактный класс Figure, описывающий фигуру на двумерной плоскости с декартовыми координатами центра x,y.
//В классе объявить абстрактный метод square, который вычисляет площадь фигуры.
//В классе объявить и реализовать метод getQuadrant(), который возвращает четверть на координатной плоскости, в которой лежит центр фигуры.
//Для описания четверти используйте Enum с четырьями значениями: I,II,III,IV
////
////
//Создать классы-наследники:
//Circle - дополнительный параметр радиус, от 0 до 10
//Rectangle - дополнительные параметры ширина и высота, от 0 до 20.
////
//В каждом классе определить метод square, чтобы он правильно считал площадь.
////
//в main'e создать массив на 5 элементов типа Figure, заполните любыми фигурами (не обязательно случайными), выведите все фигуры в формате
//"Название фигуры - площадь"

enum Quadrants {
    ONE,
    TWO,
    THREE,
    FOUR;
}

abstract class Figure {
    double x;
    double y;
    Quadrants q;

    public Figure() {
        x = 0;
        y = 0;
    }

    public Figure(double x, double y) {
        this.x = x;
        this.y = y;
        this.q = getQuadrant();
    }

    abstract double square();

    Quadrants getQuadrant() {
        Quadrants q;
        if (x > 0 & y > 0) {
            return q = Quadrants.ONE;
        } else if (x < 0 & y > 0) {
            return q = Quadrants.TWO;
        } else if (x < 0 & y < 0) {
            return q = Quadrants.THREE;
        } else {
            return q = Quadrants.FOUR;
        }
    }
}
//Создать классы-наследники:
//Circle - дополнительный параметр радиус, от 0 до 10
//Rectangle - дополнительные параметры ширина и высота, от 0 до 20.
////
//В каждом классе определить метод square, чтобы он правильно считал площадь.
////
//в main'e создать массив на 5 элементов типа Figure, заполните любыми фигурами (не обязательно случайными), выведите все фигуры в формате
//"Название фигуры - площадь"

class Circle extends Figure {
    double rad;

    public Circle() {
        rad = 0;
    }

    public Circle(double x, double y, double rad) {
        super(x, y);
        if (rad < 0) {
            this.rad = 0;
        } else if (rad > 10) {
            this.rad = 10;
        } else {
            this.rad = rad;
        }
    }

    @Override
    double square() {
        return Math.PI * rad * rad;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "FigureSquare=" +
                this.square() +
                '}';
    }
}

class Rectangle extends Figure {
    double width;
    double length;

    public Rectangle() {
        width = length = 0;
    }

    public Rectangle(double x, double y, double width, double length) {
        super(x, y);
        if (width < 0) {
            this.width = 0;
        } else if (width > 20) {
            this.width = 20;
        } else {
            this.width = width;
        }

        if (length < 0) {
            this.length = 0;
        } else if (length > 20) {
            this.length = 20;
        } else {
            this.length = length;
        }
    }

    @Override
    double square() {
        return width * length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "FigureSquare=" +
                this.square() +
                '}';
    }
}

//в main'e создать массив на 5 элементов типа Figure, заполните любыми фигурами (не обязательно случайными), выведите все фигуры в формате
//"Название фигуры - площадь"

public class FigureController {
    public static void main(String[] args) {
        Figure[] figure = new Figure[5];
        figure[0] = new Circle(1, 1, 5);
        figure[1] = new Rectangle(1, 1, 5, 10);
        figure[2] = new Circle(-1, -5, 8);
        figure[3] = new Rectangle(-1, -10, 20, 10);
        figure[4] = new Circle(1, 5, 10);

        for (Figure f : figure) {
            System.out.println(f);
        }
    }
}



