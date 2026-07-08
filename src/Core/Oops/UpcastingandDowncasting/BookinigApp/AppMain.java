package Core.Oops.UpcastingandDowncasting.BookinigApp;

public class AppMain {
    public static void main(String[] args) {
//        Application a;
//        a = new Irctc("Hospet","Bengluru",1222222);
//        ((Irctc) a).bookTicket();
//
//        System.out.println();
//
//        a = new Ksrtc("Hospet","Bengluru",122);
//        ((Ksrtc)a).bookTicket();

        accessObject(new Irctc("Hospet","Bengluru",1222222));
        System.out.println();
        accessObject(new Ksrtc("Hospet","Bengluru",1222222));

    }

    private static void accessObject(Application a) {
        if(a instanceof Irctc){
            ((Irctc)a).bookTicket();
        }else if(a instanceof Ksrtc){
            ((Ksrtc)a).bookTicket();
        }
    }
}
