package Factory.SimpleFactory;

public class PremiumBurger extends Burger {
    @Override
    void prepare(String s) {
        super.prepare("Prepare a premium burger");
    }
}
