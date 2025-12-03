import Product.Cart;
import Product.ProductMain;

import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        ProductMain productMainInstance = null;
        Cart productCart = null;


        int quantity;

        System.out.println("Enter quantity of products to be added at the cart: ");
        quantity = scanner.nextInt();

       for(int index = 0; index <= quantity ; index++){

           System.out.println("Product Name: ");
           scanner.next();
           String productName = scanner.nextLine();
           System.out.println("Product value: ");
           double productValue = scanner.nextDouble();
           System.out.println("Product Quantity: ");
           int productQuantity = scanner.nextInt();

            productMainInstance = new ProductMain(productName, productQuantity, productValue);
             productCart = new Cart(productMainInstance);
            productCart.addProductToCart(productMainInstance);

       }

       productCart.showCartProducts();







        scanner.close();
    }
}