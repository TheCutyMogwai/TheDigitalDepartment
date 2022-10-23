package Practice_1.Task_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Первый подход к решению
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        int a = scanner.nextInt(), min = 9, max = 0;
        while (a > 0) {
            int numb = a % 10;
            if (numb > max) max = numb;
            if (numb < min) min = numb;
            a /= 10;
        }
        System.out.println(min + " " + max);

        // Второй подход к решению
        String string = scanner1.nextLine();
        int result = Integer.parseInt(string); min = 9; max = 0;
        while (result > 0) {
            int numb = result % 10;
            if (numb > max) max = numb;
            if (numb < min) min = numb;
            result /= 10;
        }
        System.out.println(min + " " + max);
    }
}
