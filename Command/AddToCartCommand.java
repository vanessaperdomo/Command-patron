public class AddToCartCommand implements ICommand {
    private ShoppingCart shoppingCart;

    public AddToCartCommand(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    @Override
    public void execute() {
        shoppingCart.addProduct();
    }

}
