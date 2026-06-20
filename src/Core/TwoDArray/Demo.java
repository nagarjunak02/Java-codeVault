package Core.TwoDArray;
public class Demo {
    public static void main(String[] args) {

        int[][] arr = new int[3][4];

        /*System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);*/

        System.out.println(System.identityHashCode(arr[0]));
        System.out.println(System.identityHashCode(arr[1]));
        System.out.println(System.identityHashCode(arr[2]));
    }
}