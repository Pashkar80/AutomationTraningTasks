package ParkingAlient;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

public class ParkingRunnerAlient {
    static final int PARKING_PLACES =5;
    public static void main(String[] args) {
        Semaphore parkingPlace = new Semaphore(PARKING_PLACES);
        CyclicBarrier messageWait = new CyclicBarrier(PARKING_PLACES, new CyclingBarierMessage());
        System.out.println("All available parking place"+parkingPlace.availablePermits());
        for (int i = 1; i <= 12; i++) {
            new CarAlient(parkingPlace,messageWait,i);
        }
    }
}