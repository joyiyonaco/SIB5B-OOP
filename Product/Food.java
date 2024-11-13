package Product;

public class Food extends Product{
    boolean expired;

    public Food(String name, String description, int price, String brand, String color, boolean expired){
        super(name, description, price, brand, color);
        this.expired = expired;
    }


    public void displayExpirationInfo() {
        if (expired == true) {
            System.out.println("Produk makanan ini sudah kedaluwarsa.");
        } else {
            System.out.println("Produk makanan ini masih layak konsumsi.");
        }
    }
}
