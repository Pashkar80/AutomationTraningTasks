package Collection;

import java.util.*;

/**
 * Created by user on 28.07.2019.
 */
public class SorteNumbers {
    public static void main(String[] args) {
        int y = 25;
        int temp;
        List<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(54);
        list.add(78);
        list.add(10);
        list.add(24);
        list.add(17);
        list.add(19);
        list.add(21);
        list.add(51);
        list.add(31);
        System.out.println(list.toString());
        Integer[] numbers = new Integer[list.size()];
        list.toArray(numbers);


        for (int i = numbers.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (numbers[j] > y) {
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        List<Integer> sortedList = new ArrayList<>(Arrays.asList(numbers));

        System.out.println(sortedList.toString());
    }


}

