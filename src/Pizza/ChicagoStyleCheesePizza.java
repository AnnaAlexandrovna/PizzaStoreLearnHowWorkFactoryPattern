package Pizza;

public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza(){
        type = "Chicago Style Cheese Pizza";
        dough = "Extra Thin Crust Dough";
        souce = "Plum Tomato Sauce";

        toppings.add("Mozzarella Cheese");
    }

    public void cut(){
        System.out.println("Cutting the pizza into square slices");
    }
}
