package Core.Oops.Relationships.HasARelationship.Aggregation.DeptProf;

public class Dept {
    String dept;
    Professor p ;

    Dept(String dept,Professor o){
        this.dept = dept;
        this.p = o;
    }


    void displayDept(){
        System.out.println("Department:" +this.dept);
        p.dispayProf();
    }
}
