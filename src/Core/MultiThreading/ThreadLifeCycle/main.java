package Core.MultiThreading.ThreadLifeCycle;

public class main extends  Thread {
    @Override
    public void run() {
        System.out.println();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        main t = new main();
        System.out.println(t.getState());//NEW
        t.start();
        System.out.println(t.getState());//Runnable
        Thread.sleep(100);
        System.out.println(t.getState());
        t.join();
        System.out.println(t.getState()


        );

    }
}
