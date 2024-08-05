import java.util.Scanner;

public class SumOfFDigits {

    public static void sumOfDigit(int num) {
        int originalNum = num;

        int sum = 0;
        while (num != 0) {
            // num = num % 10; // Here we update the value!!
            sum = sum + num % 10; // % Gives us reminder!!
            num = num / 10; // Remove the last element!!
        }

        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for calculating digits");
        int num = sc.nextInt();

        sumOfDigit(num);
    }
}
