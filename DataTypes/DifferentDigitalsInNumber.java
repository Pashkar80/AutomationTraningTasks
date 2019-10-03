package DataTypes;

import java.util.Scanner;

/**
 * Created by user on 11.02.2019.
 */
public class DifferentDigitalsInNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter count of digital for reasearch:");
        int countOfdigitals = scanner.nextInt();
        String[] digitals = new String[countOfdigitals];
        System.out.println("Enter " + countOfdigitals + "  numbers.txt:");
        for (int i = 0; i < digitals.length; i++) {
            digitals[i] = scanner.next();
        }

        for (String digital : digitals) {
            boolean equalChar = true;
            for (int i = 0; i < digital.length() - 1; i++) {
                for (int j = i + 1; j < digital.length(); j++) {
                    if (digital.charAt(i) == digital.charAt(j)) {
                        equalChar = false;

                        break;

                    }

                }

            }
            if(equalChar==true){
                System.out.println(digital);
                break;
            }
        }
        scanner.close();
    }
}


