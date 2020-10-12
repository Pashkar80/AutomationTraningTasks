package DataTypes;

import java.util.Scanner;

/**
 * Created by user on 21.02.2019.
 */
public class NumberPallindrome {

    public static void main(String[] args) {
        NumberPallindrome numberPallindrome = new NumberPallindrome();
        String[] digitals = numberPallindrome.addArray();
        numberPallindrome.researchingArray(digitals);
    }

    public String[] addArray() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter count of digital for research:");
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
        String palindrome = "";
        int countPalindrome = 0;
        boolean noNumberPalindrome = true;
        for (int i = 0; i < digitals.length; i++) {
            if (countDifferentDigitals(digitals[i]).equals(digitals[i])) {
                countPalindrome++;
                if (countPalindrome == 1) {
                    palindrome = digitals[i];
                    noNumberPalindrome=false;
                } else if (countPalindrome == 2) {
                    palindrome = digitals[i];
                    noNumberPalindrome=false;
                    continue;

                }
            }
        }

        if (noNumberPalindrome){
            System.out.println("No palindrome number");
        }else{
            System.out.println("The number palindrome->:  " + palindrome);
        }

    }

    public static String countDifferentDigitals(String number) {
        char[] numberChar = number.toCharArray();
        for (int i = 0; i < numberChar.length / 2; i++) {
            char digital = numberChar[i];
            numberChar[i] = numberChar[numberChar.length - 1 - i];
            numberChar[numberChar.length - 1 - i] = digital;
        }
        return new String(numberChar);
    }

}


