package FirstApp;

/**
 * Created by user on 04.02.2019.
 */
public class RandomNumber {
    public static void main(String[] args) {

        int countsNumbers = 0;
        for (String number : args) {
            countsNumbers = Integer.parseInt(number);
        }
        int massive[] = new int[countsNumbers];
        for (int j = 0; j < countsNumbers; j++) {
            massive[j] = (int) (Math.random() * 100);
        }
        for (int digitals : massive) {
            System.out.print(digitals + " ");
        }

    }
}


