
public class MissingNumberArray {

    public static int findMissingelement(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            boolean found = false;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                return arr1[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = { 6852, 4, 5, 6 };
        int[] arr2 = { 4, 5, 6 };

        int missingElement = findMissingelement(arr1, arr2);
        if (missingElement == -1) {
            System.out.println("Element not found..");
        } else {
            System.out.println("Element found!! = " + missingElement);
        }
    }

}