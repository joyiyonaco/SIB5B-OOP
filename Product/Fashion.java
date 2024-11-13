package Product;

public class Fashion extends Product {
    String size;

    public Fashion(String name, String description, int price, String brand, String size, String color){
        super(name, description, price, brand, color);
        this.size = size;
    }
    
    public void getsize(){
        System.out.println("dengan ukuran " + size);
    }

}
