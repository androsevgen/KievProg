package L6_Enum;

import java.util.ArrayList;
import java.util.List;

import static L6_Enum.Genre.*;
import static L6_Enum.Utils.findGender;
import static L6_Enum.Utils.findYear;

public class Runner {

    public static void main(String[] args) {
        List<Film> lists = addFilm();

        List<Film> Horror = findGender(lists, Genre.HORROR);
        System.out.println("фильмы, у которых жанры HORROR: " + Horror);

        List<Film> Thriller = findGender(lists, THRILLER);
        System.out.println("фильмы, у которых жанры THRILLER: " + Thriller);

        List<Film> findYear = findYear(lists, 1990, 2000);
        System.out.println("Найти все фильмы комедии, которые выпущеные в 1990-2000 rr.: " + findYear);


    }

    public static List<Film> addFilm() {
        Film film = new Film();

        ArrayList<Film> lists = new ArrayList<>();

        lists.add(new Film("Побег из Шоушенка", 1994, DRAMAS).addActors("Фрэнк Дарабонт"));
        lists.add(new Film("1+1", 2011, COMEDIES).addActors("Франсуа Клюзе").addActors("Омар Си"));
        lists.add(new Film("Бойцовский клуб", 1999, THRILLER).addActors("Эдвард Нортон"));
        lists.add(new Film("Zомби каникулы", 2013, HORROR).addActors("Юлия Волкова"));

        return lists;
    }
}

