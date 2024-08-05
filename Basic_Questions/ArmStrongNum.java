import java.util.Scanner;

public class ArmStrongNum {

    public static void findArmStrong(int num) {
        int original = num;

        int rem = 0;
        while (original != 0) {
            int lastDigit = original % 10;
            rem = rem + (lastDigit * lastDigit * lastDigit);
            original = original / 10;
        }

        if (num == rem) {
            System.out.println("Number is Arnstrong");
        } else {
            System.out.println("Number is not Armstrong");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check Armstrong number!!");
        int n = sc.nextInt();

        findArmStrong(n);
    }
}
