package Module_1.Java_Core.ControlTest;

import java.util.Scanner;

public class ManyIntegerNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        while (true) {
            String str = scanner.next();
            if (str.equals("Конец")) break;
            int num =Integer.parseInt(str);
            counter += num;
        }
        System.out.println(counter);
    }
}