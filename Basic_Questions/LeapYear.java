import java.util.Scanner;

public class LeapYear {

    public static void findLeapYear(int leapYear) {
        if ((leapYear % 4 == 0 && leapYear % 100 != 0) || (leapYear % 400 == 0)) {
            System.out.println("LeapYear");
        } else {
            System.out.println("Not a Leap Year");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check leap year or not");
        int n = sc.nextInt();

        findLeapYear(n);
    }
}
