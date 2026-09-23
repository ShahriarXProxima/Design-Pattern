package Factory.SimpleFactory;

public class BurgerFactory {
    Burger createBurger(String type) {
        switch (type) {
            case "basic" -> {
                return new BasicBurger();
            }
            case "standard" -> {
                return new StandardBurger();
            }
            case "premium" -> {
                return new PremiumBurger();
            }
            default -> {
                System.out.println("Invalid burger type");
                return null;
            }
        }
    }
}
