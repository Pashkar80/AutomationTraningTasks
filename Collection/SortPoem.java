package Collection;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by user on 07.08.2019.
 */
public class SortPoem {
    public static void main(String[] args) throws IOException {
        String path = System.getProperty("user.dir") + "/data";
        String nameFileIn = "poem.txt";
        String nameFileOut = "sortPoem.txt";

        File fileIn = new File(path, nameFileIn);
        File fileOut = new File(path, nameFileOut);
        ArrayList<String> strings = new ArrayList<>();
        Comparator<String> comparator = new ComparatorLengthString();

        String line = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(fileIn))) {
            while ((line = reader.readLine()) != null) {
                strings.add(line);
            }

        } catch (IOException e) {
            throw new IOException("Not read " + fileIn, e);
        }

        Collections.sort(strings, comparator);

        try (PrintWriter writer = new PrintWriter(new FileWriter(fileOut))) {
            for (String string : strings) {

                writer.print(string + "\n");

            }
        } catch (IOException e) {
            throw new IOException("Not write " + fileOut, e);
        }

    }
}
