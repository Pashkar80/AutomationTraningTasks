package Pizziria;

import com.sun.org.apache.xpath.internal.operations.Or;

/**
 * Created by user on 23.06.2019.
 */
public class Print {

    public static void printStringMassive(String [] strings){
        for (String str:strings) {
            System.out.println(str);
        }
    }

    public static void printMessagePizzaFull(Pizza pizza){
        System.out.println( pizza.getName()+"  Attention!You used all the supplements! Try again!");
    }

    public  static  void printMessageRepeatedIngredients(Pizza pizza){
        System.out.println(pizza.getName()+"  The Repeated Ingredients! Try again!! ");
    }

    public  static void printMessageOk(Pizza pizza){
        System.out.println(pizza.getName()+ "  It's OK!");
    }

    public static String[] printArrayPizza(Order order){
        String [] orders= new String[order.getPizza().length];

        for (Pizza pizza:order.getPizza()) {
            for (int i = 0; i <orders.length ; i++) {

                orders[i] = "Название:    " + pizza.getName();
                System.out.println("------------------------------------------");
                orders [i]= orders + pizza.getPizzaType().getTitleType() + "   " + pizza.getPizzaType().getCost() + " €";
            }
        }
        return orders;
    }

    public static void  printReceipt(Order order){
        System.out.println("***************************************************");
        System.out.println("Заказ:        "+order.getOrderNumber());
        System.out.println("Клиент:       "+ order.getCustomerNumber());


    }

    public static void printDouble(double value){
        System.out.println(value);
    }
}
