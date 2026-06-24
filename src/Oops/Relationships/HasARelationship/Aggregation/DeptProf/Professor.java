package Oops.Relationships.HasARelationship.Aggregation.DeptProf;

public class Professor {

    String profName;
    String sub;

    Professor(String profName,String sub){
        this.profName = profName;
        this.sub = sub;
    }
    public void dispayProf() {
        System.out.println("Professor: "+this.profName+" take sub: "+this.sub);
    }
}
