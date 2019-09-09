import Pizza.Pizza;
import Pizza.SimplePizzaFactory;

public class PizzaTest {
    public static void main(String[] args) {
        //SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore chPizzaStore = new ChicagoPizzaStore();

        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println(pizza.getType());

        Pizza pizza1 = chPizzaStore.orderPizza("cheese");
        System.out.println(pizza1.getType());
    }

}
