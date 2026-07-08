package Core.Oops.Polymorphism.DebitCard;

public class Card {
    long cno;
    int cvv;

    Card(long cno,int cvv){
        this.cno = cno;
        this.cvv = cvv;
    }

    void swipeCard(){
        System.out.println("Card swipped sucessfull...");
    }
}
