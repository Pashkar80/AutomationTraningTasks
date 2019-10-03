package JavaTasksOperators;



import java.util.Scanner;

/**
 * Created by user on 23.02.2019.
 */
public class Months  {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the month :  ");
        int numberMonth=scanner.nextInt();
        if(numberMonth>0 && numberMonth<13) {
            switch (numberMonth) {
                case (1):
                    System.out.println("January");
                    break;
                case (2):
                    System.out.println("February");
                    break;
                case (3):
                    System.out.println("March");
                    break;
                case (4):
                    System.out.println("April");
                    break;
                case (5):
                    System.out.println("May");
                    break;
                case (6):
                    System.out.println("June");
                    break;
                case (7):
                    System.out.println("Jule");
                    break;
                case (8):
                    System.out.println("August");
                    break;
                case (9):
                    System.out.println("September");
                    break;
                case (10):
                    System.out.println("October");
                    break;
                case (11):
                    System.out.println("November");
                    break;
                case (12):
                    System.out.println("December");
                    break;
                default:
                    break;

            }

        }else  System.out.println("Incorrectly.There is no month with this number.Range from 1 to 12.");
        scanner.close();
}}
