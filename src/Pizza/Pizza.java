package Pizza;

import java.util.ArrayList;

public class Pizza {
    public String type;
    public String dough;
    public String souce;
    ArrayList<String> toppings = new ArrayList<String>();


    public void prepare(){
        System.out.println("Prepare " + type + " pizza");
        System.out.println("Add toppings: ");
        for (String topping : toppings){
            System.out.println(" " + topping);
        }
    }

    public void bake(){
        System.out.println("Bake " + type + " pizza");
    }

    public void cut(){
        System.out.println("Cut " + type + " pizza");
    }

    public void box(){
        System.out.println("Cut " + type + " pizza");
    }

    public String getType(){
        return type;
    }
}
