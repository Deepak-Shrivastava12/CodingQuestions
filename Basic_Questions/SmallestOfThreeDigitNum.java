import java.util.Scanner;

public class SmallestOfThreeDigitNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for calculating smallest digit");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // int a = 10;
        // int b = 20;
        // int c = 5;

        // // Use Math.min to find the smallest number
        // int smallest = Math.min(Math.min(a, b), c);

        int smallest = (a < b) ? (a < c) ? a : c : (b < c) ? b : c;

        System.out.println(smallest);

    }
}
