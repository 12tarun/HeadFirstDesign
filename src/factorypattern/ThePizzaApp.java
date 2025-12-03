package factorypattern;

import factorypattern.pizzastore.*;
import factorypattern.pizza.Pizza;

public class ThePizzaApp {
    public static void main(String[] args) {
        PizzaStore newYorkPizzaStore = new NewYorkPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        System.out.println("Harvey placed a chicken pizza order from NewYorkPizzaStore.");
        Pizza pizzaOrder1 = newYorkPizzaStore.orderPizza("chicken");
        System.out.println("Harvey received: " + pizzaOrder1.getName());

        System.out.println("Jessica placed a cheese pizza order from NewYorkPizzaStore.");
        Pizza pizzaOrder2 = newYorkPizzaStore.orderPizza("cheese");
        System.out.println("Jessica received: " + pizzaOrder2.getName());

        System.out.println("Donna placed a chicken pizza order from ChicagoPizzaStore.");
        Pizza pizzaOrder3 = chicagoPizzaStore.orderPizza("chicken");
        System.out.println("Donna received: " + pizzaOrder3.getName());

        System.out.println("Mike placed a cheese pizza order from ChicagoPizzaStore.");
        Pizza pizzaOrder4 = chicagoPizzaStore.orderPizza("cheese");
        System.out.println("Mike received: " + pizzaOrder4.getName());
    }
}
