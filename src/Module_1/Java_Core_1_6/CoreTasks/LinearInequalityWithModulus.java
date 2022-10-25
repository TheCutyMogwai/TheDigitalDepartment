package Module_1.Java_Core_1_6.CoreTasks;

import java.util.Scanner;

public class LinearInequalityWithModulus {
    public static void main(String[] args) {
        // Task: A|x| + B > 0
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a > 0 && b > 0){
            System.out.println("any x");
        } else if (b <= 0 && a <= 0) {
            System.out.println("no such x");
        } else if (a > b){System.out.printf("x<%.1f or x>%.1f", (float) b/a, (float) -b/a);}
        else {System.out.printf("%.1f<x<%.1f", (float) b/a, (float) -b/a);}
    }

    /* Авторское решение Samsung IT
    Scanner scanner = new Scanner(System.in);
    double a = scanner.nextDouble();
    double b = scanner.nextDouble();
    if (a == 0) {
        if (b > 0) {
            System.out.println("any x");
        }
        else {
            System.out.println("no such x");
        }
    }
    else {
        if (a > 0) {
            if (b > 0) {
                System.out.println("any x");
            }
            else {
                System.out.printf("x<%.1f or x>%.1f", -Math.abs(b / a), Math.abs(b / a));
            }
        }
        else {
            if (b < 0) {
                System.out.println("no such x");
            }
            else {
                System.out.printf("%.1f<x<%.1f", -Math.abs(b / a), Math.abs(b / a));
            }
        }
    }
    */
}