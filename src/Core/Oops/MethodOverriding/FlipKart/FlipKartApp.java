package Core.Oops.MethodOverriding.FlipKart;

public class FlipKartApp {

    String upi;
    double cash;

    FlipKartApp(){
        System.out.println("zero para const");
    }

    FlipKartApp(String upi){
        System.out.println("string para const");
    }

    FlipKartApp(double cash){
        System.out.println("double para const");
    }

    FlipKartApp(String upi,double cash){
        System.out.println("String,double para const");
    }

    FlipKartApp(double cash,String upi){
        System.out.println("double,string para const..");
    }


    void display(){
        System.out.println("zero");
    }

    void display(int a){
        System.out.println("1 int para");
    }

    void display(double a){
        System.out.println("double para");
    }

    void display(int a,double b){
        System.out.println("two para");
    }
}
