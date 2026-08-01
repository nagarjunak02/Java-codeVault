package Core.Basics.WrapperClasses.WrapperMethods;

public class CompareMethodDemo2 {
    public static void main(String[] args) {

        int result = Integer.compare(30, 50);

        if(result > 0){
            System.out.println("First Number is Greater");
        }
        else if(result < 0){
            System.out.println("Second Number is Greater");
        }
        else{
            System.out.println("Both are Equal");
        }
    }
}