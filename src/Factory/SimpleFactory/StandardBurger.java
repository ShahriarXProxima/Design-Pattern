package Factory.SimpleFactory;

public class StandardBurger extends Burger{
    @Override
    void prepare(String s) {
        super.prepare("Prepare a standard burger");
    }
}
