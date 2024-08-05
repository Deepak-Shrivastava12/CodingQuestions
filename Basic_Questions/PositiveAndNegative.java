import java.util.Scanner;

public class PositiveAndNegative {

    public static void findPosNeg(int n) {

        if (n >= 0) {
            System.out.println("Number is Positive");
        } else {
            System.out.println("Negative");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check Positive or Negative");
        int n = sc.nextInt();

        findPosNeg(n);
    }
}
