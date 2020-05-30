package BurgerShop;

public class Main {
    public static void main(String[] args) {

        BurgerShopFacade burgerShopFacade = new BurgerShopFacade();
        System.out.println(burgerShopFacade.cookBurgerWithCheese());
        System.out.println(burgerShopFacade.cookClassicBurger());
        System.out.println(burgerShopFacade.cookBurgerWithEgg());
    }
}
