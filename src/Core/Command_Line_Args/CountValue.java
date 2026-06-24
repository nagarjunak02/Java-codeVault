package Core.Command_Line_Args;

public class CountValue {
    public static void main(String[] args) {
        int icount =0,fcount=0;

        for(String s :args){
            float d = Float.parseFloat(s);
            int i = (int)d;
            if(d == i){
                icount++;
            }else{
                fcount++;
            }

        }
        System.out.println("int: "+icount);
        System.out.println("float: "+fcount);
    }
}
