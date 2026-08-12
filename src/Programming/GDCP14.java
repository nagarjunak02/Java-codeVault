package Programming;

public class GDCP14 {
    public static void main(String[] args) {
        System.out.println(getGDC(12,18));
        System.out.println(getLcm(12,18));
        System.out.println(12/ 61
                * 18);
    }

    private static int getLcm(int x, int y) {
        int max =(x>y)?x:y;
        for (int i = 1;true;i++){
            int prod = max*i;
            if(prod%x == 0 && prod%y == 0){
                return prod;
            }
        }

    }

    private static int getGDC(int i, int j) {
        while (true){
            if(i%j == 0) return j;

            int t = j;
            j = i%j;
            i =t;
        }

    }
}
