package Exception;

/**
 * Created by user on 08.05.2019.
 */
public class PrintResults {



    public static void printDoubleMassive(double[] massive) {
        for (double digitals : massive) {
            System.out.print(digitals + " ");

        }
    }




    public static void printAmount(double amount) {
        System.out.println();
        System.out.print("Amount= ");
        System.out.printf("%.3f", amount);
    }

    public static void printAverange(double averange) {
        System.out.println();
        System.out.print("Averange= ");
        System.out.printf("%.3f", averange);
    }
}
