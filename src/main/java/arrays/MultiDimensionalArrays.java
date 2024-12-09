package arrays;

public class MultiDimensionalArrays {
    public static void main(String... args) {
        int[][] multiArr = {{1,2,3} , {21,22,23}};

        System.out.println("Looping in multi-dimensional array");

        for(int i = 0; i < multiArr.length; i++) {
            for (int j = 0; j < multiArr[i].length; j++) {
                System.out.println(multiArr[i][j]);
            }
        }

        System.out.println("Accessing multi-dimensional array");

        System.out.println("multiArr[0][0] : " + multiArr[0][0]);
        System.out.println("multiArr[0][1] : " + multiArr[0][1]);
        System.out.println("multiArr[0][2] : " + multiArr[0][2]);

        System.out.println("multiArr[1][0] : " + multiArr[1][0]);
        System.out.println("multiArr[1][1] : " + multiArr[1][1]);
        System.out.println("multiArr[1][2] : " + multiArr[1][2]);
    }
}
