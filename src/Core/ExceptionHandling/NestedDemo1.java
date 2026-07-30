package Core.ExceptionHandling;

public class NestedDemo1 {

    public static void main(String[] args) {

        try {

            System.out.println("Outer Try");

            try {

                System.out.println("Inner Try");

                String s = null;
                System.out.println(s.length());

            } catch (ArithmeticException e) {

                System.out.println("Inner Catch");

            }

            System.out.println("After Inner Try");

        } catch (Exception e) {

            System.out.println("Outer Catch");

        }

        System.out.println("Program End");
    }
}