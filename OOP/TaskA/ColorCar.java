package OOP.TaskA;

/**
 * Created by user on 03.03.2019.
 */
public enum  ColorCar {
    RED("Red"),
    BLACK("Black"),
    WHITE("White"),
    BLUE("Blue"),
    GREEN("Green");
    private  String realName;

    ColorCar(String realName) {
        this.realName = realName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }
}
