package decorator_pattern;

public class CoffeShop {
    public static void main(String[] args) {
        Beverage espresso= new Espresso();
        System.out.println(espresso.getDescription()+" $"+espresso.cost());

        Beverage beverage= new Espresso();
        beverage=new ExtraMilk(beverage);
        System.out.println(beverage.getDescription()+" $"+beverage.cost());

    }
}
