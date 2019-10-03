package OOP.TaskA;

/**
 * Created by user on 03.03.2019.
 */
public enum Model {
    SEDAN("Sedan"),
    HATCHBACK("Hatchback"),
    COUPE("Coupe"),
    WAGON("Wagon"),
    SUV("SUV");
    private String realName;

    Model(String realName) {
        this.realName = realName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }
}
