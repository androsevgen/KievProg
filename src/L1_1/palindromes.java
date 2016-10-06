package L1_1;

import java.util.Scanner;

public class palindromes {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ввести число: ");

            for (int i = 0; i < 5; i++) {
                String o, reverse = "";
                o = scanner.nextLine();
                int leg = o.length();
                for (int j = leg - 1; j >= 0; j--) {
                    reverse = reverse + o.charAt(j);
                    if (o.equals(reverse)) System.out.println(o);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
