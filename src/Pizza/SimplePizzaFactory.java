package Pizza;

public class SimplePizzaFactory {
    public Pizza createPizza (String type){
        Pizza pizza = null;

        if (type.equals("cheese")){
            pizza = new ChesePizza();
            pizza.type = "cheese";
        } else if (type.equals("pepperoni")){
            pizza = new PepperoniPizza();
            pizza.type="pepperoni";
        } else if (type.equals("clam")){
            pizza = new ClamPizza();
            pizza.type="clam";
        }

        return  pizza;
    }
}
