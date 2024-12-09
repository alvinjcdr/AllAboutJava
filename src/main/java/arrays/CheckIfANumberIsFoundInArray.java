package arrays;

import java.util.Arrays;

public class CheckIfANumberIsFoundInArray {
    public static void main(String[] args) {
        System.out.println("Check if a number is found in an array");

        int[] arrNum = {103, 589, 1203, 1818};
        int thisNum = 1818;

        System.out.println(Arrays.toString(arrNum));

        for(int num : arrNum) {
            if(num == thisNum) {
                System.out.println("number found! : " + thisNum);
            } else {
                System.out.println("number NOT found! : " + thisNum);
            }
        }
    }
}
