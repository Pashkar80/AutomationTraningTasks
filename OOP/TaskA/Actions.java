package OOP.TaskA;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * Created by user on 05.03.2019.
 */
public class Actions {
    static Scanner scanner = new Scanner(System.in);

    public static void printSelectCar(Car car) {

        System.out.println("ID: " + car.getId() + " " + "Mark:" + car.getMarkCar().getRealName()
                + " " + "Model:" + car.getModel().getRealName() + " " +
                "Year: " + car.getYear() + " " + "Color:"
                + car.getColorCar().getRealName() + " " + "Price:"
                + car.getPrice() + " "
                + "Registration number:" + car.getRegNumber());


    }

    public static void printEmptySelect() {
        System.out.println("Nothing was found for the specified parameters, try to change the query parameters!");

    }


    public static void selectbyMark(Car[] cars) {
        boolean emptySelect = true;
        System.out.println("Enter car mark :  ");
        String nameMark = scanner.nextLine();
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getMarkCar().getRealName().equals(nameMark)) {
                Actions.printSelectCar(cars[i]);
                emptySelect = false;
            }
        }

        if (emptySelect) {
            Actions.printEmptySelect();
        }


    }


    public static void searchByYearsOperation(Car[] cars) {
        boolean emptySelect = true;
        System.out.println("Enter years of operation :");
        int yearsOperation = scanner.nextInt();
        int yearNow = LocalDate.now().getYear();
        for (int i = 0; i < cars.length; i++) {

            if (yearNow - cars[i].getYear() == yearsOperation) {
                Actions.printSelectCar(cars[i]);
                emptySelect=false;
            }
        }
        if (emptySelect) {
            System.out.println("Nothing was found for the specified parameters, try to change the query parameters!");
        }
    }


    public static void selectPriceYear(Car[] cars) {
        boolean emptySelect=true;
        System.out.println("Enter  year of manufacture :  ");
        int year = scanner.nextInt();
        System.out.println("Enter  price from :  ");
        int price = scanner.nextInt();
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getYear() == year && cars[i].getPrice() > price) {
                Actions.printSelectCar(cars[i]);
                emptySelect=false;
            }

        }
        if(emptySelect){
            System.out.println("Nothing was found for the specified parameters, try to change the query parameters!");
        }
    }
}

