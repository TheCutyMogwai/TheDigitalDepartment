package Module_1.Java_Core_1_6.CoreTasks;

import java.util.Scanner;

public class Classifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if (N >=0 && N < 10) System.out.println("DIGIT");
        else if (N >= 10 && N < 100) System.out.println("NUM");
        else System.out.println("OTHER");
    }

    /* Авторское решение Samsung IT
    Scanner in=new Scanner(System.in);
    int a = in.nextInt();
	if (a < 0 || a > 99) {
	    System.out.println("OTHER");
	}
	else if (a < 10) {
	    System.out.println("DIGIT");
	}
	else {
	    System.out.println("NUM");
	}
    */
}