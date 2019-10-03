package Collection;

import java.util.*;

/**
 * Created by user on 22.07.2019.
 */
public class CirclePeopleArrayList {
    ArrayList<Person> list = new ArrayList<>();

   public static long timeStart = System.nanoTime();

    public static void main(String[] args) {
        CirclePeopleArrayList circlePeopleArrayList = new CirclePeopleArrayList();
         long timeStart = System.currentTimeMillis();

        circlePeopleArrayList.addList();
         circlePeopleArrayList.openList();
        circlePeopleArrayList.deleteEverySecondPerson();
         circlePeopleArrayList.openList();
        System.out.print("Execution Time This Realization -> " );
        System.out.print(System.currentTimeMillis()-timeStart);

    }

    public ArrayList<Person> addList() {
        String[] names = {"Johasen", "Glad", "Dines", "Hovard", "Ann", "Nika", "Gven"};
        int[] id = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < names.length; i++) {
            list.add(new Person(names[i], id[i]));

        }
        return list;
    }


    public void openList() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Name:" + list.get(i).getName() + "  "
                    + "Id:" + list.get(i).getId());

        }
    }

    public void deleteEverySecondPerson() {
        while (list.size()>1) {
            Iterator<Person> iterator = list.iterator();
            while (iterator.hasNext()) {
                iterator.next();
                if (iterator.hasNext()) {
                    iterator.next();
                    iterator.remove();
                }

            }
        }
    }

}













