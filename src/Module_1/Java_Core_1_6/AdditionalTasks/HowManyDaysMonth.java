package Module_1.Java_Core_1_6.AdditionalTasks;

import java.util.Scanner;

public class HowManyDaysMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.print(31);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.print(30);
                break;
            case 2:
                System.out.print(28);
                break;
            default:
                System.out.print(0);
        }
    }

    /* Авторское решение Samsung IT
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    if (n == 2) {
        System.out.println(28);
    } else if (n == 1 || n == 3 || n == 5 || n == 7 || n == 8 || n == 10 || n == 12) {
        System.out.println(31);
    } else if (n == 2 || n == 4 || n == 6 || n == 9 || n == 11) {
        System.out.println(30);
    } else {
        System.out.println(0);
    }
    */
}