package Core.Oops.UpcastingandDowncasting.Company;

public class Developer extends Emp{
    String lang;
    Developer(String company,String lang) {
        super(company);
        this.lang = lang;
    }

    void code(){
        System.out.println("Coding with lang: "+this.lang+" in company: "+super.company);
    }
}
