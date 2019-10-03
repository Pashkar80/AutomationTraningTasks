package Collection;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by user on 06.08.2019.
 */
public class ReversLine {
    public static void main(String[] args) throws IOException {
        String path = System.getProperty("user.dir") + "/data";
        String nameFileIn = "words.txt";
        String nameFileOut = "revers.txt";

        File fileIn = new File(path, nameFileIn);
        File fileOut = new File(path, nameFileOut);

       ArrayList <String> strings = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileIn))) {
            String line;
            while (( line = reader.readLine()) != null) {
                strings.add(line);
            }

        } catch (IOException e) {
            throw new IOException("Not read " + fileIn, e);
        }


        ArrayList<String> revers = new ArrayList<>();


        for (int i = strings.size() - 1; i >= 0; i--) {
            revers.add(strings.get(i));
        }
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileOut))) {
            for (String string : revers) {
                writer.print(string + "\n");
            }
        } catch (IOException e) {
            throw new IOException("Not write " + fileOut, e);
        }


    }
}
