package Core.Oops.Relationships.CAR;

public class Engine {

    int cc;
    String fuelType;

    Engine(int cc, String fuelType){
        this.cc = cc;
        this.fuelType = fuelType;
    }

    void displayEngine(){
        System.out.println("Engine has cc : " +this.cc + "of fuleType : " +this.fuelType);
    }
}
