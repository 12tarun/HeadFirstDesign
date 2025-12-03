package abstractfactorypattern.pizzastore;

import abstractfactorypattern.pizza.*;
import abstractfactorypattern.pizzaingredientfactory.*;

public class BrikOvenStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory chicagoPizzaIngredientFactory = new ChicagoPizzaIngredientFactory();
        PizzaIngredientFactory newYorkPizzaIngredientFactory = new NewYorkPizzaIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(chicagoPizzaIngredientFactory);
        } else if (type.equals("farmhouse")) {
            pizza = new FarmhousePizza(newYorkPizzaIngredientFactory);
        }
        return pizza;
    }
}
