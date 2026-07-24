package Core.Oops.Interface.Single;

public class Main {
    public static void main(String[] args) {
        Employee e;
        e = new Developer();
        e.login();
        e.work();
        e.logout();
    }
}
