public class Local {
    private int key;
    private String value;

    public void setItem(int key, String value){
        this.key = key;
        this.value = value;
    }

    public void getItem(int key){
        if (key == this.key){
            System.out.println(value);
            System.out.println(key);
            
        }
        else{
            System.out.println(" nama tidak ditemukan");
        }
    }

    public void removeItem(int key){
        if (key == this.key){
            value = "null";
            key = 0;
        }
        else{
            System.out.println("tidak ada");
        }
    }

}
