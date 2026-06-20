package Core.Object.Application;

public class KsrtcApp {
    String from;
    String to;
    int seat;

    void book(){
        System.out.println("Booked ticket from: "+from+" to :"+to+" and seat number is :"+seat);
    }
    void startJr(){
        System.out.println("Started journy from: "+from+" to :"+to+" and seat number is :"+seat);

    }
}
