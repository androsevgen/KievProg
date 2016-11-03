package L7_Comparing;

import java.util.Comparator;


public class Sort implements Comparator<String> {
    public int compare(String s, String s1) {
        return Integer.compare(s.length(), s1.length());
    }
}

