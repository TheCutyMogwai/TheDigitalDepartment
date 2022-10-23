package Module_1.Java_Core_1_2.CoreTasks;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        short N;
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextShort();
        byte result = 0;
        for (;N>0; N /= 10) { result += N % 10; }
        System.out.println(result);
    }

    /* Авторское решение Samsung IT
    Scanner scanner = new Scanner(System.in);
    int a, sum = 0, d;
    a = scanner.nextInt();
    sum += a % 10;
    a /= 10;
    sum += a % 10;
    a /= 10;
    sum += a;
    System.out.println(sum);
    */
}