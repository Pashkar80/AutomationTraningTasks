package Collection;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by user on 06.08.2019.
 */
public class ReversLineWithCollectionsAlgorithm {
    public static void main(String[] args) throws IOException {
        String path = System.getProperty("user.dir") + "/src/Collection";
        String nameFileIn = "words.txt";
        String nameFileOut = "revers.txt";

        File fileIn = new File(path, nameFileIn);
        File fileOut = new File(path, nameFileOut);
        ArrayList<String> strings = new ArrayList<>();
        String line = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(fileIn))) {
            while ((line = reader.readLine()) != null) {
                strings.add(line);
            }

        } catch (IOException e) {
            throw new IOException("Not read " + fileIn, e);
        }

        Collections.reverse(strings);

        try (PrintWriter writer = new PrintWriter(new FileWriter(fileOut, true))) {
            for (String string : strings) {
                writer.print(string + "\n");
            }
        } catch (IOException e) {
            throw new IOException("Not write " + fileOut, e);
        }


    }
}
