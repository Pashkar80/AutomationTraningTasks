package TaskArrays;

import java.io.Console;
import java.util.Scanner;

/**
 * Created by user on 25.02.2019.
 */
public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size matrix :  ");
        int sizeMatrix = scanner.nextInt();
        System.out.println("Enter  right shift factor: ");
        int factor = scanner.nextInt();
        int[][] matrix = new int[sizeMatrix][sizeMatrix];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
                System.out.printf(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("&&&&&&");
        int knew = sizeMatrix - factor % sizeMatrix;
        for (int i = 0; i < sizeMatrix; i++) {
            int inew = i;
            for (int j = 0; j < sizeMatrix; j++) {
                int jnew = (j + knew) % sizeMatrix;
                System.out.print(matrix[inew][jnew] + "\t");


            }
            System.out.println();

        }
    }
}
