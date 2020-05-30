package BurgerShop;

public class BurgerShopFacade {
    private ClassicBurgerDecorator classicBurgerDecorator;
    private BurgerWithEggDecorator burgerWithEggDecorator;
    private BurgerWithCheeseDecorator burgerWithCheeseDecorator;

    public BurgerShopFacade() {
    }

    public String cookClassicBurger(){
        this.classicBurgerDecorator = new ClassicBurgerDecorator(new BurgerImpl());
        return classicBurgerDecorator.toString();
    }

    public String cookBurgerWithEgg(){
        this.burgerWithEggDecorator = new BurgerWithEggDecorator(new BurgerImpl());
        return burgerWithEggDecorator.toString();
    }

    public String cookBurgerWithCheese(){
        this.burgerWithCheeseDecorator = new BurgerWithCheeseDecorator(new BurgerImpl());
        return burgerWithCheeseDecorator.toString();
    }
}
