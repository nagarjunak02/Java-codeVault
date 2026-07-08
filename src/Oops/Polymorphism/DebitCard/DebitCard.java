package Oops.Polymorphism.DebitCard;

public class DebitCard extends Card{
    int debitLimt;
    DebitCard(long cno, int cvv,int debitLimt) {
        super(cno, cvv);
        this.debitLimt =debitLimt;
    }

    void swipeCard(){
        System.out.println("Swiped Sucess without reacing debit Limt");
    }
}
