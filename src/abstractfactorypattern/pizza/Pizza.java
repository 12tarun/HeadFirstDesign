package abstractfactorypattern.pizza;

import abstractfactorypattern.ingredients.cheese.Cheese;
import abstractfactorypattern.ingredients.dough.Dough;
import abstractfactorypattern.ingredients.sauce.Sauce;
import abstractfactorypattern.ingredients.topping.Topping;
import abstractfactorypattern.pizzaingredientfactory.PizzaIngredientFactory;

public abstract class Pizza {
    PizzaIngredientFactory ingredientFactory;
    String name;
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Topping topping;

    public void prepare() {
        if(ingredientFactory == null) {
            System.out.println("Ingredient Factory not found!");
            return;
        }
        System.out.println("Preparing... " + getName());
        dough = this.ingredientFactory.createDough();
        System.out.println("Tossing dough... " + dough.getDoughType());
        sauce = this.ingredientFactory.createSauce();
        System.out.println("Adding sauce... " + sauce.getFlavour());
        cheese = this.ingredientFactory.createCheese();
        System.out.println("Adding cheese... " + cheese.getCheeseType());
    }

    public void bake() {
        System.out.println("Bake for 25 minutes at 350F");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }
}
