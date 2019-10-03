package DataTypes;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by user on 09.02.2019.
 */
public class AverageSize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter count of digital for reasearch:");
        int countOfdigitals = scanner.nextInt();
        String[] digitals = new String[countOfdigitals];
        System.out.println("Enter " + countOfdigitals + "  numbers:");
        for (int i = 0; i < digitals.length; i++) {
            digitals[i] = scanner.next();
        }
        System.out.println(Arrays.toString(digitals));
        double average = 0;
        for (String digital : digitals) {
            average += digital.length();
        }
        average /= digitals.length;
        System.out.println("Average size -> " + average);

        for (String digital : digitals) {
            if (digital.length() < average) {
                System.out.println("Numbers short average " + digital + " " + "size-> " + digital.length());
            }
        }
        for (String digital : digitals) {
            if (digital.length() > average) {
                System.out.println("Numbers over average " + digital + " " + "size-> " + digital.length());
            }
        }
        scanner.close();
    }
}
