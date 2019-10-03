package Pizziria;

import com.sun.org.apache.xpath.internal.operations.Or;

/**
 * Created by user on 06.06.2019.
 */
public class Runner {
    public static void main(String[] args) {

        Ingredients ingredients[] = Ingredients.listIngredients();
        PizzaType pizzaType[] = PizzaType.listTypes();


        Pizza[] pizza = new Pizza[3];
        pizza[0] = new Pizza("Margarita", pizzaType[0], 3);
        pizza[1] = new Pizza("Tasty", pizzaType[1], 2);
        pizza[2] = new Pizza("Four Season", pizzaType[1], 4);

        pizza[0] = pizza[0].addIngredients(pizza[0], ingredients[0], ingredients[2], ingredients[5], ingredients[7],
                ingredients[1], ingredients[4], ingredients[6]);
        pizza[1] = pizza[1].addIngredients(pizza[1], ingredients[1], ingredients[0], ingredients[2]);
        pizza[2] = pizza[2].addIngredients(pizza[2], ingredients[2], ingredients[4], ingredients[6]);

        Order order = new Order(Order.checkOrderNumber(), 758963, pizza);
        Order order1 = new Order(Order.checkOrderNumber(),74585,pizza);




        pizza[1].calculateCostPizza();
        pizza[0].calculateCostPizza();
        pizza[2].calculateCostPizza();
        order.calculateOrder(pizza);
        order1.calculateOrder(pizza);

        System.out.println(order.toString());



    }


}

