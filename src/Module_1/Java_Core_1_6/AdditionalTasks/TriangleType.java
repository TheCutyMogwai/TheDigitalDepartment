package Module_1.Java_Core_1_6.AdditionalTasks;

import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble(), b = scanner.nextDouble(), c = scanner.nextDouble();

        double alpha = Math.toDegrees(Math.acos( (a*a+b*b-c*c)/(2*a*b) ));
        double beta = Math.toDegrees(Math.acos( (a*a+c*c-b*b)/(2*a*c) ));
        double gamma = Math.toDegrees(Math.acos( (b*b+c*c-a*a)/(2*b*c) ));

        if ((a <= 0 || b <= 0 || c <= 0) || !(a + b > c && a + c > b && b + c > a))
            System.out.println("impossible");
        else if (alpha < 90 && beta < 90 && gamma < 90)
            System.out.println("acute");
        else if (alpha == 90 || beta == 90 || gamma == 90)
            System.out.println("right");
        else System.out.println("obtuse ");
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

    if (z >= x + y) {
        System.out.println("impossible");
    }
    else if (z * z == x * x + y * y) {
        System.out.println("right");
    }
    else if (z * z > x * x + y * y) {
        System.out.println("obtuse ");
    }
    else {
        System.out.println("acute");
    }
    */
}