import java.util.Scanner;

public class RotatedSortedArray {  
    
    public static void searchElemrntInRotatedArray(int[] arr, int key){

        int low = 0;
        int high = arr.length - 1;

        int mid = low + high / 2;

        if(mid == key){
            
        }
        


    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int key = 3;
        
        int[] arr = {7,8,9,1,2,3,4,5};
        
        searchElemrntInRotatedArray(arr,key);
    }
}