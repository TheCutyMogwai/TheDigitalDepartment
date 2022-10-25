package Module_1.Java_Core_1_6.AdditionalTasks;

import java.util.Scanner;
import java.util.TreeMap;

public class RomanNumeralSystem {
    final static TreeMap<Integer, String> romanNumerals = new TreeMap<Integer, String>();

    public static void main(String[] args) {
        romanNumerals.put(1000, "M");
        romanNumerals.put(900, "CM");
        romanNumerals.put(500, "D");
        romanNumerals.put(400, "CD");
        romanNumerals.put(100, "C");
        romanNumerals.put(90, "XC");
        romanNumerals.put(50, "L");
        romanNumerals.put(40, "XL");
        romanNumerals.put(10, "X");
        romanNumerals.put(9, "IX");
        romanNumerals.put(5, "V");
        romanNumerals.put(4, "IV");
        romanNumerals.put(1, "I");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(toRoman(number));
    }
    public static String toRoman (int number){
        int liter = romanNumerals.floorKey(number);
        if (number == liter) {
            return romanNumerals.get(number);
        }
        return romanNumerals.get(liter) + toRoman(number - liter);
    }

    /* Авторское решение Samsung IT
    Scanner scanner = new Scanner(System.in);

    a = scanner.nextInt();
    if (a == 100) {
        System.out.print("C");
        return;
    }

    int b = a / 10;
    a %= 10;

    switch (b) {
        case 9: System.out.print("XC"); break;
        case 8: System.out.print("LXXX"); break;
        case 7: System.out.print("LXX"); break;
        case 6: System.out.print("LX"); break;
        case 5: System.out.print("L"); break;
        case 4: System.out.print("XL"); break;
        case 3: System.out.print("XXX"); break;
        case 2: System.out.print("XX"); break;
        case 1: System.out.print("X"); break;
    }

    switch (b) {
        case 9: System.out.print("IX"); break;
        case 8: System.out.print("VIII"); break;
        case 7: System.out.print("VII"); break;
        case 6: System.out.print("VI"); break;
        case 5: System.out.print("V"); break;
        case 4: System.out.print("IV"); break;
        case 3: System.out.print("III"); break;
        case 2: System.out.print("II"); break;
        case 1: System.out.print("I"); break;
    }
    */
}