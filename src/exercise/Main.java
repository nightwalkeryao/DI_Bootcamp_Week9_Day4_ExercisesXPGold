package exercise;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 36, 9, 8 };

        iterateArray(arr);
    }

    private static void iterateArray(int[] arr) {
        Arrays.stream(arr).forEach(element -> System.out.println(element));
    }
}
