package Product;

import java.util.List;

public class ProductMain {
    private String productName;
    private double productValue;
    private int productQuantity;


    public ProductMain(String productName, int productQuantity, double productValue) {
        this.productName = productName;
        this.productQuantity = productQuantity;
        this.productValue = productValue;
    }

    public ProductMain(ProductMain productMain) {
    }




    protected double getProductValue() {
        return productValue;
    }

    protected int getProductQuantity() {
        return productQuantity;
    }

    protected String getProductName() {
        return productName;
    }



    @Override
    public String toString() {
        return "Product Information : " + "\n Name: " + this.getProductName() + "\n Value: " + this.getProductValue() +
                "\n Quantity: " + this.getProductQuantity();

    }
}
