package Core.Oops.Relationships.HasARelationship.Aggregation.DeptProf;

public class Main {
    public static void main(String[] args) {
        Professor p = new Professor("abc","Java");
        Dept d = new Dept("Ise",p);
//        d = null;
//        p.dispayProf();
        d.displayDept();

    }
}
