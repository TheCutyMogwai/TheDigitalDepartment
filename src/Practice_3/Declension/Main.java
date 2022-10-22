package Practice_3.Declension;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if ( (n % 100 == 1 || n % 10 == 1) && (n % 100 != 11) ){System.out.println(n + " TORT");}
        if (n % 100 < 21){
            if(n % 100 > 4 && n %100 < 21 || n == 0){System.out.println(n + " TORTOV");}
            else if (n % 100 > 1 && n % 100 < 5){System.out.println(n + " TORTA" );}
        }
        if(n % 100 > 21){
            if(n % 10 > 1 && n % 10 < 5){System.out.println(n + " TORTA" );}
            else if(n % 10 > 4 &&  n % 10 < 10){System.out.println(n + " TORTOV");}
        }
    }
}