package thepizzafactory;

public class PizzaStore {

    public Pizza orderPizza(){
        Pizza pizza = new Pizza();
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza;
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
        } else {
            pizza = new Pizza();
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public static void main(String[] argv){
        PizzaStore pizzaStore = new PizzaStore();

        System.out.println("Ordering a pizza");
        Pizza pizza = pizzaStore.orderPizza();
        System.out.println("Pizza order completed: " + pizza);

    }

}
