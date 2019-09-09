import Pizza.Pizza;
import Pizza.ClamPizza;
import Pizza.PepperoniPizza;
import Pizza.NYStyleCheesePizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")){
            pizza = new NYStyleCheesePizza();
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
