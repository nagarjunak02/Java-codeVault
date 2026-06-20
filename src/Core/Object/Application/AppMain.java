package Core.Object.Application;

public class AppMain {
    public static void main(String[] args) {
        IrctcApp i = new IrctcApp();
        i.tname = "Hampi Express";
        i.coach = 2;
        i.seatNo = 40;
        i.berth = "Mid";

        i.book();
        i.startJr();
        System.out.println("________________________________________________________");
        KsrtcApp k = new KsrtcApp();
        k.from = "Beng";
        k.to = "Hpt";
        k.seat = 33;

        k.book();
        k.startJr();
    }
}
