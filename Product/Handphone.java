package Product;

public class Handphone extends Product {
    int warranty;

    public Handphone(String name, String description, int price,String brand, String color, int warranty){
        super(name, description, price, brand, color);
        this.warranty = warranty;

    }
    public void getinfoWarranty(){
        System.out.println(" Dengan garansi" + this.warranty + "tahun");
    }
}
