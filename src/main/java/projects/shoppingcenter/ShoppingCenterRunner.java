package projects.shoppingcenter;

public class ShoppingCenterRunner {

    public static void main(String[] args) {

        ShoppingCenter product1 = new ShoppingCenter("chocolate", 20.0, 3);
        product1.informationOfProduct();

        ShoppingCenter product2 = new ShoppingCenter("sweatshirt", 500);
        product2.informationOfProduct();



    }
}
