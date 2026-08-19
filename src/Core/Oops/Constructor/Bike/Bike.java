package Core.Oops.Constructor.Bike;

public class Bike {
    String color;
    int cc;

   Bike(String color){
       this.color =color;
   }

   Bike(Bike e,int cc){
       this.color = e.color;
       this.cc = cc;
   }

}
