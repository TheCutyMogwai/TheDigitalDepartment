package Module_2.Introduction_To_Object_Oriented_Programming_2_1;

import java.util.Scanner;

public class Exercise_2_1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(Integer.toBinaryString(num));
        System.out.println(Integer.toOctalString(num));
        System.out.println(Integer.toHexString(num));
        byte byteNum = (byte) num;
        short shortNum = (short) num;
        if (byteNum == num)
            System.out.println("YES");
        else System.out.println("NO");
        if (shortNum == num)
            System.out.println("YES");
        else System.out.println("NO");

        /* Авторское решение Samsung IT
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toOctalString(x));
        System.out.println(Integer.toHexString(x));
        if (x > -129 && x < 128) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
        if (x > -32769 && x < 32768) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
        */
    }
}