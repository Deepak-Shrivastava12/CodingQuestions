import java.util.Scanner;

public class ReverseOfNum {

    public static int reverseNum(int number) {
        // int temp = n;

        // while (n != 0) {
        // temp = n % 10;
        // System.out.println(temp + " ");
        // // System.out.println(temp);
        // n = n / 10;
        // }

        int reversed = 0;
        while (number != 0) {
            int digit = number % 10; // Extract the last digit
            reversed = reversed * 10 + digit; // Append the digit to the reversed number
            number = number / 10; // Remove the last digit from the original number
        }
        return reversed;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check reverse of a number!!");
        int n = sc.nextInt();

        System.out.println(reverseNum(n));
    }
}
