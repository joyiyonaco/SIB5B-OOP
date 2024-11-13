package Product;

public class Electronics extends Product {
    int warranty;

    public Electronics(String name, String description, int price, String brand, String color, int warranty){
        super(name, description, price, brand, color );
        this.warranty = warranty;

    }
    public void getinfoWarranty(){
        System.out.println(" Dengan garansi" + this.warranty + "tahun");
    }
}
