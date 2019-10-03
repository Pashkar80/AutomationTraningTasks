package OOP.TaskB.entity;

/**
 * Created by user on 08.03.2019.
 */
public enum Mark {
    AIRBUS("Airbus"),
    BOEING("Boeing"),
    IL("ИЛ"),
    TU("ТУ"),
    CONCORDE("Concorde"),
    AN("АН");


    private String realName;

    Mark(String realName) {
        this.realName = realName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }
}
