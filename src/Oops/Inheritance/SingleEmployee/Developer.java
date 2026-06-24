package Oops.Inheritance.SingleEmployee;

public class Developer extends Employe{
    String language;
    String name;
    Developer(String company, int id,String language) {
        super(company, id);
        this.language = language;
    }
    static {
        System.out.println("Developer method static const");
    }

    {
        System.out.println("Developer method non static const");
    }

    void code(){
        System.out.println("Deleloper from company "+super.company+" has started coding in lang: "+this.language);
    }
    void displayDeveloper(){
        System.out.println("Developer name is : "+this.name);
    }
}
