import java.util.*;

class Main {
    public static void main(String[] args) {
        float l, b, area;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the length and breadth of the rectangle: ");
            l = sc.nextInt();
            b = sc.nextFloat();
        }
        area = l * b;
        System.out.print("The area of the rectangle is: ");
        System.out.print(area);
    }
}