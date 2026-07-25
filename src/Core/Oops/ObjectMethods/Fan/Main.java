package Core.Oops.ObjectMethods.Fan;

public class Main {
    public static void main(String[] args) {
        Fan f1 = new Fan("A","C");
        Fan f2 = new Fan("A","C");

        System.out.println(f1);
        System.out.println(f2);

        System.out.println();

        System.out.println(f1.equals(f2));
    }
}
