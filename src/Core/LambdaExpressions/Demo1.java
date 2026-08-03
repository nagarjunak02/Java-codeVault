package Core.LambdaExpressions;

@FunctionalInterface
interface Demo{
    void show();
}

public class Demo1 {
    public static void main(String[] args) {
        Demo d = () ->{
            System.out.println("Hello");
        };
        d.show();

    }
}
