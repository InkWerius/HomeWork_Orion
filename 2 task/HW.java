package Learning;

/*
Задание 2. Случайности расходятся 
- Создать массив на 5 элементов типа int и вывести на экран 
- Разделить на два других
- в первом массиве только четные числа, во втором
- только нечетные. Оба массива вывести на экран. 
- Найти среднее значение в каждом массива и вывести их на экран
 */

import java.util.Arrays;
import java.util.Random;

public class HW {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }

        int evenCounter, oddCounter;
        evenCounter = oddCounter = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenCounter++;
            } else {
                oddCounter++;
            }
        }

        int[] evenArr = new int[evenCounter];
        int[] oddArr = new int[oddCounter];
        int e_id, o_id;
        e_id = o_id = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenArr[e_id] = arr[i];
                e_id++;
            } else {
                oddArr[o_id] = arr[i];
                o_id++;
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(evenArr));
        System.out.println(Arrays.toString(oddArr));
        int average = 0;

        for (int i = 0; i < evenArr.length; i++) {
            average += evenArr[i];
        }

        System.out.println("Average of evenArray = " + average/evenArr.length);
        average = 0;

        for (int i = 0; i < oddArr.length; i++) {
            average += oddArr[i];
        }
        
        System.out.println("Average of oddArray = " + average/oddArr.length);
    }
}
