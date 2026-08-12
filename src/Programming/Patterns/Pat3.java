package Programming.Patterns;

public class Pat3 {
    public static void main(String[] args) {
        for(int i = 0; i<5;i++){
            for (int j = 0; j<5-i;j++){
                System.out.print((char) (65+4-j-i)+" ");
            }
            System.out.println();
        }
    }
}
