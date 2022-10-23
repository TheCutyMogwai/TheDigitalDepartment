package Module_1.Java_Core_1_2.CoreTasks;

import java.util.Scanner;

public class ElectronicClock2 {
    public static void main(String[] args) {
        int n, hours, minutes, seconds; // h:mm:ss
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        hours = n / 3600;
        minutes = n % 3600 / 60;
        seconds = n % 60;
        if (hours > 23) hours %= 24;
        System.out.printf("%d:%02d:%02d", hours, minutes, seconds);
    }

    /* Авторское решение Samsung IT
	int seconds = 0;
	int minutes = 0;
	int hours = 0;
	String strMinutes = "";
	String strSeconds = "";
	try (Scanner sc = new Scanner(System.in)) {
		seconds = sc.nextInt();
	}
	minutes = seconds / 60;
	seconds = seconds - minutes * 60;
	minutes %= 1440;
	hours = minutes / 60;
	minutes = minutes - hours * 60;
	strMinutes = (minutes >= 10) ? ""+minutes : "0" + minutes;
	strSeconds = (seconds >= 10) ? ""+seconds : "0" + seconds;
	System.out.println(hours + ":" + strMinutes + ":" + strSeconds);
    */
}