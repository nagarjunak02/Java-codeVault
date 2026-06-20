package Core.Command_Line_Args;

public class SumMain {
    public static void main(String[] args) {
        int sum = 0;
        for(String i : args){
                int e = Integer.parseInt(i);
                sum = sum+ e;
        }
        System.out.println(sum);
    }
}
