package L6_Enum;

import java.util.ArrayList;
import static L6_Enum.Genre.*;

public class Runner {

    public static void main(String[] args) {

        Film  film = new Film();


        ArrayList<Film> lists = new ArrayList<>();

        lists.add(new Film("Побег из Шоушенка", 1994, DRAMAS).addActors("Фрэнк Дарабонт"));
        lists.add(new Film("1+1", 2011, COMEDIES).addActors("Франсуа Клюзе").addActors("Омар Си"));
        lists.add(new Film("Бойцовский клуб", 1999, THRILLER).addActors("Эдвард Нортон"));
        lists.add(new Film("Zомби каникулы", 2013, HORROR).addActors("Юлия Волкова"));

        //System.out.println(lists);
        /*ArrayList<String> asdfa = new ArrayList<String>();

        String a = "aaabbbcc dddd 333sss ffffasdgfadfsga dfg asda3eerasd";
        asdfa.add(a);
        String b = "dd 333ss";

        for(String s : asdfa ){
            System.out.println(s.contains(b));

            String asd = (String)asdfa.get(0);
            String asd2= String.valueOf(asdfa.get(0));
        }*/
    }
}

