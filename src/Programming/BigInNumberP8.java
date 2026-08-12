package Programming;

public class BigInNumberP8 {
    public static void main(String[] args) {
        int n =88796;
        int big = 0;
        while (n!= 0){
            int dig = n%10;
            if(dig > big) big = dig;

            n = n/10;
        }
        System.out.println(big);

    }
}
