package Oops.Relationships.HasARelationship.Composition.Car;

public class Engine {
    int cc;
    int nocyc;

    Engine(int cc, int nocyc){
        this.cc = cc;
        this.nocyc = nocyc;
    }

    public void displayEngine(){
        System.out.println("CC: "+cc);
        System.out.println("No. of cylinder: "+nocyc);
    }
}

