package Core.Oops.Constructor.Bike;

import Core.Oops.Interface.NoDimondProblem.B;

public class Main {
    public static void main(String[] args) {

        Bike b1 = new Bike("black");
        System.out.println(b1.color);

        Bike b2 = new Bike(b1,1100);
        System.out.println(b2.color);
        System.out.println(b2.cc);
    }
}
