import java.util.Scanner;

public class Palimdrome {

    public static void checkPlaindrome(int number) {
        // int temp = num;
        // int temp1 = num;

        int reversed = 0;
        int original = number;
        while (number != 0) {
            int digit = number % 10; // Extract the last digit
            reversed = reversed * 10 + digit; // Append the digit to the reversed number
            number = number / 10; // Remove the last digit from the original number
        }
        if (original == reversed) {
            System.err.println("Number is Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number one");
        int num1 = sc.nextInt();

        checkPlaindrome(num1);

    }
}
