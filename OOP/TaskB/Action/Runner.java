package OOP.TaskB.Action;

import OOP.TaskB.Abstrct.Plane;
import OOP.TaskB.entity.CargoPlane;
import OOP.TaskB.entity.Mark;
import OOP.TaskB.entity.PassangerPlane;

import java.util.Scanner;

/**
 * Created by user on 08.03.2019.
 */
public class Runner {
    public static void main(String[] args) {
        menu();
    }


    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        Plane aircompany[] = new Plane[7];
        aircompany[0] = new PassangerPlane(Mark.AIRBUS, "A318-100", 5950, 2150, 158);
        aircompany[1] = new CargoPlane(Mark.AN, "112", 8500, 21000, 18000);
        aircompany[2] = new PassangerPlane(Mark.BOEING, "737-700", 6230, 2180, 140);
        aircompany[3] = new PassangerPlane(Mark.TU, "154M", 5200, 5300, 158);
        aircompany[4] = new PassangerPlane(Mark.AIRBUS, "A330", 11900, 5600, 440);
        aircompany[5] = new CargoPlane(Mark.AN, "12", 7800, 18000, 9000);
        aircompany[6] = new CargoPlane(Mark.AIRBUS, "300B4", 2700, 43500, 20000);
        System.out.println("Menu is:\n" +
                "if you enter --> 1 you have a list planes\n" +
                "if you enter --> 2 you have a passanger capacity and carrying\n" +
                "if you enter --> 3 you have a sorte of range (max is up)\n" +
                "if you enter --> 4 you have a planes in your range of fuel consumtion\n" +
                "Do you choice:");
        String choice = scanner.nextLine();
        switch (choice) {
            case ("1"):
                Print.printListPlanes(aircompany);
                break;
            case ("2"):
                Print.printCapacityandCarrying(Action.capacity(aircompany), Action.carrying(aircompany));
                break;
            case ("3"):
                Action.sorteOfRange(aircompany);
                Print.printArraysbyRange(aircompany);
                break;
            case ("4"):
                Action.rangeFuelConsumption(aircompany);
                break;
            default:
                break;


        }
        scanner.close();
    }

}

