package TaskArrays;

import java.util.Scanner;

/**
 * Created by user on 25.02.2019.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size matrix :  ");
        int sizeMatrix = scanner.nextInt();
        int[][] matrix = new int[sizeMatrix][sizeMatrix];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
                System.out.printf(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("&&&&&&&&&&&&&&&&");
        for (int i = 0; i < (matrix.length * matrix.length) - 1; i++) {
            for (int j = i; j < matrix.length * matrix.length; j++) {

                if (matrix[(int) i / matrix.length][(int) i % matrix.length] >
                        matrix[(int) j / matrix.length][(int) j % matrix.length]) {

                    int temp = matrix[(int) i / matrix.length][(int) i % matrix.length];

                    matrix[(int) i / matrix.length][(int) i % matrix.length] =
                            matrix[(int) j / matrix.length][(int) j % matrix.length];

                    matrix[(int) j / matrix.length][(int) j % matrix.length] = temp;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {

                System.out.printf(matrix[i][j] + "\t");
            }
            System.out.println();
        }


    }
}
