package Thread.Parking;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

import static Thread.Parking.ParkingRunner.PARKING_PLACES;
import static Thread.Parking.ParkingRunner.SEMAPHORE;

/**
 * Created by user on 17.03.2019.
 */
public class Car implements  Runnable{


    private int carNumber;
    long carWait = ThreadLocalRandom.current().nextLong(1,10);

    public Car(int carNumber) {
        this.carNumber = carNumber;
    }
    public Car() {

    }


    @Override
    public void run() {
        System.out.println("Car № " + carNumber + "  arrived parking");
        try {

            SEMAPHORE.acquire();


            int parkingNumber = -1;


                for (int i = 0; i <=5; i++) {
                    if (!PARKING_PLACES[i]) {
                        PARKING_PLACES[i] = true;
                        parkingNumber = i;
                        System.out.println("Car №" + carNumber + "  parking on the place " + i);
                        break;


                    }



                }

            Thread.sleep(5000);
               boolean flag= SEMAPHORE.tryAcquire();
               if(flag==false){
                   SEMAPHORE.wait(100);
                   System.out.println("Car №" + carNumber + "  съебал");
               }



                PARKING_PLACES[parkingNumber] = false;

            SEMAPHORE.release();
            System.out.println("Car №" + carNumber + "  left parking");

        } catch (InterruptedException e) {

        }

    }


}



