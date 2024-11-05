public class Quis {
    public String key;           
    private String value;
    private int expired;

    public void setItem(String key, String value, int expired){
        this.key = key;
        this.value = value;
        this.expired = expired;
    }

    public void getItem(String key){
        if (key == this.key){
            System.out.println(value);
            
        }

        else{
          System.out.println("key tidak di temukan");   
        }
       
    }

    public void removeItem(String key){
        if (key == this.key){
            value = "null";
            key = "null";
        }
        else{
            System.out.println("key tidak di temukan");
        }
    }

    public void expired(int expired){
        if (expired >= this.expired){
            value = "null";
        }
        else if(expired <= this.expired){
            System.out.println("key belum expired");

        }
    }


   

}
