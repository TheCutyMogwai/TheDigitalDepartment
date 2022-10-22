package Practice_1.Time;
public class Main {
    public static void main(String[] args) {
        // Example: 12:21:10, Seconds = 44470
        int seconds = 44470;
        int hour, minute, second;
        hour = seconds / 3600;
        minute = seconds % 3600 / 60;
        second = seconds % 60;
        System.out.printf("Time: %d:%02d:%02d", hour, minute, second);
    }
}