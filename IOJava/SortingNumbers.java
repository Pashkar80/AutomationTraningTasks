package IOJava;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by user on 12.08.2019.
 */
public class SortingNumbers {
    public static void main(String[] args) throws IOException {
        String path = System.getProperty("user.dir") + "/data";
        String nameFile = "counts.txt";
        File file = new File(path, nameFile);


        try (PrintWriter writer = new PrintWriter(new FileWriter(file))) {
            int[] numbers = new int[19];
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = (int) (Math.random() * 100);
                writer.print(numbers[i] + " ");
            }
            writer.println();
            Arrays.sort(numbers);
            for (int number : numbers) {
                writer.print(number + " ");
            }
        } catch (IOException e) {
            throw new IOException("Not write " + file, e);
        }


    }
}
