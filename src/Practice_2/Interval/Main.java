package Practice_2.Interval;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        System.out.println( ((a >= 3) && (a <= 8)) ? true : false);
    }
}
