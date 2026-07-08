package Core.Oops.UpcastingandDowncasting.BookinigApp;

public class Ksrtc extends Application{
    int bno;

    public Ksrtc(String src, String dest, int bno) {
        super(src, dest);
        this.bno = bno;
    }
    void bookTicket(){
        System.out.println("Ticekt no. : "+this.bno+" \n from : "+super.src+" \nTo : "+super.dest);
    }
}
