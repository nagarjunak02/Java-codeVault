package Core.Basics.WrapperClasses.WrapperMethods;

public class ParseDoubleDemo {
    public static void main(String[] args) {

        String s = "123.45";

        double num = Double.parseDouble(s);

        System.out.println(num);
        System.out.println(num + 10);
    }
}
