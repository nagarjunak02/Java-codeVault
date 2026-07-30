package Core.ExceptionHandling.SuppressedException;

class MyResourse2 implements AutoCloseable{
    @Override
    public void close() throws RuntimeException{
        throw new RuntimeException(" Close falied ");
    }
}


public class Demo3 {
    public static void main(String[] args) {
        try(MyResourse2 r = new MyResourse2()){
            throw new RuntimeException("Main Exception..");
        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
