package Product;

public  class ProductMain extends CartProduct{


    protected String productName;
    protected Double pricePerUnity;
    protected Double finalPrice;
    protected final Double taxForDigitalProducts = 10.00;
    protected final Double taxForFisicalProducts = 15.00;

    CartProduct cartProductInherance;



    protected void setFinalPrice(Double finalPrice) {
        this.finalPrice = finalPrice;
    }

    protected Double getPricePerUnity() {
        return pricePerUnity;
    }

    protected Double getTaxForDigitalProducts() {
        return taxForDigitalProducts;
    }

    protected Double getTaxForFisicalProducts() {
        return taxForFisicalProducts;
    }

    protected String getProductName() {
        return productName;
    }

    protected Double getFinalPrice() {
        return finalPrice;
    }
}
