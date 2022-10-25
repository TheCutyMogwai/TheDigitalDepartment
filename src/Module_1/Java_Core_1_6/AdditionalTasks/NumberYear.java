package Module_1.Java_Core_1_6.AdditionalTasks;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumberYear {
    public static void main(String[] args) {
        Map<String, Integer> dict = new HashMap<>();
        dict.put("1",31); dict.put("2",28); dict.put("3",31); dict.put("4",30); dict.put("5",31); dict.put("6",30);
        dict.put("7",31); dict.put("8",31); dict.put("9",30); dict.put("10",31); dict.put("11",30); dict.put("12",31);
        Scanner scanner = new Scanner(System.in);
        String month = scanner.next();
        int day = scanner.nextInt();
        int counter = 0;
        int monthInt = Integer.parseInt(month);
        if (monthInt > 0 && monthInt <= 12) {
            if ((dict.get(month) - day >= 0) && (dict.containsKey(month))) {
                for (; monthInt > 1; monthInt--) {
                    counter += dict.get(Integer.toString(monthInt - 1));
                }
                counter += day;
                System.out.println(365 - counter);
            } else System.out.println("-1");
        } else System.out.println("-1");
    }

    /* Авторское решение Samsung IT
    Scanner scanner = new Scanner(System.in);
    int n, d;
    n = scanner.nextInt();
    d = scanner.nextInt();

    int c31 = 0, c30 = 0, c28 = 0;
    if (n < 1 || n > 12 || d < 1 || d > 31 || n == 2 && d > 28 ||
       (n == 2 || n == 4 || n == 6 || n == 9 || n == 11) && d > 30) {
       System.out.println(-1);
    }
    else {
        if (n > 2) {
            c28 = 1;
        }
        switch (n) {
            case 2:
            case 3:
                c31 = 1;
                break;
            case 4:
                c31 = 2; c30 = 0;
                break;
            case 5:
                c31 = 2; c30 = 1;
                break;
            case 6:
                c31 = 3; c30 = 1;
                break;
            case 7:
                c31 = 3; c30 = 2;
                break;
            case 8:
                c31 = 4; c30 = 2;
                break;
            case 9:
                c31 = 5; c30 = 2;
                break;
            case 10:
                c31 = 5; c30 = 3;
                break;
            case 11:
                c31 = 6; c30 = 3;
                break;
            case 12:
                c31 = 6; c30 = 4;
        }
        System.out.println(365 - 31 * c31 - 30 * c30 - 28 * c28 - d);
    }
    */
}