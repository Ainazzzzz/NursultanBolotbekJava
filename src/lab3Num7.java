//TODO Create a two-dimensional array to represent a matrix and write methods
// to perform matrix operations such as addition, subtraction, and multiplication.
public class lab3Num7 {
    public static int[][] addition(int[][] matrix1, int[][] matrix2) {
        int[][] third = new int[matrix1.length][matrix1.length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1.length; j++) {
                third[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return third;
    }
    public static int[][] subtraction(int[][] matrix1, int[][] matrix2) {
        int[][] third = new int[matrix1.length][matrix1.length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1.length; j++) {
                third[i][j] = matrix1[i][j] - matrix2[i][j];

            }
        }
        return third;
    }
    public static int[][] multiplication(int[][] matrix1, int[][] matrix2) {
        int[][] third = new int[matrix1.length][matrix1.length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1.length; j++) {
                third[i][j] = matrix1[i][j] * matrix2[i][j];

            }
        }
        return third;
    }
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}};

        int[][] arr2 = {{1, 2, 3},
                        {3, 1, 2},
                        {7, 4, 7}};
        int[][] arr3 = addition(arr1, arr2);
        for (int i = 0; i < arr3.length; i++) {
            System.out.println();
            for (int j = 0; j < arr3.length; j++) {
                System.out.print(arr3[i][j] + " ");
            }
        }
        System.out.println("\n\nSubtraction");
        int[][] arr4 = subtraction(arr1, arr2);
        for (int k = 0; k < arr4.length; k++) {
            System.out.println();
            for (int j = 0; j < arr4.length; j++) {
                System.out.print(arr4[k][j] + " ");
            }


        }
        System.out.println("\n\nMultiplication");
        int[][] arr5 = multiplication(arr1, arr2);
        for (int k = 0; k < arr5.length; k++) {
            System.out.println();
            for (int j = 0; j < arr5.length; j++) {
                System.out.print(arr5[k][j] + " ");
            }


        }
    }
}
