package projects.shoppingcenter;

import java.time.LocalDate;

public class ShoppingCenter {

    String productName;
    double productPrice;
    String expireDate;


    public ShoppingCenter(String productName, double productPrice, int expireDate) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.expireDate = LocalDate.now().plusMonths(expireDate).toString();
    }

    public ShoppingCenter(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
        expireDate = "There is no expire date of this product";
    }

    public void informationOfProduct(){
        System.out.println("The product name: " + productName);
        System.out.println("The product price: " + productPrice);
        System.out.println("The expire date of the product: " + expireDate);
    }



}
