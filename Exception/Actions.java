package Exception;

import java.io.*;

/**
 * Created by user on 29.04.2019.
 */
public class Actions  {


    public  static File checkFile(String nameFile) throws ExceptionsWorkWithFile {
        String path = System.getProperty("user.dir") + "/src/Exception" ;
        File file = new File(path,nameFile);
       final long MEMORY=3560;

        if (file.getPath().equals(path) ) {
            throw new FileException("The file is missing at the specified path");
        }

        if (!file.getName().equals(nameFile)) {
            throw new FileException("No file with this name");
        }

        if (!file.isFile()) {
            throw new FileException("This is not file");
        }
        if (!file.exists()) {
            throw new FileException("File does not exist");
        }
        if (file.length() > MEMORY) {
            throw new FileException("Memory out");
        }
        return file;
    }




    public  static String readFile(File file) throws ExceptionsWorkWithFile {
        String line = "";
        int countsByte=0;

        try (FileInputStream reader = new FileInputStream(file)) {
            while((countsByte=reader.read())!=-1){
                line=line+(char)countsByte;
            }
        }catch (IOException e){
           throw new StreamException("Promblem with thread");
        }
        return line;
    }


    public static String deleteEmptyChar(String line) throws ExceptionsWorkWithFile {
        boolean lineIsNotEmpty=true;
        String[] massive = line.split("\\s");
        String  noEmptyChar="";
        for (int i = 0; i <massive.length ; i++) {
            if(massive[i].isEmpty()==true){
                lineIsNotEmpty=false;
            }else{
                lineIsNotEmpty=true;
            }
            if(lineIsNotEmpty==true){
                noEmptyChar=noEmptyChar+massive[i]+" ";
            }
        }
        return noEmptyChar;
    }


    public static String checkIsDigital(String line) throws ExceptionsWorkWithFile {
        String[] massive = line.split("\\s");
        boolean arithmeticChar = true;
        String numbers = "";
        for (int i = 0; i < massive.length; i++) {
            char[] c = massive[i].toCharArray();
            for (int j = 0; j < c.length; j++) {
                if (Character.isDigit(c[j]) == false && c[j] != '.' && c[j]!='-' && c[j]!='E'){
                    throw new IllegalIncorrectElement("Invalid characters in file");
                }
                else {
                    arithmeticChar = true;
                }
            }
            if (arithmeticChar == true) {
                numbers = numbers + massive[i] + " ";
            }
        }
        return numbers;
    }


    public static double[] parse(String numbers) throws ExceptionsWorkWithFile {
        String[] massive = numbers.split("\\s");
        double[] digitals = new double[massive.length];
        final double max =Double.MAX_VALUE;// ??с большой буквы как вариант вырести в переменные класса из метода
        final double min = -Double.MAX_VALUE;
        try{
        for (int i = 0; i < massive.length; i++) {
            digitals[i] = Double.parseDouble(massive[i]);
            if(digitals[i]>max || digitals[i]<min){
                throw new IllegalIncorrectElement("Bound of limits!");
            }
        }

        }catch (NumberFormatException e ) {
            throw new IllegalIncorrectElement("Invalid string format");

        }
        return digitals;
    }



    public static double calculateAmount(double[] massive) {
        double summa = 0.0;
        for (int i = 0; i < massive.length; i++) {
            summa = summa + massive[i];
        }
        return summa;
    }


    public static double calculateAverange(double[] mas, double summa) {
        double averange = summa / mas.length;
        return averange;
    }


}
