package DataTypes;

import java.util.Scanner;

/**
 * Created by user on 17.02.2019.
 */
public class IncreaseDigitals {
    public static void main(String[] args) {
        IncreaseDigitals increaseDigitals = new IncreaseDigitals();
        String[] digitals = increaseDigitals.addToArray();
        increaseDigitals.researchingArray(digitals);


    }

    public String[] addToArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter count of digital for reasearch:");
        int countOfdigitals = scanner.nextInt();
        String[] digitals = new String[countOfdigitals];
        System.out.println("Enter " + countOfdigitals + "  numbers");

        for (int i = 0; i < digitals.length; i++) {
            digitals[i] = scanner.next();
        }
        scanner.close();
        return digitals;
    }

    public void researchingArray(String[] digitals) {
        boolean noIncreasingDigitalInNumber = true;
        for (String digital : digitals) {
            char[] charsOfdigital = digital.toCharArray();
            Integer[] numerals = new Integer[digital.length()];
            for (int i = 0; i < charsOfdigital.length; i++) {
                numerals[i] = Character.getNumericValue(charsOfdigital[i]);

            }
            boolean lessThanNext = true;
            for (int i = numerals.length - 1; i > 0; i--) {
                if (!(numerals[i] > numerals[i - 1])) {
                    lessThanNext = false;
                    break;
                }
            }
            if (lessThanNext) {
                System.out.println("IncreaseDigitals ->" + digital);
                noIncreasingDigitalInNumber = false;
                break;
            }

        }
        if (noIncreasingDigitalInNumber) {
            System.out.println("No increasing digital in number");
        }

    }
}

