package thepizzafactory;

public class PizzaStore {

    private final SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

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
        pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public static void main(String[] argv){
        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());

        System.out.println("Ordering a pizza");
        Pizza pizza = pizzaStore.orderPizza();
        System.out.println("Pizza order completed: " + pizza);

    }

}
