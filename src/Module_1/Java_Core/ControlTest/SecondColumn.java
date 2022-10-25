package Module_1.Java_Core.ControlTest;

import java.util.Scanner;

public class SecondColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int p = scanner.nextInt();
        int[][] a = new int[n][p];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
        for (int j = 0; j < a.length; j++) {
            System.out.println(a[j][1]);
        }
    }
}