package IOJava;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by user on 25.08.2019.
 */
public class SwitchWords {
    public static void main(String[] args) throws IOException {
        SwitchWords switchWords = new SwitchWords();
        File file = switchWords.chekFile("SortingStudentsList.java");
        String absolutePath =file.getAbsolutePath();
        System.out.println(absolutePath);
        ArrayList<String> list = switchWords.readFile(file);
        ArrayList<String> listChange = switchWords.switchWord(list);
        switchWords.writeList(listChange);

    }

    public File chekFile(String name) {
        String path = System.getProperty("user.dir") + "/src/IOJava";
        File file = new File(path, name);
        return file;
    }

    public ArrayList readFile(File file) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        String line = "";
        int countsByte = 0;

        try (FileInputStream reader = new FileInputStream(file)) {
            while ((countsByte = reader.read()) != -1) {
                line = line + (char) countsByte;

            }
            list.add(line);

        } catch (IOException e) {
            throw new IOException("Don't read" + file.getName());
        }
        return list;
    }

    public ArrayList<String> switchWord(ArrayList<String> list) {
        ArrayList<String> listChange = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            String[] massive = list.get(i).split("\\s");
            for (int j = 0; j < massive.length; j++) {
                if (massive[j].equals("public")) {
                    String str = massive[j].replace("public", "private");
                    massive[j] = str;
                }
                listChange.add(massive[j]);
            }
        }
        return listChange;
    }

    public void writeList(ArrayList<String> list) throws IOException {
        String pathOut = System.getProperty("user.dir") + "/data";
        File fileOut = new File(pathOut, "ProgrameText.txt");
        try (BufferedWriter writter = new BufferedWriter(new FileWriter(fileOut))) {
            for (String str : list) {
                writter.write(str);
                writter.newLine();

            }

        } catch (IOException e) {
            throw new IOException("Don't write" );
        }


    }
}
