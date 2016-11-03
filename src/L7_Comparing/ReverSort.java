package L7_Comparing;

import java.util.Comparator;

public class ReverSort implements Comparator<String> {

        public int compare(String s, String s1) {
        int result = Integer.compare(s.length(), s1.length());
        if (result == 0) {
            return s1.compareTo(s);
        }
        else {
            return result;
        }
    }
}
