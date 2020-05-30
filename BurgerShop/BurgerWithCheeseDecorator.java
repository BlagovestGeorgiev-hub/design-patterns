package BurgerShop;

public class BurgerWithCheeseDecorator {

    private String cheese;

    private Burger burger;

    public BurgerWithCheeseDecorator(Burger burger) {
        this.setCheese("Cheese");
        this.setBurger(burger);
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public void setBurger(Burger burger) {
        this.burger = burger;
    }

    @Override
    public String toString() {
        return "Burger With Cheese{" +
                "cheese='" + cheese + '\'' +
                ", burger=" + burger +
                '}';
    }
}
