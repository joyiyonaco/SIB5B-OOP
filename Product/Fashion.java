package Product;

public class Fashion extends Product {
    String size;

    public Fashion(String name, String description, int price, String size){
        super(name, description, price);
        this.size = size;
    }
    
    public void getsize(){
        System.out.println("dengan ukuran " + size);
    }

}
