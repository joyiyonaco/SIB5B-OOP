package Product;

public class Clothes extends Product{
    String size;

    public Clothes(String name, String description, int price, String brand, String size, String color){
        super(name, description, price, brand, color );
        this.size = size;
    }

    public void getsize(){
        System.out.println("dengan ukuran " + size);
    }

    public void getprice(){
        System.out.println("dengan harga" + price);


    }

}
