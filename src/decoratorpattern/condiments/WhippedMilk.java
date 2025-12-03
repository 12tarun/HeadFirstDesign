package decoratorpattern.condiments;

import decoratorpattern.beverages.Beverage;

public class WhippedMilk extends CondimentDecorator {
    Beverage beverage;
    public WhippedMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", WhippedMilk";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.40;
    }
}