package FirstApp;

/**
 * Created by user on 04.02.2019.
 */
public class Summa {
    public static void main(String[] args) {
        int summa=0;
        for (String numbers : args) {
            int digital= Integer.parseInt(numbers);
            summa=summa+digital;
        }
        System.out.println(summa);

    }
}
