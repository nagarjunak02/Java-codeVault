package Core.Oops.UpcastingandDowncasting.Hospital;

public class main {
    public static void main(String[] args) {
        Person p;
        Doctor d =  new Doctor("Arjun",22,"Cardiologist");
        p = d;

        p.displayPerson();
    }
}
