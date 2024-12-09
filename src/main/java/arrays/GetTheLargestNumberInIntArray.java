package arrays;

import java.util.Arrays;

public class GetTheLargestNumberInIntArray {
    public static void main(String... args) {
        System.out.println("Get the largest value between the first and last elements of an array (length 3) of integers");
        int[] arrLargeNum = {1999, 589, 1203, 9999, 120};
        int largeNum = arrLargeNum[0];

        System.out.println(Arrays.toString(arrLargeNum));

        for(int num : arrLargeNum) {
            if (num >= largeNum){
                largeNum = num;
            }
        }
        System.out.println("largeNum : " + largeNum);
    }
}
