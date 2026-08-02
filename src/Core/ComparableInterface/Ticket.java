package Core.ComparableInterface;

public class Ticket implements Comparable<Ticket>{
    String from;
    String to;

    Ticket(String from,String to){
        this.from = from;
        this.to = to;
    }

    @Override
    public int compareTo(Ticket o) {
        return this.from.compareTo(o.from);
    }

    public static void main(String[] args) {
        Ticket t1 = new Ticket("Beng","hpt");
        Ticket t2 = new Ticket("Beng","hpt");
        int res = t1.compareTo(t2);
        if(res == 0){
            System.out.println("Same boarding location");
        }else{
            System.out.println("Diffrent boarding location");
        }

    }
}
