package Core.ExceptionHandling;

public class Dem01 {
    public static void main(String[] args) {

        int a = 10;
        int b = 0;
        int q = 0;
        try{
            q = a/b;
            throw new RuntimeException();
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }
        System.out.println(q);
    }
}
