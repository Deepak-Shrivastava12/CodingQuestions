import java.util.Scanner;

public class SwapVarByUsingDiffTechnique {

    public static void SwapVariable(int num1, int num2) {

        System.out.println(num1 + " " + num2);
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println((num1 + " " + num2));
    }

    public static void BitwiseXorSwap(int num1, int num2) {

        System.out.println("Swap Variable by using ");
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;

        System.out.println((num1 + " " + num2));
    }

    public static void SwapByMultiplyAndDivision(int num1, int num2) {

        System.out.println("Swap Variable by using ");
        num1 = num1 * num2;
        num2 = num1 / num2;
        num1 = num1 / num2;

        System.out.println((num1 + " " + num2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number one");
        int num1 = sc.nextInt();
        System.out.println("Enter number two");
        int num2 = sc.nextInt();

        // SwapVariable(num1, num2);

        // BitwiseXorSwap(num1, num2);

        SwapByMultiplyAndDivision(num1, num2);
    }
}

// Reference Example!!

// a = a ^ b; // a now becomes 15 (binary: 1111)
// b = a ^ b; // b becomes 5 (original value of a)
// a = a ^ b; // a becomes 10 (original value of b)
