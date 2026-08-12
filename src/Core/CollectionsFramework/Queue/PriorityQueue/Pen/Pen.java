package Core.CollectionsFramework.Queue.PriorityQueue.Pen;

public class Pen implements Comparable<Pen>{
    String color;
    Double price;

    public Pen(String color, Double price) {
        this.color = color;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Pen o) {
        return this.getPrice().compareTo(o.getPrice());
    }
}
