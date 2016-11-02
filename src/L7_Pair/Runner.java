package L7_Pair;

public class Runner {
    public static void main(String[] args) {
        Pair pair = new Pair<String, String>("123", "456");
        Pair pair1 = new Pair(123, 321);


        System.out.println(pair.getLeft());
        System.out.println(pair.getRight());
        System.out.println(pair1.getRight());
    }
}
