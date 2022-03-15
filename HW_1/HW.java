package Learning;

/*
Написать программу, в которой есть две переменные типа Integer со значениями.
Значения можно указать в коде программы или ввести с клавиатуры или взять из аргументов.
Если первое число больше второго – написать на экран «Число %s больше %s».
Если первое число меньше второго – написать на экран «Число %s меньше %s».
В любом случае, вывести на экран сумму чисел.
 */

import java.util.Random;

public class HW {
    public static void main(String[] args) {
        int a = new Random().nextInt(100);
        int b = new Random().nextInt(100);
        int sum = a + b;

        if (a > b) {
            System.out.printf("Digit %d more than %d%n", a, b);
        } else if(a==b) {
            System.out.printf("Digits are equal");
        } else {
            System.out.printf("Digit %d less than %d%n", a, b);
        }
        System.out.println("Sum: a + b = " + sum);

    }
}
