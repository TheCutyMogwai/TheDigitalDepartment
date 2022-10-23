package Module_1.Java_Core_1_2.CoreTasks;

import java.util.Scanner;

public class NextEven {
    public static void main(String[] args) {
        int N;
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextShort();
        N = ((N >> 1) + 1) << 1;
        System.out.println(N);
    }

    /* Авторское решение Samsung IT
	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();
	System.out.println(n + 2 - n % 2);
    */
}