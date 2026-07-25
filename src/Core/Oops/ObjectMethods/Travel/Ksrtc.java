package Core.Oops.ObjectMethods.Travel;

public class Ksrtc {

    private String src;
    private String dst;
    private double price;


    public void setSrc(String src) {
        this.src = src;
    }


    public void setDst(String dst) {
        this.dst = dst;
    }


    public void setPrice(double price) {
        this.price = price;
    }

    public String toString(){
        return "From "+src+" to "+dst+" with price of: "+price;
    }

}
