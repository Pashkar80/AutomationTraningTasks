package Pizziria;

import java.util.Arrays;

/**
 * Created by user on 04.06.2019.
 */
public class Pizza implements BasePizza {
    private String name;
    private Ingredients[] ingredient;
    private PizzaType pizzaType;
    private int count;
    private String costPizza;


    public Pizza(String name, PizzaType pizzaType, int count) {
        this.name = name;
        this.ingredient = ingredient;
        this.pizzaType = pizzaType;
        this.count = count;
    }

    public Pizza() {
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Ingredients[] getIngredient() {
        return this.ingredient;
    }

    public void setIngredient(Ingredients[] ingredient) {
        this.ingredient = ingredient;
    }

    public PizzaType getPizzaType() {
        return this.pizzaType;
    }

    public void setPizzaType(PizzaType pizzaType) {
        this.pizzaType = pizzaType;
    }

    public int getCount() {
        return this.count;
    }

    public void setCount(int count) {
        if (count > 0) {
            this.count = count;
        } else {
            System.out.println("Mistake!The number of pizzas can not be zero or negative!");
        }
    }





    public Pizza addIngredients(Pizza pizza, Ingredients... ingredient) {
        if (pizza != null) {
            pizza.setIngredient(ingredient);

            if (ingredient.length > 7) {
                Print.printMessagePizzaFull(pizza);

            }

            for (int i = 0; i < ingredient.length - 1; i++) {
                for (int j = i + 1; j < ingredient.length; j++) {
                    if (ingredient[i].equals(ingredient[j])) {
                        Print.printMessageRepeatedIngredients(pizza);
                        break;

                    }

                }
            }

        }
        return pizza;
    }

    public String calculateCostPizza() {
        double cost = pizzaType.getCost();
        for (Ingredients ingredients : ingredient) {
            cost = cost + ingredients.getCost();

        }
        costPizza = Double.toString(cost);
        return costPizza;
    }

    public String calculateOrder() {
        double cost = 0;
        double pricePizza = Double.parseDouble(calculateCostPizza());
        for (int i = 0; i < calculateCostPizza().length(); i++) {
            cost = pricePizza * count;
        }

        String costOrder = Double.toString(cost);
        return costOrder;
    }

    public String toString() {
        return "Название:" + name + "\n" +
                "---------------------------\n" +
                Arrays.toString(new PizzaType[]{pizzaType}).replaceAll("\\[|\\]|\\,|", "").trim() + "\n" +
                Arrays.toString(ingredient).replaceAll("\\[|\\]|\\,|", "").trim() + "\n" +
                "------------------------------\n"
                + "Цена пиццы: " + costPizza + "\n"
                + "Количество:" + count + "\n"
                + "-----------------------------\n"


                ;
    }

}
