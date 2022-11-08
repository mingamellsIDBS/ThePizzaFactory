package thepizzafactory;

public class ChicagoPizzaStore extends PizzaStore{

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        //noinspection IfCanBeSwitch
        if (type.equals("cheese")){
            pizza = new ChicagoStyleCheesePizza();
        } else if (type.equals("pepperoni")){
            pizza = new ChicagoStylePepperoniPizza();
        } else if (type.equals("veggie")){
            pizza = new ChicagoStyleVeggiePizza();
        } else if (type.equals("normal")){
            pizza = new ChicagoStylePizza();
        } else if (type.equals("clam")){
            pizza = new ChicagoStyleClamPizza();
        }
        return pizza;
    }

    public static void main(String[] argv){
        ChicagoPizzaStore pizzaStore = new ChicagoPizzaStore();

        System.out.println("Ordering a pizza");
        Pizza pizza = pizzaStore.orderPizza(null);
        System.out.println("Pizza order completed: " + pizza);

    }

}
