package Module_1.Java_Core.ControlTest;

import java.util.Scanner;

public class MinAndMaxMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m =  scanner.nextInt();

        int[][] a = new int[n][m];
        int[] minRow = new int[n], maxCol = new int[m];
        int counter = 0;

        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[0].length; j++) {
              a[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < a.length; i++) {
            minRow[i] = 1000;
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] < minRow[i]) minRow[i] = a[i][j];
            }
        }

        for (int j = 0; j < a[0].length; j++) {
            maxCol[j] = -1000;
            for (int i = 0; i < a.length; i++) {
                if (a[i][j] > maxCol[j]) maxCol[j] = a[i][j];
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if ((a[i][j] == minRow[i]) && a[i][j] == maxCol[j]) counter++;
            }
        }
        System.out.println(counter);
    }
}