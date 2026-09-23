package Factory.SimpleFactory;

import java.util.Scanner;

public class Order {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Choose any of these burgers -> Basic, Standard, Premium: ");
        String type = input.next().toLowerCase();

        BurgerFactory myBurgerFactory = new BurgerFactory();
        Burger burger = myBurgerFactory.createBurger(type);

        burger.prepare();
    }
}
