package ParkingAlient;

import java.util.concurrent.*;

public class CarAlient extends  Thread{

        private CyclicBarrier messageWait;
        private Semaphore parkingPlace;
        int carNumber;
        long carWait = ThreadLocalRandom.current().nextLong(1,10);

        public CarAlient(Semaphore parkingPlace, CyclicBarrier messageWait,
                   int numberCar) {
            this.messageWait = messageWait;
            this.parkingPlace = parkingPlace;
            this.carNumber=numberCar;
            this.start();
        }

        @Override
        public void run() {

            try {

                System.out.println("Car :" + getName() + " search for free parking place");
                messageWait.await();

                parkingPlace.acquire();
                System.out.println("Car :" + getName() +" take the place");

                Thread.sleep(TimeUnit.SECONDS.toMillis(carWait));
                System.out.println("Car : " + getName()  + " exit the place and out from the parking");
                parkingPlace.release();

                System.out.println( "Free place in the parking in this moment  =  "  + parkingPlace.availablePermits());

            } catch (InterruptedException | BrokenBarrierException e) {
                System.err.println(e);
            }


        }
    }

