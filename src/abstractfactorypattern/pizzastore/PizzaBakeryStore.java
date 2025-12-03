package abstractfactorypattern.pizzastore;

import abstractfactorypattern.pizza.*;
import abstractfactorypattern.pizzaingredientfactory.*;

public class PizzaBakeryStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory newYorkPizzaIngredientFactory = new NewYorkPizzaIngredientFactory();
        PizzaIngredientFactory chicagoPizzaIngredientFactory = new ChicagoPizzaIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(newYorkPizzaIngredientFactory);
        } else if (type.equals("farmhouse")) {
            pizza = new FarmhousePizza(chicagoPizzaIngredientFactory);
        }
        return pizza;
    }
}
