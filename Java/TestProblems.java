import java.util.*;

public class TestProblems {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of the array: ");
            int size = sc.nextInt(), i;
            System.out.println("Enter the elements of the array: ");
            int names[] = new int[size];
            for (i = 0; i < names.length; i++) {
                names[i] = sc.nextInt();
            }
            for (i = 0; i < names.length - 1; i++) {
                if (names[i] > names[i + 1]) {
                    System.out.println("Not in ascending order!!!");
                    return;
                }
            }
            if (i == size - 1)
                System.out.println("The array is in ascending order!!!");
        }
    }
}