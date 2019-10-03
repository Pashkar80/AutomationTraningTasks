package OOP.TaskA;

/**
 * Created by user on 02.03.2019.
 */
  public class Car {
    private int id;
    private MarkCar markCar;
    private Model model;
    private int year;
    private ColorCar colorCar;
    private int price;
    private  String regNumber;
    private String nameMark;

    public Car() {
    }

    public Car(int id, MarkCar markCar, Model model, int year, ColorCar colorCar, int price, String regNumber) {
        this.id = id;
        this.markCar = markCar;
        this.model = model;
        this.year = year;
        this.colorCar = colorCar;
        this.price = price;
        this.regNumber = regNumber;
    }


    public Car(int id, MarkCar markCar, Model model, int year, ColorCar colorCar, int price, String regNumber, String nameMark) {
        this.id = id;
        this.markCar = markCar;
        this.model = model;
        this.year = year;
        this.colorCar = colorCar;
        this.price = price;
        this.regNumber = regNumber;
        this.nameMark = nameMark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public MarkCar getMarkCar() {
        return markCar;
    }

    public void setMarkCar(MarkCar markCar) {
        this.markCar = markCar;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public ColorCar getColorCar() {
        return colorCar;
    }

    public void setColorCar(ColorCar colorCar) {
        this.colorCar = colorCar;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice() {
        this.price = price;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (id != car.id) return false;
        if (year != car.year) return false;
        if (price != car.price) return false;
        if (markCar != car.markCar) return false;
        if (model != car.model) return false;
        if (colorCar != car.colorCar) return false;
        if (regNumber != null ? !regNumber.equals(car.regNumber) : car.regNumber != null) return false;
        return nameMark != null ? nameMark.equals(car.nameMark) : car.nameMark == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (markCar != null ? markCar.hashCode() : 0);
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + year;
        result = 31 * result + (colorCar != null ? colorCar.hashCode() : 0);
        result = 31 * result + price;
        result = 31 * result + (regNumber != null ? regNumber.hashCode() : 0);
        result = 31 * result + (nameMark != null ? nameMark.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", markCar=" + markCar +
                ", model=" + model +
                ", year=" + year +
                ", colorCar=" + colorCar +
                ", price=" + price +
                ", regNumber='" + regNumber + '\'' +
                ", nameMark='" + nameMark + '\'' +
                '}';
    }
}
