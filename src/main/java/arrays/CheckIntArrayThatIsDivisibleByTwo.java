package arrays;

public class CheckIntArrayThatIsDivisibleByTwo {
    public static void main(String[] args){
        //Check the int array and print numbers divisible by 2

//        int[] num = {1,2,3,4,5,6,7,8,9,10};
//
//        for (int i = 0; i < num.length; i++) {
//            if (num[i] % 2 == 0) {
//                System.out.println("divisible by 2: " + num[i]);
//            } else {
//                System.out.println("NOT divisible by 2: " + num[i]);
//            }
//        }

        //enhance for loop
        int[] largeNum = {123, 1256, 5439, 7777};
        for (int j : largeNum) {
            if (j % 2 == 0) {
                System.out.println("divisible by 2: " + j);
            } else {
                System.out.println("NOT divisible by 2: " + j);
            }
        }
    }
}
