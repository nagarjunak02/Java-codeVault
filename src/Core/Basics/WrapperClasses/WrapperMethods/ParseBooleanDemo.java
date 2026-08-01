package Core.Basics.WrapperClasses.WrapperMethods;

import Core.Oops.Interface.NoDimondProblem.B;

public class ParseBooleanDemo {
    public static void main(String[] args) {

        String s = "true";

        boolean flag = Boolean.parseBoolean(s);

        System.out.println(flag);

        System.out.println(Boolean.parseBoolean("TrUe"));
        System.out.println(Boolean.parseBoolean("tRUE"));
        System.out.println(Boolean.parseBoolean("Hello"));
    }
}