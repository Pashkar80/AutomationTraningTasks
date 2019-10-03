package OOP.TaskB.Abstrct;

import OOP.TaskB.entity.Mark;

/**
 * Created by user on 08.03.2019.
 */
public abstract class Plane {
private Mark mark;
private String model;
private  int range;
private  int fuelConsumption;




    public Plane(Mark mark, String model, int range, int fuelConsumption) {
        this.mark = mark;
        this.model = model;
        this.range = range;
        this.fuelConsumption = fuelConsumption;

    }

    protected Plane() {
    }


    public Mark getMark() {
        return mark;
    }

    public void setMark(Mark mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "mark=" + mark +
                ", model='" + model + '\'' +
                ", range=" + range +
                ", fuelConsumption=" + fuelConsumption +
                ',';
    }


}
