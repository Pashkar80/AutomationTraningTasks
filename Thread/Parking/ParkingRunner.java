package Thread.Parking;

import java.util.concurrent.Semaphore;

/**
 * Created by user on 17.03.2019.
 */
public class ParkingRunner {
    static final boolean[] PARKING_PLACES = new boolean[5];
     static  Semaphore SEMAPHORE = new Semaphore(5, true);


    public static void main(String[] args) {

        for (int i = 0; i <=15; i++) {
            new Thread(new Car(i)).start();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
           }

        }
    }
}
