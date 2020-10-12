package ParkingAlient;

public class CyclingBarierMessage implements  Runnable {

    @Override
    public void run() {
        System.out.println("All place are busy");
    }
}