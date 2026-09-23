package Factory.SimpleFactory;

public class PremiumBurger extends Burger {
    @Override
    void prepare() {
        System.out.println("Prepare a premium burger");;
    }
}
