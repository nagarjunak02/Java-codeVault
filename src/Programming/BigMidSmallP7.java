package Programming;

public class BigMidSmallP7 {
    public static void main(String[] args) {
        int a = 100;
        int b = 8989;
        int c =999;

        int big = (a>b&&a>c)?a:(b>c)?b:c;
        int small = (a<b&&a<c)?a:(b<c)?b:c;
        int mid = (a+b+c) - (big+small);
        System.out.println(small+" "+mid+" "+big);
    }
}
