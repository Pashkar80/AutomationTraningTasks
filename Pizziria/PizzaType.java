package Pizziria;

/**
 * Created by user on 15.06.2019.
 */
public  class PizzaType {
    private  String titleType;
    private  double cost;

    public PizzaType(String titleType, double cost) {
        this.titleType = titleType;
        this.cost = cost;
    }

    public String getTitleType() {
        return this.titleType;
    }

    public void setTitleType(String titleType) {
        this.titleType = titleType;
    }

    public double getCost() {
        return this.cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }


    public String toString() {
        return getTitleType()+"                        " + getCost()+" €";

    }

    public static PizzaType [] listTypes(){
       PizzaType [] types = new PizzaType[2];
       types [0]= new PizzaType("Base",1.0);
        types [1]= new  PizzaType("Calzone ",1.5);
       return types;
   }
}
