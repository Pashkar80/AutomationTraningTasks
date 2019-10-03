package OOP.TaskB.entity;


import OOP.TaskB.Abstrct.Plane;

/**
 * Created by user on 08.03.2019.
 */
public class CargoPlane extends Plane{
 private int carrying;

 public CargoPlane(){


 }

    public CargoPlane(Mark mark, String model, int range, int fuelConsumption, int carrying) {
        super(mark, model, range, fuelConsumption);
        this.carrying = carrying;
    }

    @Override
    public Mark getMark() {
        return super.getMark();
    }

    @Override
    public void setMark(Mark mark) {
        super.setMark(mark);
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public void setModel(String model) {
        super.setModel(model);
    }

    @Override
    public int getRange() {
        return super.getRange();
    }

    @Override
    public void setRange(int range) {
        super.setRange(range);
    }

    @Override
    public int getFuelConsumption() {
        return super.getFuelConsumption();
    }

    @Override
    public void setFuelConsumption(int fuelConsumption) {
        super.setFuelConsumption(fuelConsumption);
    }


    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

    @Override
    public String toString() {
        return super.toString() + "" +
                "carrying=" + carrying +
                '}';
    }
}
