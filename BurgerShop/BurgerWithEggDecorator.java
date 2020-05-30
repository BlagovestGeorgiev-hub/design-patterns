package BurgerShop;

public class BurgerWithEggDecorator {

    private String egg;

    private Burger burger;

    public BurgerWithEggDecorator(Burger burger) {
        this.setEgg("Egg");
        this.setBurger(burger);
    }

    public void setEgg(String egg) {
        this.egg = egg;
    }

    public void setBurger(Burger burger) {
        this.burger = burger;
    }

    @Override
    public String toString() {
        return "Burger With Egg{" +
                "egg='" + egg + '\'' +
                ", burger=" + burger +
                '}';
    }
}
