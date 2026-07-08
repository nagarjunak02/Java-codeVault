package Core.Oops.Relationships.HasARelationship.Aggregation.Whatsapp;

public class Main {
    public static void main(String[] args) {
        Payment p = new Payment("123@ybl",123);
        Whatsapp w = new Whatsapp(12334445l,"arjun",p);
        w.msg();
        w.doPayment();
    }
}
