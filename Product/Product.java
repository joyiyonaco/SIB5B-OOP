package Product;

public class Product {
    String name;
    String description;
    int price;


    public Product(String name, String description, int price){
        this.name = name;
        this.description = description;
        this.price = price;

    }
    public void getInfo(){
        System.out.println("Product ini " + name + ", " + description + ", dibandrol dengan harga " + price +"RP");
    }
}
