import java.util.Scanner;

public class FcatorialRecursion {

    public static int findFactorial(int n) {
        // Base Case is Compulsory
        if (n == 0 && n == 1) {
            return 1;
        } else {
            return n * findFactorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for calculating factorial");
        int n = sc.nextInt();

        System.out.println(findFactorial(n));
    }
}

// In this example, the factorial function calls itself with decreasing values
// of n until it reaches the base case (n == 0), at which point it starts
// returning the product of the numbers.

// For example, if we call factorial(5), the function will execute as follows:

// - factorial(5) calls factorial(4)
// - factorial(4) calls factorial(3)
// - factorial(3) calls factorial(2)
// - factorial(2) calls factorial(1)
// - factorial(1) calls factorial(0)
// - factorial(0) returns 1 (base case)
// - factorial(1) returns 1 * 1 = 1
// - factorial(2) returns 2 * 1 = 2
// - factorial(3) returns 3 * 2 = 6
// - factorial(4) returns 4 * 6 = 24
// - factorial(5) returns 5 * 24 = 120

// Therefore, the final result is 120, which is the factorial of 5.