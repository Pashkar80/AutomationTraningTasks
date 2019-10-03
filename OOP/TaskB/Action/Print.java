package OOP.TaskB.Action;

import OOP.TaskB.Abstrct.Plane;

/**
 * Created by user on 09.03.2019.
 */
public  class Print {

    public  static void printListPlanes(Plane[] aircompany) {
        for (Plane plane : aircompany) {
            System.out.println(plane.getMark().getRealName() + " " + plane.getModel() + " ");

        }
    }


    public static  void printArraysbyRange(Plane[] aircompany) {
        for (Plane plane : aircompany) {
            System.out.println("The range plane " + plane.getMark().getRealName() + plane.getModel() + " is  " + plane.getRange() + " kilometers");
        }

    }

    public static void printCapacityandCarrying(int capacity, int carrying) {

        System.out.println("Passanger capasity this aircompany is : " + capacity + "  people");
        System.out.println("Carrying this aircompany is : " + carrying + "  kg");
    }

    public  static void printRangeFuelConsumption(Plane plane) {

        if (plane != null) {

            System.out.println("The fuel consumption plane : " + plane.getMark().getRealName() + " is " + plane.getFuelConsumption() + "kg / hour");

        } else {
            System.out.println("No data according to your range. Try other options.");
        }
    }
}


