package abstractfactorypattern.pizzaingredientfactory;

import abstractfactorypattern.ingredients.dough.Dough;
import abstractfactorypattern.ingredients.sauce.Sauce;
import abstractfactorypattern.ingredients.cheese.Cheese;
import abstractfactorypattern.ingredients.topping.Topping;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Topping createTopping();
}
