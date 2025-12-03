package abstractfactorypattern.pizza;

import abstractfactorypattern.pizzaingredientfactory.PizzaIngredientFactory;

public class FarmhousePizza extends Pizza {

    public FarmhousePizza(PizzaIngredientFactory ingredientFactory) {
        name = "Farmhouse Pizza";
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        super.prepare();
        topping = ingredientFactory.createTopping();
        System.out.println("Adding topping... " + topping.getToppings());
    }
}
