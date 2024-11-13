package Product;

public class Product {
    String name;
    String description;
    int price;
    String brand;
    String color;
    

    public Product(String name, String description, int price, String brand, String color){
        this.name = name;
        this.description = description;
        this.price = price;
        this.brand = brand;
        this.color = color;
    }

    public void getInfo(){
        System.out.println("Product ini " + name + ", " + description + ", dibandrol dengan harga "  + price + " rp");
    }
}
