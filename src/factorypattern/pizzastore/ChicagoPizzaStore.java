package factorypattern.pizzastore;

import factorypattern.pizza.*;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new ChicagoCheesePizza();
        } else if (type.equals("chicken")) {
            pizza = new ChicagoChickenPizza();
        } else {
            System.out.println("No such pizza in menu!");
        }

        return pizza;
    }
}
