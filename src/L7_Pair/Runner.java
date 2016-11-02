package L7_Pair;

import java.math.BigInteger;

public class Runner {
    public static void main(String[] args) {
        Pair pair = new Pair<String, String >("123", "456");
        Pair pair1 = new Pair(123, 321);
        Pair pair2 = new Pair<Integer, Long>(1231312, (long) 122222222);

        System.out.println(pair.getLeft());
        System.out.println(pair.getRight());
        System.out.println(pair1.getRight());
    }
}
