package Module_1.Java_Core_1_6.CoreTasks;

import java.util.Scanner;

public class Declension {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        if ( (N % 100 == 1 || N % 10 == 1) && (N % 100 != 11) ){System.out.println(N + " TORT");}
        if (N % 100 < 21){
            if(N % 100 > 4 && N % 100 < 21 || N == 0){System.out.println(N + " TORTOV");}
            else if (N % 100 > 1 && N % 100 < 5){System.out.println(N + " TORTA" );}
        }
        if(N % 100 > 21){
            if(N % 10 > 1 && N % 10 < 5){System.out.println(N + " TORTA" );}
            else if(N % 10 > 4 &&  N % 10 < 10){System.out.println(N + " TORTOV");}
        }
    }

    /* Авторское решение Samsung IT
    Scanner in=new Scanner(System.in);
    int n = in.nextInt();
	if (n % 100 > 9 && n % 100 < 20 || n % 10 > 4 || n == 0) {
	    System.out.println(n + " TORTOV");
	}
	else if (n % 10 == 1) {
	    System.out.println(n + " TORT");
	}
	else {
	    System.out.println(n + " TORTA");
    */
}