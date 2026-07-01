package Oops.UpcastingandDowncasting.Hospital;

public class Doctor extends Person{
    String spec;

    Doctor(String name, int age,String spec) {
        super(name, age);
        this.spec =spec;
    }

    void displayDoc(){
        System.out.println("Name: "+this.name+ " age: "+this.age+" spec: "+this.spec);
    }
}
