package arrays;

import java.util.Arrays;

public class SwapNumbersInArray {
    public static void main(String[] args) {
        System.out.println("Swap numbers in Arrays");

        int[] arr = {1,2,3};
        System.out.println("original array : " + Arrays.toString(arr));

        //put arr[0] to a placeholder
        int placeholder = arr[0];
        //now move arr[2] to arr[0]
        arr[0] = arr[arr.length-1];
        //move placeholder to arr[2]
        arr[arr.length-1] = placeholder;

        System.out.println("new array : " + Arrays.toString(arr));
    }
}
