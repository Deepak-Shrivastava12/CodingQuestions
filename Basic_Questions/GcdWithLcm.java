import java.util.Scanner;

public class GcdWithLcm {

    public static void findGCD(int n1, int n2) {
        int smallest = (n1 < n2) ? n1 : n2;

        int gcd = 0;
        for (int i = 1; i <= smallest; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }

        System.out.println(gcd);

        System.out.println();

        // Here we calculating lcm of two number
        int lcm = (n1 * n2) / gcd;
        System.out.println(lcm);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number one");
        int num1 = sc.nextInt();
        System.out.println("Enter number two");
        int num2 = sc.nextInt();
        findGCD(num1, num2);
    }
}
