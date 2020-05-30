package BurgerShop;

public class ClassicBurgerDecorator {

    private Burger burger;

    public ClassicBurgerDecorator(Burger burger) {
        this.setBurger(burger);
    }

    public void setBurger(Burger burger) {
        this.burger = burger;
    }

    @Override
    public String toString() {
        return "Classic Burger{" +
                "burger=" + burger +
                '}';
    }
}
