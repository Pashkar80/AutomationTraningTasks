package DataTypes;

import java.util.Scanner;

/**
 * Created by user on 09.02.2019.
 */
public class ChoiseSizeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter count of digital for research:");
        int countOfdigitals = scanner.nextInt();
        String[] digitals = new String[countOfdigitals];
        System.out.println("Enter " + countOfdigitals + "  numbers:");
        for (int i = 0; i < digitals.length; i++) {
            digitals[i] = scanner.next();
        }

        int maxSize = 0;
        int minSize = 10000;
        String maxNumber = null;
        String minNumber = null;

        for (int i = 0; i < digitals.length; i++) {
            if (maxSize < digitals[i].length()) {
                maxSize = digitals[i].length();
                maxNumber = digitals[i];
            }
            if (minSize > digitals[i].length()) {
                minSize = digitals[i].length();
                minNumber = digitals[i];
            }
        }
        scanner.close();
        System.out.println("The longest number-> " + maxNumber + " long-> " + maxSize);
        System.out.println("The shortest number-> " + minNumber + " long-> " + minSize);

    }
}
