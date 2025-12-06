package Product;

import java.util.ArrayList;

public  class CartProduct  implements ProductFunctions{
            ProductMain productMainInherance;
    protected ArrayList<String> productMainCartNames = new ArrayList<>();
    protected ArrayList<Double> productMainCartPrices = new ArrayList<>();

    protected int quantityItems;

    private int getQuantityItems() {
        return quantityItems;
    }

    public CartProduct(String productName, Double pricePerUnity){

    }

    public void addCartItems(String productName, Double pricePerUnity){
            productMainCartNames.add(productName);
            productMainCartPrices.add(pricePerUnity);
    }

    //adding stuff to the e-comerce cart
    public  CartProduct(){
        this.quantityItems = productMainCartNames.size();
    }


    //setting up finalPrice
    @Override
    public void calculateFinalValueDigitalProduct() {
            Double temporaryVariableTax = productMainInherance.getPricePerUnity() * productMainInherance.getTaxForDigitalProducts() / this.quantityItems;
            productMainInherance.setFinalPrice(temporaryVariableTax + (productMainInherance.getPricePerUnity() * this.quantityItems));
    }

    @Override
    public void calculateFinalValueFisicProduct() {
            Double temporaryVariableTax = productMainInherance.getTaxForFisicalProducts() * productMainInherance.getPricePerUnity() / this.getQuantityItems();
            productMainInherance.setFinalPrice(temporaryVariableTax + (productMainInherance.getPricePerUnity() * this.getQuantityItems()));
    }


    public void showInfo(){
        System.out.println("Name: " + productMainInherance.getProductName());
        System.out.println("Price Per Unity: " + productMainInherance.getPricePerUnity());
        System.out.println("Quantity: " + String.format("%.2f", productMainInherance.getPricePerUnity()));
        System.out.println("Final Price: " + String.format("%.2f", productMainInherance.getFinalPrice()));
    }
}
