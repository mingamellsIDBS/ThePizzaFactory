package thepizzafactory;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PizzaStoreTest {

    private ThePizzaStore pizzaStore;
    private NYPizzaStore nyPizzaStore;
    private ChicagoPizzaStore chicagoPizzaStore;

    @BeforeEach
    void setUp() {
        pizzaStore = new ThePizzaStore(new SimplePizzaFactory());
        nyPizzaStore = new NYPizzaStore();
        chicagoPizzaStore = new ChicagoPizzaStore();
    }

    @AfterEach
    void tearDown() {
        pizzaStore = null;
        nyPizzaStore = null;
        chicagoPizzaStore = null;
    }

    @Test
    void testOrderPizza() {
        Pizza pizza = pizzaStore.orderPizza();
        assertEquals(Pizza.class, pizza.getClass());
    }

    @ParameterizedTest
    @CsvSource ({
            "normal, Pizza",
            "cheese, CheesePizza",
            "pepperoni, PepperoniPizza",
            "veggie, VeggiePizza",
            "clam, ClamPizza",
            "greek, GreekPizza",
    })
    void testThePizzaOrderPizzaVarieties(String type, String expected) {
        String prefix = "thepizzafactory.";
        Pizza pizza = pizzaStore.orderPizza(type);
        assertEquals(prefix + expected, pizza.getClass().getName());
    }

    @ParameterizedTest
    @CsvSource ({
            "normal, Pizza",
            "cheese, CheesePizza",
            "pepperoni, PepperoniPizza",
            "veggie, VeggiePizza",
            "clam, ClamPizza",
    })
    void testNYStyleOrderPizzaVarieties(String type, String expected) {
        String prefix = "thepizzafactory.NYStyle";
        Pizza pizza = nyPizzaStore.orderPizza(type);
        assertEquals(prefix + expected, pizza.getClass().getName());
    }

    @ParameterizedTest
    @CsvSource ({
            "normal, Pizza",
            "cheese, CheesePizza",
            "pepperoni, PepperoniPizza",
            "veggie, VeggiePizza",
            "clam, ClamPizza",
    })
    void testChicagoStyleOrderPizzaVarieties(String type, String expected) {
        String prefix = "thepizzafactory.ChicagoStyle";
        Pizza pizza = chicagoPizzaStore.orderPizza(type);
        assertEquals(prefix + expected, pizza.getClass().getName());
    }

}