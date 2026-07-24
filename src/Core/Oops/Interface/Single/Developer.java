package Core.Oops.Interface.Single;

public class Developer implements Employee {
    @Override
    public void login() {
        System.out.println("Developer login succesful..");
    }

    @Override
    public void logout() {
        System.out.println("Developer Logout Succesful..");
    }

    @Override
    public void work() {
        System.out.println("Developer working...");
    }
}
