package Practice_1.Task_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int i = 1;
        while (i <= a) {
            System.out.println(i + " ");
            i *= 2;
        }
    }
}
