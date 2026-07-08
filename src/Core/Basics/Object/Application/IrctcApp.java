package Core.Basics.Object.Application;

public class IrctcApp {
    String berth;
    int seatNo;
    int coach;
    String tname;

    void book(){
        System.out.println("Booked ticket in Train"+tname+" in coach "+coach+" seatno is: "+seatNo+" berth: "+berth);
    }
    void startJr(){
        System.out.println("Started journy in Train"+tname+" in coach "+coach+" seatno is: "+seatNo+" berth: "+berth);

    }
}
