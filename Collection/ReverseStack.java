package Collection;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by user on 06.08.2019.
 */
public class ReverseStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        String number = scanner.next();

        Stack<Integer> stack = new Stack();

        char[] n = number.toCharArray();
        for (int i = 0; i < number.length(); i++) {
            int value = Integer.parseInt(String.valueOf(n[i]));
            stack.push(value);
        }

        while (!stack.isEmpty()) {
            int value = stack.pop();
            System.out.print(value);
        }


    }
}
