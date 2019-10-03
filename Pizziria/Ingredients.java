package Pizziria;

/**
 * Created by user on 04.06.2019.
 */
public  class Ingredients {
    private String title;
    private double cost;

    public Ingredients(String title, double cost) {
        this.title = title;
        this.cost = cost;
    }



    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getCost() {
        return this.cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String toString() {
        return getTitle()+"                  "+getCost()+"€"+"\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ingredients)) return false;

        Ingredients that = (Ingredients) o;

        if (Double.compare(that.getCost(), this.getCost()) != 0) return false;
        return this.getTitle().equals(that.getTitle());
    }



    public static Ingredients[] listIngredients () {
    Ingredients ingredient[] = new Ingredients[8];
    ingredient[0] = new Ingredients("Tomato Paste", 1);
    ingredient[1] = new Ingredients("Cheese", 1);
    ingredient[2] = new Ingredients(" Salami", 1.5);
    ingredient[3] = new Ingredients(" Bacon", 1.2);
    ingredient[4] = new Ingredients("Garlic", 0.3);
    ingredient[5] = new Ingredients("Corn", 0.7);
    ingredient[6] = new Ingredients("Pepperoni", 0.6);
    ingredient[7] = new Ingredients("Olives", 0.5);
    return ingredient;
}

}
