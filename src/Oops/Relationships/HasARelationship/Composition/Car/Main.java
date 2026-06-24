package Oops.Relationships.HasARelationship.Composition.Car;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter brand,color,cc,nocyc u want: ");
        Scanner sc = new Scanner(System.in);
        String brand = sc.nextLine();
        String color = sc.nextLine();
        int cc = sc.nextInt();
        int nocyc = sc.nextInt();
        CarEx c = new CarEx(brand,color,cc,nocyc);
        c.displayCar();

    }
}


/*
 * Composition Example: Car HAS-A Engine
 *
 * Execution Flow:
 *
 * 1. User enters:
 *      brand
 *      color
 *      cc
 *      nocyc
 *
 * 2. Main creates only the Car object:
 *
 *      CarEx c =
 *      new CarEx(brand,color,cc,nocyc);
 *
 * 3. Inside CarEx constructor:
 *
 *      this.engine = new Engine(cc,nocyc);
 *
 *    Car creates the Engine object.
 *
 * 4. Engine object is NOT created in Main.
 *
 * 5. Engine object depends on Car object
 *    in this design.
 *
 * 6. Therefore:
 *
 *      Car HAS-A Engine
 *
 *    is a Composition relationship.
 *
 * Memory:
 *
 *      c
 *      |
 *      v
 *
 *   Car Object
 *   ----------
 *   brand
 *   color
 *   engine ------+
 *                |
 *                v
 *
 *          Engine Object
 *          -------------
 *          cc
 *          nocyc
 *
 * Important:
 *
 *      Parent Class  -> Car
 *      Child Class   -> Engine
 *
 *      Car creates Engine.
 *      Car owns Engine.
 *
 * Therefore it is Composition.
 *
 * Note:
 * Even though cc and nocyc are entered by the user,
 * the Engine object is still created by Car.
 *
 * User provides data.
 * Car creates the object.
 */

