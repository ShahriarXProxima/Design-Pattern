package Factory.SimpleFactory;

public class BasicBurger extends Burger {
    @Override
    void prepare() {
        System.out.println("Prepare a basic burger");
    }
}
