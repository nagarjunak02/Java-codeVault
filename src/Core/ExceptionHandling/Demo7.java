package Core.ExceptionHandling;

public class Demo7 {
    public static void main(String[] args) {

        // Exception object without a custom message
        Exception e = new Exception();

        System.out.println("----- Exception without message -----");

        // Calls toString() internally
        System.out.println(e);

        // Returns only the message (null)
        System.out.println(e.getMessage());

        // Prints complete exception details
        e.printStackTrace(System.out);

        System.out.println();

        // Exception object with a custom message
        Exception e1 = new Exception("I am bad..");

        System.out.println("----- Exception with message -----");

        // Calls toString() internally
        System.out.println(e1);

        // Returns only the custom message
        System.out.println(e1.getMessage());

        // Prints complete exception details
        e1.printStackTrace();
    }
}