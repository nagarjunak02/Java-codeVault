package Core.Oops.MethodOverriding.MovieBookingApp;

public class App {
    String moviename;
    String upi;
    double cash;
    int rating;

    App(){
        System.out.println("He knows ntg ask and define each term..");
    }

    App(String moviename){
        this.moviename = moviename;
    }

    App(String moviename,int rating){
        this.moviename = moviename;
        this.rating = rating;
    }

    App(String moviename,String upi,int rating){
        this.moviename = moviename;
        this.upi = upi;
        this.rating = rating;

    }

    App(String moviename,double cash,int rating){
        this.moviename = moviename;
        this.cash = cash;
        this.rating = rating;

    }

    void display(){
        System.out.println("he knows ntg");
    }

    void display(String moviename){
        System.out.println("he know moviename : "+this.moviename);
    }

    void display(String moviename,int rating){
        System.out.println("he knows  moviename: "+this.moviename+" ,rating "+this.rating);
    }

    void display(String moviename,String upi,int rating){
        System.out.println("he knows moviename" +this.moviename+" ,and upi "+this.upi+" ,rating : "+this.rating);
    }

    void display(String moviename,double cash,int rating){
        System.out.println("he knows moviename : "+this.moviename+" ,and cash : "+this.cash+" ,rating: "+this.rating);
    }



}
