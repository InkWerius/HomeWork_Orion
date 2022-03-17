package HW5_2;

//2. Сезонные радости
//        Создайте enum Season с 4 временами года.
//        Создайте enum Games с 4 играми.
//
//        В каждое время года можно играть ровно в одну игру:
//        Зима - снежки
//        Весна - запуск корабликов по ручьям
//        Лето - собирание и поедание ягод
//        Осень - измерение глубины луж методом "сапога"
//
//        Создайте класс Person. У него есть имя и любимый сезон.
//        Создайте массив на 10 элементов с людьми со случайными именами и любимыми сезонами.
//
//        Для каждого человека выведите любимую игру.
//
//        Рекомендации:
//        в Season определите дополнительное поле - игра для сезона.

import java.util.Random;

enum Season{

    WINTER(Games.SNOWBALLS),
    SPRING(Games.BOATS),
    SUMMER(Games.THEHARVEST),
    FALL(Games.PADDLEDIPS);

    Games gameForSeason;

    Season(Games gameForSeason){
        this.gameForSeason = gameForSeason;
    }
}

enum Games{
    SNOWBALLS,
    BOATS,
    THEHARVEST,
    PADDLEDIPS;
}



public class SeasonsController {
    public static void main(String[] args) {
        String[] names = {"Vincent", "Melanie", "Johnny", "Tim", "Elizabeth"};
        String[] last_names= {"Pride", "Watson", "Depp", "Trump","Pitt", "Hascoat"};
        Season[] season = {Season.WINTER, Season.SPRING, Season.SUMMER, Season.FALL};
        Person[] person = new Person[10];
        int rand_name;
        int rand_lastname;
        int rand_season;
        for (int i = 0; i < person.length; i++) {
            rand_name = new Random().nextInt(5);
            rand_lastname = new Random().nextInt(6);
            rand_season = new Random().nextInt(4);
            person[i] = new Person(names[rand_name], last_names[rand_lastname],season[rand_season]);
        }
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].toString());
        }
    }


}
