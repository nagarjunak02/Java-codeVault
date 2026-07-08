package Core.Oops.Abstraction.Product2;

public class Watch extends Electronics{

    String type;

    Watch(String brand, String color, String battType,String type) {
        super(brand, color, battType);
        this.type = type;
    }

    @Override
    void swithcOn() {
        System.out.println("Watch of: "+super.brand+" of color: "+super.color+" with battary type: "+super.battType+" watch : "+this.type+" has switched on");
    }

    @Override
    void swithcOff() {
        System.out.println("Watch of: "+super.brand+" of color: "+super.color+" with battary type: "+super.battType+" watch : "+this.type+" has switched off");
    }

    @Override
    void buy() {
        System.out.println("Watch of: "+super.brand+" of color: "+super.color+" with battary type: "+super.battType+" watch : "+this.type+" has brought on");

    }
}
