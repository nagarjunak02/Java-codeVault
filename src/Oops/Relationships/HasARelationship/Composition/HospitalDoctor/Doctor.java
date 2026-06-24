package Oops.Relationships.HasARelationship.Composition.HospitalDoctor;

public class Doctor {
    String dname;
    String spec;

    Doctor(String dname , String spec){
        this.dname = dname;
        this.spec = spec;
    }

    void docDetails(){
        System.out.println("Doctor: "+this.dname+" Specialization: "+this.spec);
    }
}
