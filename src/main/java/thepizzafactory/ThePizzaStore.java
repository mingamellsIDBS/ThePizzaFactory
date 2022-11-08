package thepizzafactory;

public class ThePizzaStore {

    private final SimplePizzaFactory factory;

    public ThePizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(){
        return orderPizza("normal");
    }

    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = factory.createPizza(type);
        System.out.println("The One and Only Pizza Store");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public static void main(String[] argv){
        ThePizzaStore pizzaStore = new ThePizzaStore(new SimplePizzaFactory());

        System.out.println("Ordering a pizza");
        Pizza pizza = pizzaStore.orderPizza();
        System.out.println("Pizza order completed: " + pizza);

    }

}
