package decoratorpattern.condiments;

import decoratorpattern.beverages.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
