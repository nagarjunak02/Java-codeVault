package Oops.Relationships.HasARelationship.Composition.HospitalDoctor;

public class Hospital {
    String hname;
    String loc;
    Doctor d;

    Hospital(String hname,String loc,String dname, String spec){
        this.hname = hname;
        this.loc = loc;
        this.d = new Doctor(dname, spec) ;
    }

    void hospitalDetails(){
        System.out.println("Hospital Name: "+this.hname+" Located in: "+this.loc);
        d.docDetails();
    }


}



/*
 * Composition Understanding:
 *
 * In Composition, the parent class creates and owns
 * the child object.
 *
 * The child object can be created:
 *
 * 1. During instance variable initialization
 *
 *      Doctor d = new Doctor("Ravi", "Cardiologist");
 *
 * 2. Inside the constructor
 *
 *      this.d = new Doctor(dname, spec);
 *
 * If child object details are fixed, it can be
 * initialized during instance variable declaration.
 *
 * If child object details depend on user input or
 * runtime values, it is usually initialized inside
 * the constructor.
 *
 * Important:
 * Composition does NOT depend on where the object is
 * created (instance variable or constructor).
 *
 * The real rule is:
 *
 *      Parent creates Child
 *      Parent owns Child
 *      Child lifecycle depends on Parent
 *
 * Example:
 *
 *      Hospital --> creates Doctor
 *
 * Therefore:
 *
 *      Hospital HAS-A Doctor
 *
 * is a Composition relationship.
 */
