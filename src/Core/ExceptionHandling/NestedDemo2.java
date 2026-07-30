package Core.ExceptionHandling;
public class NestedDemo2 {

    public static void main(String[] args) {

        try {

            System.out.println("Outer Try");

            try {

                System.out.println("Inner Try");

                int[] arr = new int[2];
                System.out.println(arr[5]);

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
