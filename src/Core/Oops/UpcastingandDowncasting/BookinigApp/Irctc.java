package Core.Oops.UpcastingandDowncasting.BookinigApp;

public class Irctc extends Application{
    int tno;

    public Irctc(String src, String dest, int tno) {
        super(src, dest);
        this.tno = tno;
    }

        void bookTicket(){
            System.out.println("Ticekt no. : "+this.tno+" \n from : "+super.src+" \nTo : "+super.dest);
        }
}
