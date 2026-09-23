package Factory.SimpleFactory;

public class StandardBurger extends Burger{
    @Override
    void prepare() {
        System.out.println("Prepare a standard burger");
    }
}
