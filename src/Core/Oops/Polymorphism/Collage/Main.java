package Core.Oops.Polymorphism.Collage;

public class Main {
    public static void main(String[] args) {
        accessObject(new Engi());
        System.out.println();
        accessObject(new Medi());
        System.out.println();
        accessObject(new Collage());


    }
    static void accessObject(Object o){
        if(o instanceof Collage c){
            c.conductExam();
        }
    }
}
