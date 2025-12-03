package factorypattern.pizza;

public class NewYorkCheesePizza extends Pizza {
    public NewYorkCheesePizza() {
        name = "New York Style Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano Cheese");
    }
}
