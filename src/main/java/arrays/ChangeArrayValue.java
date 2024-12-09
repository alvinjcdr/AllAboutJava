package arrays;

import java.util.Arrays;

public class ChangeArrayValue {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        String[] names = {"Alvin", "Jessieca", "Lucas", "Cassandra"};

        System.out.println("Original numbers: " + Arrays.toString(numbers));
        System.out.println("original numbers[1]: " + numbers[1]);

        System.out.println("Original names: " + Arrays.toString(names));
        System.out.println("original names[0]: " + names[0]);

        numbers[1] = 9;
        names[0] = "Joseph";

        System.out.println("New numbers: " + Arrays.toString(numbers));
        System.out.println("New numbers[1]: " + numbers[1]);

        System.out.println("New names: " + Arrays.toString(names));
        System.out.println("New names[0]: " + names[0]);
    }
}
