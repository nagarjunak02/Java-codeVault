package Core.ComparableInterface;

public class Pen implements Comparable<Pen>{
    private String color;
    private Double price;

    public Pen(String color,Double price){
        this.color = color;
        this.price = price;
    }

    public String getColor(){
        return this.color;
    }
    public Double getPrice(){
        return this.price;
    }

    public void setColor(String  color){
        this.color = color;
    }
    public void setPrice(Double price){
        this.price = price;
    }


    @Override
    public int compareTo(Pen p){
        return this.getPrice().compareTo(p.getPrice());
    }

    public static void main(String[] args) {
        Pen p1 = new Pen("Black",5.0);
        Pen p2 = new Pen("Blue",6.0);

        System.out.println(p1.compareTo(p2));
        System.out.println(p1.compareTo(p1));
    }
}
