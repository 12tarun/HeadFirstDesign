package decoratorpattern;

import decoratorpattern.beverages.Beverage;
import decoratorpattern.beverages.Decaf;
import decoratorpattern.beverages.Espresso;
import decoratorpattern.condiments.HotChocolate;
import decoratorpattern.condiments.WhippedMilk;

public class TheCoffeeShop {
    public static void main(String[] args) {
        Beverage beverage1 = new Espresso();
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

        Beverage beverage2 = new Decaf();
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage favouriteBeverage = new Espresso();
        favouriteBeverage = new HotChocolate(favouriteBeverage);
        favouriteBeverage = new HotChocolate(favouriteBeverage);
        favouriteBeverage = new WhippedMilk(favouriteBeverage);

        System.out.println(favouriteBeverage.getDescription() + " $" + String.format("%.2f", favouriteBeverage.cost()));

        Beverage occasionalBeverage = new Decaf();
        occasionalBeverage = new WhippedMilk(occasionalBeverage);
        occasionalBeverage = new WhippedMilk(occasionalBeverage);
        occasionalBeverage = new HotChocolate(occasionalBeverage);

        System.out.println(occasionalBeverage.getDescription() + " $" + String.format("%.2f", occasionalBeverage.cost()));
    }
}
