package Core.Oops.Relationships.HasARelationship.Aggregation.Whatsapp;

public class Whatsapp {
    long num;
    String name;
    Payment pay;

    Whatsapp(long num,String name,Payment pay){
        this.name = name;
        this.num = num;
        this.pay = pay;
    }

    void msg(){
        System.out.println("Hello");
    }
    void doPayment(){
        pay.transtaionDetails();
    }
}
