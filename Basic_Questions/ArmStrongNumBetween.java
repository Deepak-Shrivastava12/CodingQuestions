import java.util.Scanner;

public class ArmStrongNumBetween {

    public static void CheckArmStrongNum(int start, int end) {
        for (int number = start; number <= end; number++) {

            int temp = number;
            int rev = 0;
            while (temp != 0) {
                int lastD = temp % 10;
                rev = rev + (lastD * lastD * lastD);
                temp = temp / 10;
            }

            if (rev == temp) {
                System.out.println(number + " ");
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number first");
        int start = sc.nextInt();
        System.out.println("Enter number End");
        int end = sc.nextInt();

        CheckArmStrongNum(start, end);
    }
}
