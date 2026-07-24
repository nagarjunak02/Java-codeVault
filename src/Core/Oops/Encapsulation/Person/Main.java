package Core.Oops.Encapsulation.Person;

public class Main {
    public static void main(String[] args) {

        Person p = new Person();
        p.setMno(801010100011l);
        System.out.println(p.getMno());

        p.setName("Abhi");
        System.out.println(p.getName());
    }
}
