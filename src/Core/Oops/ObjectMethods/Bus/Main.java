package Core.Oops.ObjectMethods.Bus;

public class Main {
    public static void main(String[] args) {
        Ksrtc k = new Ksrtc("b","m");
        Ksrtc k1 =new Ksrtc("b","l");

        System.out.println(k1.equals(k));
    }
}
