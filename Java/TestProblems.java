import java.util.*;

public class TestProblems {
    public static void checkAscending(int[] arr, int idx) {
        if (idx == arr.length) {
            System.out.println("Ascending!");
            return;
        }
        if (arr[idx] >= arr[idx - 1]) {
            checkAscending(arr, idx + 1);
        } else {
            System.out.println("Not Ascending!");
            return;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 12, 34, 6, 68 };
        checkAscending(arr, 1);
    }
}