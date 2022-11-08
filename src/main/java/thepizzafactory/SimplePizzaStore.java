package thepizzafactory;

public class SimplePizzaStore {

    private final SimplePizzaFactory factory;

    public SimplePizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(){
        return orderPizza("normal");
    }

    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = factory.createPizza(type);
        System.out.println("Simple Pizza Store");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public static void main(String[] argv){
        SimplePizzaStore pizzaStore = new SimplePizzaStore(new SimplePizzaFactory());

        System.out.println("Ordering a pizza");
        Pizza pizza = pizzaStore.orderPizza();
        System.out.println("Pizza order completed: " + pizza);

    }

}
