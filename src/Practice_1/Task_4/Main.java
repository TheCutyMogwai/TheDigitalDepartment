package Practice_1.Task_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        n %= 365;
        if (n == 0) n = 365;
        int Month[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int k = 0;
        for (; k < 12 && n > 0; k++) { n = n - Month[k]; }
        n = Month[k - 1] - Math.abs(n);
        System.out.println(n + " ");
        System.out.println(k + " ");
    }
}
