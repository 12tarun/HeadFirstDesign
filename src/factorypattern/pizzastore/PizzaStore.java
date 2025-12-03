package factorypattern.pizzastore;

import factorypattern.pizza.Pizza;

public abstract class PizzaStore extends Pizza {

    public abstract Pizza createPizza(String type);

    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
