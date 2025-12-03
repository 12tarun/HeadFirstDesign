package abstractfactorypattern.pizza;

import abstractfactorypattern.pizzaingredientfactory.PizzaIngredientFactory;

public class CheesePizza extends Pizza {
    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        name = "Cheese Pizza";
        this.ingredientFactory = ingredientFactory;
    }
}
