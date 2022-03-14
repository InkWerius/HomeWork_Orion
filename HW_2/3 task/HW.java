/*
Задание 3.
        Противоположности притигиваются
        - Создайте два массива на 7 элементов.
        - Используюте функцию Random.nextInt() чтобы полностью заполнить два массива:
        в первом массиве должно оказаться ровно 7 положительных чисел, во втором - ровно 7 отрицательных.
        Подсказка: используйте цикл while во время генерации случайных чисел и проверку на заполненность массива,
        прежде, чем записывать туда элемент.
        - Выведите оба массива на экран
        - Создайте новый массив на 7 элементов.Значением на каждой позиции является суммой значений на позициях
        с тем же индексом из положительного и отрицательного массива.
*/

import java.util.Arrays;
import java.util.Random;

public class HW {
    public static void main(String[] args) {

        int[] arr1 = new int[7];
        int[] arr2 = new int[7];

        int arr1_counter, arr2_counter;
        arr1_counter = arr2_counter = 0;
        int rand;


        while ((arr1_counter < 7) || (arr2_counter < 7)) {
            rand = new Random().nextInt();
            if (rand >= 0) {
                if (arr1_counter < 7) {
                    arr1[arr1_counter] = rand;
                    arr1_counter++;
                }
            } else {
                if (arr2_counter < 7) {
                    arr2[arr2_counter] = rand;
                    arr2_counter++;
                }
            }
        }

        System.out.println("First array: " + Arrays.toString(arr1));
        System.out.println("Second array: " + Arrays.toString(arr2));

        int[] sum_array = new int[7];
        for (int i = 0; i < sum_array.length; i++) {
            sum_array[i] = arr1[i] + arr2[i];
        }

        System.out.println("Sum_array: " + Arrays.toString(sum_array));
    }
}
