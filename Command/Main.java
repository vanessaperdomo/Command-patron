import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> cart = new ArrayList<>();
        Invoker invoker = new Invoker();

        ICommand addProduct1 = new AddToCartCommand(new ShoppingCart(cart, "Laptop"));
        ICommand addProduct2 = new AddToCartCommand(new ShoppingCart(cart, "Smartphone"));
        ICommand addProduct3 = new AddToCartCommand(new ShoppingCart(cart, "Headphones"));

        invoker.executeCommand(addProduct1);
        invoker.executeCommand(addProduct2);
        invoker.executeCommand(addProduct3);
    }

}
