package factorypattern.pizza;

public class NewYorkChickenPizza extends Pizza {
    public NewYorkChickenPizza() {
        name = "New York Style Chicken Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Chicken");
        toppings.add("Chilli");
    }
}
