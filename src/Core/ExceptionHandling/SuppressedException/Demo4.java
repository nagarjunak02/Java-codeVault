package Core.ExceptionHandling.SuppressedException;

class MyResourse4 implements AutoCloseable{
    @Override
    public void close()  {
        System.out.println("Close success");
    }
}
public class Demo4 {
    public static void main(String[] args) {
        try(MyResourse4 r = new MyResourse4() ){
            System.out.println("Main try success");
        }
    }
}
