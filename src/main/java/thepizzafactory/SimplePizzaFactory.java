package thepizzafactory;

public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;
        //noinspection IfCanBeSwitch
        if (type.equals("cheese")){
            pizza = new CheesePizza();
        } else if (type.equals("greek")){
            pizza = new GreekPizza();
        } else if (type.equals("pepperoni")){
            pizza = new PepperoniPizza();
        } else if (type.equals("veggie")){
            pizza = new VeggiePizza();
        } else if (type.equals("normal")){
            pizza = new Pizza();
        } else if (type.equals("clam")){
            pizza = new ClamPizza();
        }
        return pizza;
    }

}
