package Core.Basics.WrapperClasses.WrapperMethods;

public class CompareToDemo3 {

    public static void main(String[] args) {

        Integer a = 40;
        Integer b = 25;

        int result = a.compareTo(b);

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