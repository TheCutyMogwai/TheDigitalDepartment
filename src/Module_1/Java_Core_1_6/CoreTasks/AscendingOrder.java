package Module_1.Java_Core_1_6.CoreTasks;

import java.util.Scanner;

public class AscendingOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt(), y = scanner.nextInt(), z = scanner.nextInt();
        if (x > y && x > z) {
            if (y > z) System.out.println(z + " " + y + " " + x);
            else System.out.println(y + " " + z + " " + x);
        }
        else if (y > x && y > z) {
            if (x > z) System.out.println(z + " " + x + " " + y);
            else System.out.println(x + " " + z + " " + y);
        }
        else if (x > y) System.out.println(y + " " + x + " " + z);
        else System.out.println(x + " " + y + " " + z);
    }

    /* Авторское решение Samsung IT
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    int y = scanner.nextInt();
    int z = scanner.nextInt();
    int t;
    if (y < x) {
        t = x;
        x = y;
        y = t;
    }
    if (z < x) {
        t = z;
        z = y;
        y = x;
        x = t;
    }
    else if (z < y) {
        t = y;
        y = z;
        z = t;
    }
    System.out.println(x + " " + y + " " + z);
    */
}