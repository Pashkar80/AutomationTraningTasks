package IOJava;

import java.io.*;
import java.util.Scanner;

/**
 * Created by user on 22.08.2019.
 */
public class DirectoryStructure {
    public static void main(String[] args) throws IOException {
        DirectoryStructure directoryStructure = new DirectoryStructure();
        String path = null;

        for (String arg : args) {

            path = arg;

        }
        String nameDirectory = "Акты 2019";
        String pathOut = System.getProperty("user.dir") + "/data";
        File file = new File(path, nameDirectory);
        File fileOut = new File(pathOut, "StructureFile.txt");
        File[] list = file.listFiles();
        int countsDirectory = list.length;
        int countsFiles = directoryStructure.countsFile(file);
        double averange = countsFiles / countsDirectory;
        int filesNameLength = directoryStructure.lengthFileName(file);
        double averangeNameLength = filesNameLength / countsFiles;

        System.out.println("Counts of folders: " + countsDirectory);
        System.out.println("Counts of files: " + countsFiles);
        System.out.println("Averange counts of files: " + averange);
        System.out.println("Averange counts length names files: " + averangeNameLength);


        try (BufferedWriter writter = new BufferedWriter(new FileWriter(fileOut))) {
            writter.write(file.getName());
            writter.newLine();
            for (int i = 0; i < list.length; i++) {
                writter.write(list[i].getName().toUpperCase());
                writter.newLine();
                String[] names = list[i].list();
                for (String fileName : names) {
                    writter.write(fileName);
                    writter.newLine();

                }
            }
        } catch (IOException e) {
            throw new IOException("Don't write" + file.getName());
        }
    }


    public int countsFile(File file) {
        File[] list = file.listFiles();
        String[] names = new String[0];
        int count = 0;
        for (int i = 0; i < list.length; i++) {
            names = list[i].list();
            count = count + names.length;
        }
        return count;
    }

    public int lengthFileName(File file) {
        File[] list = file.listFiles();
        int count = 0;
        for (int i = 0; i < list.length; i++) {
            File[] files = list[i].listFiles();
            for (int j = 0; j < files.length; j++) {
                count = count + files[j].getName().length();

            }
        }

        return count;
    }


}




