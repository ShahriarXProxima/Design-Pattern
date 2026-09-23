package Factory.SimpleFactory;

public class BasicBurger extends Burger {
    @Override
    public void prepare(){
        System.out.println("Prepare a basic Burger");
    }
}
