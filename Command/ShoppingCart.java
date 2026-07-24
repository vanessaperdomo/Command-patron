import java.util.List;

public class ShoppingCart {
    private List<String> cart;
    private String product;

    public ShoppingCart(List<String> cart, String product) {
        this.cart = cart;
        this.product = product;
    }

    public void addProduct() {
        cart.add(product);
        System.out.println(product + " Ha sido agregado al carrito.");
    }

}
