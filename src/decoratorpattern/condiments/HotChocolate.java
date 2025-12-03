package decoratorpattern.condiments;

import decoratorpattern.beverages.Beverage;

public class HotChocolate extends CondimentDecorator {
    Beverage beverage;
    public HotChocolate(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", HotChocolate";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.50;
    }
}
