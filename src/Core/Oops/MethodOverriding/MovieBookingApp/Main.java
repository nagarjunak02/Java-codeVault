package Core.Oops.MethodOverriding.MovieBookingApp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int loop = 10;

            while (loop == 10){
            System.out.println("Enter what u know \n1.u know nothing..\n2.u know movie name\n3. u know movie name and rating\n 4.moviename,upi,rating\n5.moviename,cash,rating\n6.for exit");
            int n = sc.nextInt();
            String moive;
            String upi;
            int rating;
            double cash;

            App a;
            switch (n){
                case 1:
                     a = new App();
                    a.display();
                    break;
                case 2:
                    System.out.println("Enter moive");
                    moive = sc.next();
                    a = new App(moive);
                    a.display(moive);
                    break;

                case 3:
                    System.out.println("Enter moive and rating : ");
                    moive = sc.next();
                    rating = sc.nextInt();
                    a = new App(moive,rating);
                    a.display(moive,rating);
                    break;
                case 4:
                    System.out.println("Enter moive ,upi and rating : ");
                    moive = sc.next();
                    upi = sc.next();
                    rating = sc.nextInt();
                    a = new App(moive,upi,rating);
                    a.display(moive,upi,rating);

                case 5:
                    System.out.println("Enter moviename,cash,rating");
                    moive = sc.next();
                    cash = sc.nextDouble();
                    rating = sc.nextInt();
                    a = new App(moive,cash,rating);
                    a.display(moive,cash,rating);
                    break;
                case 6:
                   loop = 7;
                    break;
                default:
                    System.out.println("enter valid choice....");

            }
            System.out.println("_______________________________________________________________________");
       }
    }
}
