package Exception;

import OOP.TaskB.Action.Action;

import java.io.File;

/**
 * Created by user on 12.04.2019.
 */
public class Runner {

       public static void main(String[] args) throws ExceptionsWorkWithFile {

       File file=Actions.checkFile("numbers.txt");
        String line=Actions.readFile(file);
        String numbers=Actions.checkIsDigital(line);
        String noEmpty=Actions.deleteEmptyChar(numbers);
        double [] digital=Actions.parse(noEmpty);
        PrintResults.printDoubleMassive(digital);
        double amount= Actions.calculateAmount(digital);
        PrintResults.printAmount(amount);
        double averange=Actions.calculateAverange(digital,amount);
        PrintResults.printAverange(averange);




    }
}