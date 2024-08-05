import java.util.Scanner;

public class PrimeNumBetween {

    public static void CheckPrimeRange(int start, int end) {
        for (int number = start; number <= end; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }

        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number first");
        int start = sc.nextInt();
        System.out.println("Enter number End");
        int end = sc.nextInt();

        CheckPrimeRange(start, end);
        sc.close();
    }
}
