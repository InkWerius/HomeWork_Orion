
//Задание 1. Цифровая персонализация
//        - Создать класс Person с двумя полями типа String: firstName, lastName
//        - создать один публичный конструктор с аргументами firstName и lastName.
//        В конструкторе инициализировать поля класса значениями из аргументов
//
//        - Для каждого поля определить только getter'ы (без setter'ов) - getFirstName, getLastName , который возвращают соответствующее поле
//        - Создать метод toString() который возвращает человека в формате "Фамилия, Имя" в методе main
//        - Создать массив типа String на 5 элементов - туда записать какие-нибудь реальные имена.
//        - Создать массив типа String на 6 элементов - туда записать какие-нибудь реальные фамилии
//        - Создать массив типа Person на 50 элементов - туда записать людей со случайными фамилиями из массивов выше
//        - Вывести всех людей из массива в формате "Человек №{индекс в массиве} - Фамилия, Имя"


import java.util.Random;

class Person {
    private String firstName, lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return lastName + "," + firstName;
    }
}

public class PersonDemo{
    public static void main(String[] args) {
        String[] names = {"Vincent", "Melanie", "Johnny", "Tim", "Elizabeth"};
        String[] last_names= {"Pride", "Watson", "Depp", "Trump","Pitt", "Hascoat"};
        Person[] people = new Person[50];
        int rand_name;
        int rand_lastname;
        for (int i = 0; i < people.length; i++) {
            rand_name = new Random().nextInt(5);
            rand_lastname = new Random().nextInt(6);
            people[i] = new Person(names[rand_name], last_names[rand_lastname]);
        }
        for (int i = 0; i < people.length; i++) {
//            "Человек №{индекс в массиве} - Фамилия, Имя"
            System.out.println("Человек №"+ (i+1) + " - " + people[i].toString());
        }
    }
}
