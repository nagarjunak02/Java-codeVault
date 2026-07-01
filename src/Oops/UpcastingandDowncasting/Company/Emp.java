package Oops.UpcastingandDowncasting.Company;

public class Emp {
    String company;

    Emp(String company){
        this.company = company;
    }

    void work(){
        System.out.println("Working in company: "+this.company);
    }
}
