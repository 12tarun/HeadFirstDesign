package abstractfactorypattern.pizzaingredientfactory;

import abstractfactorypattern.ingredients.cheese.*;
import abstractfactorypattern.ingredients.dough.*;
import abstractfactorypattern.ingredients.sauce.*;
import abstractfactorypattern.ingredients.topping.NonVeg;
import abstractfactorypattern.ingredients.topping.Topping;

public class NewYorkPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrust();
    }

    @Override
    public Sauce createSauce() {
        return new HotSweet();
    }

    @Override
    public Cheese createCheese() {
        return new Mozzarella();
    }

    @Override
    public Topping createTopping() {
        return new NonVeg();
    }
}
