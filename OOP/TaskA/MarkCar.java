package OOP.TaskA;

/**
 * Created by user on 03.03.2019.
 */
public enum  MarkCar {

    MERSEDES_BENZ("Mersedes-Benz"),
    SAAB("Saab"),
    HONDA("Honda"),
    TOYTA("Toyta"),
    CITROEN("Citroen"),
    RENAULT("Reanault"),
    LEXUS("Lexus"),
    NISSAN("Nissan"),
    AUDI("Audi");

   private String realName ;

    MarkCar(String realName) {
        this.realName = realName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }
}
