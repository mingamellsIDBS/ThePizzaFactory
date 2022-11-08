package thepizzafactory;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OriginalPizzaStoreTest {


    private OriginalPizzaStore pizzaStore;

    @BeforeEach
    void setUp() {
        pizzaStore = new OriginalPizzaStore();
    }

    @AfterEach
    void tearDown() {
        pizzaStore = null;
    }

    @Test
    void orderPizza() {
        Pizza pizza = pizzaStore.orderPizza();
        assertEquals(Pizza.class, pizza.getClass());
    }

    @Test
    void orderCheesePizza() {
        Pizza pizza = pizzaStore.orderPizza("cheese");
        assertEquals(CheesePizza.class, pizza.getClass());
    }

    @Test
    void orderPepperoniPizza() {
        Pizza pizza = pizzaStore.orderPizza("pepperoni");
        assertEquals(PepperoniPizza.class, pizza.getClass());
    }

    @Test
    void orderVeggiePizza() {
        Pizza pizza = pizzaStore.orderPizza("veggie");
        assertEquals(VeggiePizza.class, pizza.getClass());
    }

    @Test
    void orderClamPizza() {
        Pizza pizza = pizzaStore.orderPizza("clam");
        assertEquals(ClamPizza.class, pizza.getClass());
    }

    @Test
    void orderGreekPizza() {
        Pizza pizza = pizzaStore.orderPizza("greek");
        assertEquals(GreekPizza.class, pizza.getClass());
    }

    @Test
    void orderNormalPizza() {
        Pizza pizza = pizzaStore.orderPizza("normal");
        assertEquals(Pizza.class, pizza.getClass());
    }

}