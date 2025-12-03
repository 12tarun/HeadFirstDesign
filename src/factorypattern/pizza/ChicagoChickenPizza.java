package factorypattern.pizza;

public class ChicagoChickenPizza extends Pizza {
    public ChicagoChickenPizza() {
        name = "Chicago Style Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Chicken");
        toppings.add("Pepper");
    }

    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
