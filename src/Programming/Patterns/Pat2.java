package Programming.Patterns;

public class Pat2 {
    public static void main(String[] args) {
        for(int i = 0; i<5;i++){
            for (int j = 0; j<5-i;j++){
                System.out.print((char)(65+i+j)+" ");
            }
            System.out.println();
        }
    }
}
