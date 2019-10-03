package Pizziria;

import java.util.Arrays;

/**
 * Created by user on 14.06.2019.
 */
public class Order  {
    private  static int orderNumber;
    private int customerNumber;
    private Pizza [] pizza;
    private String costOrder;




    public Order(int orderNumber, int customerNumber, Pizza[] pizza) {

        this.orderNumber = checkOrderNumber();
        this.customerNumber = customerNumber;
        this.pizza = pizza;


    }



    public int getOrderNumber() {
        return this.orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int getCustomerNumber() {
        return this.customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public Pizza[] getPizza() {
        return this.pizza;
    }

    public void setPizza(Pizza[] pizza) {
        this.pizza = pizza;
    }


public static int checkOrderNumber( ){

        orderNumber=orderNumber+1;
        return orderNumber;
}


    public  Order checkPizzaName(Order order) {
        if (order != null) {
            for (int i = 0; i < pizza.length; i++) {

                if (4 > order.pizza[i].getName().length() || order.pizza[i].getName().length() > 20) {
                    String name = Integer.toString(i + 1);
                    order.pizza[i].setName("имя_клиента_" + name);
                }
            }
        }
        return order;
    }

    public  Pizza changeCount(Pizza pizza, int change){
        pizza.setCount(change);
        return  pizza;
    }




    public String[] attributePizza (Order order) {
        String[] attributes = new String[pizza.length];
        if (order != null) {
            order.checkPizzaName(order);
            for (int i = 0; i < attributes.length; i++) {
                for (int j = 0; j < pizza.length; j++) {
                    attributes[i] = "[" + order.getOrderNumber() + ":" + order.getCustomerNumber() + ":"
                            + pizza[i].getName() + ":" + pizza[i].getCount() + "}";

                }

            }
        }

        return attributes;
    }

    public String calculateOrder(Pizza [] pizza) {

        Double [] costs=new Double[pizza.length];
        double summa=0;
        for (int i = 0; i <pizza.length ; i++) {

        double pricePizza = Double.parseDouble(pizza[i].calculateCostPizza());
            double cost = pricePizza * pizza[i].getCount();
            costs[i]=cost;
        }
        for (int i = 0; i <costs.length ; i++) {

            summa += costs[i];
        }
         costOrder = Double.toString(summa);
        return costOrder;
    }

    public String toString() {
        return "**********************************\n" +
                "Заказ:      " + orderNumber +"\n"+
                "Клиент:     " + customerNumber +"\n"+
                Arrays.toString(pizza).replaceAll("\\[|\\]|\\,|", "").trim()+"\n"
                +"Общая сумма:    "+costOrder+"\n"
                +"***********************************"
                ;
    }

}
