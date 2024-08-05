import java.util.Scanner;

public class DigitOfGivenNum {

    public static int countDigitNumber(int num) {

        while (num != 0) {
            int digit = num % 10;
            System.out.println("digits is equals = " + digit);
            num /= 10;
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check digit of a number!!");
        int n = sc.nextInt();

        countDigitNumber(n);
    }
}