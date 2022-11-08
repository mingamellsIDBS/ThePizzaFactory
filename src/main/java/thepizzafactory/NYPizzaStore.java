package thepizzafactory;

public class NYPizzaStore extends PizzaStore{

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        //noinspection IfCanBeSwitch
        if (type.equals("cheese")){
            pizza = new NYStyleCheesePizza();
        } else if (type.equals("pepperoni")){
            pizza = new NYStylePepperoniPizza();
        } else if (type.equals("veggie")){
            pizza = new NYStyleVeggiePizza();
        } else if (type.equals("normal")){
            pizza = new NYStylePizza();
        } else if (type.equals("clam")){
            pizza = new NYStyleClamPizza();
        }
        return pizza;
    }

    public static void main(String[] argv){
        NYPizzaStore pizzaStore = new NYPizzaStore();

        System.out.println("Ordering a pizza");
        Pizza pizza = pizzaStore.orderPizza(null);
        System.out.println("Pizza order completed: " + pizza);

    }

}
