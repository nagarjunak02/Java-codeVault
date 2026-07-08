package Core.Oops.Polymorphism.Electronics;

public class main {
    public static void main(String[] args) {
        accessObject(new Mobile("Vivo",23000,8));

    }

    static void accessObject(Object o){
        if(o instanceof Electronics e){
            e.displayTime();
        }
    }
}
