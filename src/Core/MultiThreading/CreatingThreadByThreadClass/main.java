package Core.MultiThreading.CreatingThreadByThreadClass;

public class main {
    public static void main(String[] args) {
        World w = new World();
        w.start();

        for (int i =0;i<100000 ;i++){
            System.out.println("Hello");
        }
    }
}

/*
 A new class world is created that extends Thread class, The run method is overriden to define the code that constitue the new thread
 start method is called to initiate the thread
* */