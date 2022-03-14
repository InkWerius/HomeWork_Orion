
/*
Задание 1. Случайности складываются
- Создать массив на 10 чисел типа int
- Заполнить массив случайными числами, используя класс Random и функцию nextInt()
- Вывести массив на экран одной строкой, разделив элементы пробелом
- Посчитать сумму всех элементов и вывести на экран
- Найти минимальный элемент и вывести на экран его индекс в массиве и значение
 */

import java.util.Random;

public class HW {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int sum = 0;
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }

        int min = arr[0];
        int min_id = 0;

        for (int i: arr ) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }

        System.out.println("Sum of elem = " + sum);

        for (int i = 0; i < arr.length; i++) {
            if(min > arr[i]){
                min = arr[i];
                min_id = i;
            }
        }

        System.out.println("Min elem = " + min + ", Min elem_id = " + min_id);
    }
}
