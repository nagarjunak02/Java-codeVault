package Oops.Relationships.HasARelationship.Aggregation.Whatsapp;

public class Payment {
    String upiid;
    double amt;

    Payment(String upiid,double amt){
        this.upiid = upiid;
        this.amt = amt;

    }
    public void transtaionDetails() {
        System.out.println("Payment Processing....");
        System.out.println("Id: 123");
    }
}
