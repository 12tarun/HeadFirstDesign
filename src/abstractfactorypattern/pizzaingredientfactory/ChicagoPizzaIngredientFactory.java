package abstractfactorypattern.pizzaingredientfactory;

import abstractfactorypattern.ingredients.cheese.*;
import abstractfactorypattern.ingredients.dough.*;
import abstractfactorypattern.ingredients.sauce.*;
import abstractfactorypattern.ingredients.topping.Topping;
import abstractfactorypattern.ingredients.topping.Veggie;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new Sourdough();
    }

    @Override
    public Sauce createSauce() {
        return new Tangy();
    }

    @Override
    public Cheese createCheese() {
        return new Ricotta();
    }

    @Override
    public Topping createTopping() {
        return new Veggie();
    }
}
