package Core.Oops.Constructor;

public class Student1 {
    int id;
    String name;
    double per;
    static String cllg;

    Student1(int id, String name, double per){
        this.id = id;
        this.name = name;
        this.per = per;
    }
    void studentDisplay(){
        System.out.println("Id:"+this.id+" name: "+this.name+" from collage : "+Student1.collage()+" got marks: "+per);

    }
    static String collage(){
        return Student1.cllg;
    }
}
