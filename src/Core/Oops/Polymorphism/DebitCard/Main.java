package Core.Oops.Polymorphism.DebitCard;

public class Main {
    public static void main(String[] args) {
        Card c ;
        c = new DebitCard(1122121212,122,10000);
        c.swipeCard();
        System.out.println();
        c = new MetroCard(1122121212,122,10000,121);
        c.swipeCard();
    }
}
