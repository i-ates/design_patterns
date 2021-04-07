package decorator_pattern;

public class ExtraMilk extends CondimentDecorator{
    Beverage beverage;

    public ExtraMilk(Beverage beverage){
        this.beverage=beverage;
    }

    @Override
    public double cost() {
        return beverage.cost()+0.20;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+"+ extra milk";
    }
}
