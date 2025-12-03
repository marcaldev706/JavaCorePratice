package Product;

import java.util.ArrayList;
import java.util.List;

public  class Cart extends ProductMain{
    private double cartFinalPrice;
    private List<ProductMain> productListCart;




    private double getCartFinalPrice() {
        return cartFinalPrice;
    }

    public Cart(ProductMain productMain) {
        super(productMain);
        this.productListCart = new ArrayList<>();
    }



    private void setCartFinalPrice(double cartFinalPrice) {
        this.cartFinalPrice = cartFinalPrice;
    }


    public void addProductToCart(ProductMain productMainCartObject){

       setCartFinalPrice(productMainCartObject.getProductQuantity() * productMainCartObject.getProductValue());
        productListCart.add(productMainCartObject);


    }

    public void showCartProducts(){

        System.out.println("Cart Final Price: " + this.getCartFinalPrice());
    }



}
