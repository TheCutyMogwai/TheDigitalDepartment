package Practice_3.Reverse;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int counter = in.nextInt();
        int[] arr = new int[counter];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < arr.length / 2; i++) {
            arr[i] = arr[i] ^ arr[arr.length - i - 1];
            arr[arr.length - i - 1] = arr[arr.length - i - 1] ^ arr[i];
            arr[i] = arr[i] ^ arr[arr.length - i - 1];
        }
        System.out.println("Array: " + Arrays.toString(arr));
    }
}