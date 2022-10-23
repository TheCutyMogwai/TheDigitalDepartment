package Practice_1.Task_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int val = 1;
        int n = scanner.nextInt();
        int i = 0;
        for (i = 1; i <= n; i++) { val = val * 2; }
        System.out.println(val);
    }
}
