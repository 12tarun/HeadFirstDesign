package abstractfactorypattern;

import abstractfactorypattern.pizza.Pizza;
import abstractfactorypattern.pizzastore.*;


public class ThePizzaApp {
    public static void main(String[] args) {
        PizzaStore pizzaBakeryStore = new PizzaBakeryStore();
        PizzaStore brikOvenStore = new BrikOvenStore();

        System.out.println("Harvey placed a cheese pizza order from PizzaBakeryStore.");
        Pizza pizzaOrder1 = pizzaBakeryStore.orderPizza("cheese");
        System.out.println("Harvey received: " + pizzaOrder1.getName());

        System.out.println("Jessica placed a farmhouse pizza order from PizzaBakeryStore.");
        Pizza pizzaOrder2 = pizzaBakeryStore.orderPizza("farmhouse");
        System.out.println("Jessica received: " + pizzaOrder2.getName());

        System.out.println("Donna placed a cheese pizza order from BrikOvenStore.");
        Pizza pizzaOrder3 = brikOvenStore.orderPizza("cheese");
        System.out.println("Donna received: " + pizzaOrder3.getName());

        System.out.println("Mike placed a farmhouse pizza order from BrikOvenStore.");
        Pizza pizzaOrder4 = brikOvenStore.orderPizza("farmhouse");
        System.out.println("Mike received: " + pizzaOrder4.getName());
    }
}
