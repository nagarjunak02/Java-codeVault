package Core.Constructor.ConstructorExample;

public class Student {
    String cllg;

    Student(){
        cllg = "SVIT";
        System.out.println("Constructor");
        System.out.println("Collage is "+cllg);
    }

    {
        System.out.println("Non-Static Blk");
    }

}
