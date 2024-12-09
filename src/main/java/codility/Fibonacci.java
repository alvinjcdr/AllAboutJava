package codility;

public class Fibonacci {
    public static void main(String[] args) {
        /*
         * Fibonacci is a series of elements where,
         * the previous two elements are added to get
         * to the next element, starting with 0 and 1.
         */

        int count = 10;
        //expected: 0,1,1,2,3,5,8,13,21,34
        fibonacciIterativeApproach(count);
    }

    static void fibonacciIterativeApproach(int count) {
        int num1 = 0, num2 = 1;

        System.out.println("Iterative Fibonacci");
        for(int i=0; i<count; i++) {
            System.out.print(num1 + " ");

            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
    }
}
