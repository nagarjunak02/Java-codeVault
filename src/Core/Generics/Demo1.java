package Core.Generics;
//Generic method

public class Demo1 {

    public static <T> T show(T value){
        return value;
    }

    public static void main(String[] args) {
        System.out.println(Demo1.show("a"));
        System.out.println(Demo1.show(1));
        System.out.println(Demo1.show("B"));
    }
}
