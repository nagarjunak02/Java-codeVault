package Oops.Relationships.HasARelationship.Composition.HospitalDoctor;

import Core.Static.Static_Variable.SameName;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Hospital name and loc: ");
        String hname = sc.nextLine();
        String loc =  sc.nextLine();


        Hospital h = new Hospital(hname,loc,"Ravi","Cardiac");
        h.hospitalDetails();
    }

}
