import java.util.Scanner;

public class PrimeNumber {

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2) { // 2 is the only even prime number
            return true;
        }
        if (num % 2 == 0) {
            return false; // Any other even number is not prime
        }

        // Check divisors from 3 to the square root of the number
        for (int i = 3; i < Math.sqrt(num); i += 2) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check prime or not");
        int num = sc.nextInt();

        if (isPrime(num)) {
            System.out.println("Numbe is Prime");
        } else {
            System.out.println("Number is not Prime");
        }
    }
}
