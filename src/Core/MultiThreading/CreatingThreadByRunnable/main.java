package Core.MultiThreading.CreatingThreadByRunnable;

public class main {
    public static void main(String[] args) {
        World w = new World();
        Thread t = new Thread(w);
        t.start();
        for (int i =0; i<100;i++){
            System.out.println("Hello");
        }
        System.out.println(t.getName());
        System.out.println(Thread.currentThread().getName());
    }
}
