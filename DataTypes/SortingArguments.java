package DataTypes;

import java.util.Scanner;

/**
 * Created by user on 09.02.2019.
 */
public class SortingArguments {
    public static void main(String[] args) {

        SortingArguments sortingArguments=new SortingArguments();
        String [] arguments=sortingArguments.addArray();
        String [] ascendingArray=sortingArguments.sortAscendingLength(arguments);
        sortingArguments.print(ascendingArray);
        String [] descendingArray=sortingArguments.sortDescendingLength(arguments);
        sortingArguments.print(descendingArray);
    }
    public  String [] addArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter count of arguments for reasearch:");
        int countOfarguments = scanner.nextInt();
        String[] arguments = new String[countOfarguments];
        System.out.println("Enter " + countOfarguments + "  arguments");
        for (int i = 0; i < arguments.length; i++) {
            arguments[i] = scanner.next();
        }
        scanner.close();
        return arguments;
    }
public  String [] sortAscendingLength(String [] arguments) {
    for (int i = arguments.length - 1; i >= 0; i--) {
        for (int j = 0; j < i; j++) {
            if (arguments[i].length() < arguments[j].length()) {
                String minLength = arguments[j];
                arguments[j] = arguments[i];
                arguments[i] = minLength;
            }
        }
    }

    return arguments;
}

    public  String [] sortDescendingLength(String [] arguments){
        for (int i =arguments.length-1; i>=0; i--) {
            for(int j=0;j<i;j++) {
                if (arguments[i].length() > arguments[j].length()) {
                    String maxLength = arguments[j];
                    arguments[j] = arguments[i];
                    arguments[i] = maxLength;
                }
            }

        }
        return arguments;
    }
    public  void print(String [] arguments){
        for (String argument: arguments) {
            System.out.print(argument+" ");
        }
        System.out.println();

    }
}
