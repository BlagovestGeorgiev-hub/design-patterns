package BurgerShop;

public class BurgerImpl implements Burger{

    private String bread;

    private String meat;

    public BurgerImpl() {
        this.bread = "Bread";
        this.meat = "Meat";
    }

    @Override
    public String toString() {
        return "Burger{" +
                "bread='" + bread + '\'' +
                ", meat='" + meat + '\'' +
                '}';
    }
}
