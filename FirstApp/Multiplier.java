package FirstApp;

/**
 * Created by user on 04.02.2019.
 */
public class Multiplier {
    public static void main(String[] args) {
        int summa=1;
        for (String str : args) {
            int digital= Integer.parseInt(str);
            summa=summa*digital;
        }
        System.out.println(summa);
    }
}
