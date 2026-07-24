package Core.Oops.Encapsulation.Bank;

public class AccMain {
    public static void main(String[] args) {
        Acc a = new Acc();

        a.setName("A");
//        a.setBal(-1);
        a.setBal(1);

        System.out.println(a.getBal());
        System.out.println(a.getName());
    }
}
