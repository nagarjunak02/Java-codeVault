package Core.Oops.ObjectMethods.Fan;

public class Fan {
    String brand;
    String color;

    public Fan(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    @Override
    public String toString(){
        return "Brand "+this.brand+" color "+this.color;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Fan){
            Fan f = (Fan) obj;
//            return this.brand.equals(f.brand)  && this.color.equals(f.color);
            return this.toString().equals(f.toString());
        }
        return false;
    }
}
