package arrays;

import java.util.Arrays;

public class CheckFirstAndLastNumInArrayIfEqualTen {
    public static void main(String... args) {
        System.out.println("Check if first and last element of array is equal to 10");

        int[] num = {10, 2, 3, 4, 5, 6, 7, 8, 9, 12};

        System.out.println(Arrays.toString(num)); //to print int elements in Array

        boolean isEqualToTen = num[num.length-1] == 10;

        if (num[0] == 10 && isEqualToTen) {
            System.out.println("IS equal to 10");
        } else {
            System.out.println("IS NOT equal to 10");
        }

    }
}
