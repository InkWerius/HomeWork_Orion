
//Задание 2. Случайности - не случайны
//        Создать класс SequentialRandom с одним полем типа int
//        Значение поле можно только прочитать, но не изменить (используйте модифиактор private
//на поле и создайте только getter)
//        Значение этого int вычисляется по следующим правилом:
//        - Значение для первого созданного объекта- случайное
//        - значение для каждого следующего на 1 больше, чем предыдущее
//        - У класса есть статический метод resetRandom(), который делает значение следующего
//        созданного объекта - случайным.
//        Например new SequentialRandom() // содержит 5 (случайное)
//        // new SequentialRandom() // содержит 6 (на 1 больше)
//        // new SequentialRandom() // содержит 7 (на 1 больше)
//        SequentialRandom.resetRandom()
//        // new SequentialRandom() // содержит 42 (случайное
//        // new SequentialRandom() // содержит 43) (на 1 больше)
//        Подсказка: Используйте статическую переменную в классе, чтобы хранить значение предыдущего объекта.

import java.util.Random;

class SequentialRandom {
    private int digit = container;
    static int container = new Random().nextInt(100);

    public SequentialRandom() {
        container++;
    }

    public int getDigit() {
        return digit;
    }

    static void resetRandom() {
        container = new Random().nextInt(100);
    }

}

public class SequentialRandomDemo {
    public static void main(String[] args) {
//TEST
        SequentialRandom a = new SequentialRandom();
        SequentialRandom a1 = new SequentialRandom();
        SequentialRandom a2 = new SequentialRandom();
        System.out.println(a.getDigit());
        System.out.println(a1.getDigit());
        System.out.println(a2.getDigit());

        SequentialRandom.resetRandom();

        SequentialRandom b = new SequentialRandom();
        SequentialRandom b1 = new SequentialRandom();
        SequentialRandom b2 = new SequentialRandom();
        System.out.println(b.getDigit());
        System.out.println(b1.getDigit());
        System.out.println(b2.getDigit());

    }
}
