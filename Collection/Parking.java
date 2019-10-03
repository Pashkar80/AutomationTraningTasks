package Collection;

import java.util.ArrayList;


import java.util.ListIterator;

/**
 * Created by user on 03.08.2019.
 */
public class Parking {

    ArrayList<Car> park = new ArrayList<>();

    public static void main(String[] args) {
        Parking parking = new Parking();
        parking.park.add(new Car());
        parking.park.add(new Car());
        parking.park.add(new Car());
        parking.park.add(new Car());
        parking.park.add(null);
        parking.park.add(new Car());
        parking.park.add(null);
        parking.park.add(null);
        parking.park.add(null);
        System.out.println(parking.park.toString());
        parking.parkingCar();
        parking.depart();
    }

    public ArrayList<Car> parkingCar() {

        ListIterator<Car> iterator = park.listIterator();

        while (iterator.hasNext()) {

            if (iterator.next() == null) {
                iterator.set(new Car());
                System.out.println("Машина припарковалась на место номер " + iterator.nextIndex());
                break;
            }
        }

        System.out.println(park.toString());
        return park;
    }

    public ArrayList<Car> depart() {
        int i = (int) (Math.random() * park.size() + 1);
        park.set(i, null);
        System.out.println("Машина отъехала с места " +
                park.listIterator(i).nextIndex());
        System.out.println(park.toString());
        return park;
    }



}
