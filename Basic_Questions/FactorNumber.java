import java.util.Scanner;

public class FactorNumber {

    public static void findFactor(int n) {

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check Positive or Negative");
        int n = sc.nextInt();

        findFactor(n);
    }
}
