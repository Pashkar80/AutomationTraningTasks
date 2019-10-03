package IOJava;

import java.io.*;
import java.util.*;

/**
 * Created by user on 14.08.2019.
 */
public class SortingStudentsList {
    public static void main(String[] args) throws IOException {
        SortingStudentsList sortingStudentsList = new SortingStudentsList();
        File file = sortingStudentsList.chekFile("listStudents");
        HashMap<String, String> map = sortingStudentsList.readFile(file);
        HashMap<String, String> sorteMap = sortingStudentsList.sorteLitters(map);
        sortingStudentsList.writeSorteList(sorteMap, file);


    }

    public File chekFile(String nameFile) {
        String path = System.getProperty("user.dir") + "/data";
        File file = new File(path, nameFile);

        return file;
    }


    public HashMap<String, String> readFile(File file) throws IOException {
        HashMap<String, String> list = new HashMap<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            String key = null;
            String value = null;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s*(\\s|,|!|\\.)\\s*");
                for (int i = 0; i < line.length(); i++) {
                    key = words[words.length - 2];
                    value = words[words.length - 1];
                }
                list.put(key, value);
            }

        } catch (IOException e) {
            throw new IOException("Don't read" + file.getName());
        }

        return list;
    }

    public HashMap<String, String> sorteLitters(HashMap<String, String> map) {
        HashMap<String, String> sorteMap = new HashMap<>();
        Set<Map.Entry<String, String>> setList = map.entrySet();


        Iterator<Map.Entry<String, String>> iterator = setList.iterator();
        while (iterator.hasNext()) {
            boolean equalValue;
            int setValue = 7;
            Map.Entry<String, String> me = iterator.next();

            if (equalValue = (Integer.parseInt(me.getValue()) > setValue)) {


                sorteMap.put(me.getKey().toUpperCase(), me.getValue());

            } else {
                sorteMap.put(me.getKey(), me.getValue());

            }


        }


        return sorteMap;
    }

    public void writeSorteList(HashMap<String, String> map, File file) throws IOException {
        Set<Map.Entry<String, String>> setList = map.entrySet();
        try (PrintWriter writer = new PrintWriter(new FileWriter(file, true))) {
            Iterator<Map.Entry<String, String>> iterator = setList.iterator();
            while (iterator.hasNext()) {
                Map.Entry<String, String> me = iterator.next();
                writer.print(me.getKey() + " ");
                writer.println(me.getValue());

            }
        } catch (IOException e) {
            throw new IOException("Don't write" + file.getName());

        }

    }
}
