public class ArrayExample {
    public static void main(String[] args) {

        // 1D Array
        int[] singleArray = {1, 2, 3, 4, 5};

        System.out.println("Single-dimensional array:");
        for (int i = 0; i < singleArray.length; i++) {
            System.out.println(singleArray[i]);
        }

        // 2D Array
        int[][] twoDimensionalArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("\nTwo-dimensional array:");
        for (int i = 0; i < twoDimensionalArray.length; i++) {
            for (int j = 0; j < twoDimensionalArray[i].length; j++) {
                System.out.print(twoDimensionalArray[i][j] + " ");
            }
            System.out.println();
        }

        // 3D Array
        int[][][] multiDimensionalArray = {
                {
                        {1, 2, 3},
                        {4, 5, 6}
                },
                {
                        {7, 8, 9},
                        {10, 11, 12}
                }
        };

        System.out.println("\nThree-dimensional array:");
        for (int i = 0; i < multiDimensionalArray.length; i++) {
            for (int j = 0; j < multiDimensionalArray[i].length; j++) {
                for (int k = 0; k < multiDimensionalArray[i][j].length; k++) {
                    System.out.print(multiDimensionalArray[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

Output:
Single-dimensional array:
1
2
3
4
5

Two-dimensional array:
1 2 3
4 5 6
7 8 9

Three-dimensional array:
1 2 3
4 5 6

7 8 9
10 11 12
