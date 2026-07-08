package Oops.Polymorphism.DebitCard;

public class MetroCard extends DebitCard{
    int bal;

    MetroCard(long cno, int cvv, int debitLimt,int bal) {
        super(cno, cvv, debitLimt);
        this.bal = bal;
    }

    @Override
    void swipeCard() {
        super.swipeCard();
        System.out.println("Avaliable metro balance is: "+this.bal);
    }
}
