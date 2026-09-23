package Factory.SimpleFactory;

public class BasicBurger extends Burger {
    @Override
    void prepare(String s) {
        super.prepare("Prepare a basic burger");
    }
}
