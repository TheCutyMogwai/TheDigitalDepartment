package Module_1.Java_Core.ControlTest;

import java.util.Scanner;

public class TwoArrays1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        int M = scanner.nextInt();
        int[] b = new int[M];
        for (int i = 0; i < b.length; i++) {
            b[i] = scanner.nextInt();
        }
        for (int i = 0; i < b.length; i++) {
            int counter = 0;
            for (int j = 0; j < a.length; j++) {
                if (b[i] == a[j]) counter++;
            }
            System.out.print(counter + " ");
        }
    }
}