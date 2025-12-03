package factorypattern.pizzastore;
import factorypattern.pizza.*;

public class NewYorkPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new NewYorkCheesePizza();
        } else if (type.equals("chicken")) {
            pizza = new NewYorkChickenPizza();
        } else {
            System.out.println("No such pizza in menu!");
        }

        return pizza;
    }
}
