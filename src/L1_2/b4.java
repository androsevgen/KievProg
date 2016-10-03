package L1_2;

import java.util.Scanner;

public class b4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        try {
            a = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Введите число от 1 до 12");
            ;
        }
        if (a < 1 | a > 12) {
            System.out.println("ERROR");
        }

        if (a == 1) {
            System.out.println("January");
        }
        if (a == 2) {
            System.out.println("February");
        }
        if (a == 3) {
            System.out.println("March");
        }
        if (a == 4) {
            System.out.println("April");
        }
        if (a == 5) {
            System.out.println("May");
        }
        if (a == 6) {
            System.out.println("June");
        }
        if (a == 7) {
            System.out.println("July");
        }
        if (a == 8) {
            System.out.println("August");
        }
        if (a == 9) {
            System.out.println("September");
        }
        if (a == 10) {
            System.out.println("October");
        }
        if (a == 11) {
            System.out.println("November");
        }
        if (a == 12) {
            System.out.println("December");
        }
    }
}
