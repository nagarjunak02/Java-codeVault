package Core.Oops.Interface.MultipleChanningConstructor;

public abstract class Application {

    String userName;
    final String pass;

    Application(String userName,String pass){
        this.pass = pass;
        this.userName  = userName;
    }

    abstract public void login();
    public void addToCart(){
        System.out.println("HII");
    }

}
