package UTS;

public class Permanent {
    String transportation;
    String takedayoff;


    public void setTakedayoff(String takedayoff){
        this.takedayoff = takedayoff;
        System.out.println("Mendapatkan " + this.takedayoff);
    }

    public void setTransportation(String transportation){
        this.transportation = transportation;
        System.out.println("Mendapatkan " + this.transportation);
    }

    public void getBenefit(){
        
    }
}
