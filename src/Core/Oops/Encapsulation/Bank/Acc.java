package Core.Oops.Encapsulation.Bank;

public class Acc {
    private String name;
    private double bal;

    public void setName(String name){
        this.name = name;
    }

    public void setBal(double bal){
        if(bal>=0){
            this.bal = bal;
        }else{
            System.out.println("Invlaid Bal");
        }
    }

    public String getName(){
        return name;
    }

    public double getBal(){
        return bal;
    }

}
