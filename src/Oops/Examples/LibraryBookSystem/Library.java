package Oops.Examples.LibraryBookSystem;

public class Library {
    String title;
    String author;
    double price;
    static  String library;

    public Library(String title) {
        this.title = title;
    }

    public Library(String title, String author) {
        this(title);
        this.author = author;
    }
    static {
        System.out.println("Library static blk");
        Library.library = "Central Library";
    }





    public Library(String title, String author, double price) {
        this(title,author);
        this.price = price;
    }

    void display(){
        System.out.println("Title : "+this.title+" Author: "+this.author+" Price : "+this.price+" from library : "+Library.library);
    }

    void display(String cur){
        System.out.println("Title : "+this.title+" Author: "+this.author+" Price : "+this.price+" from library : "+Library.library);
        System.out.println("Currency : "+cur);
    }

    {
        System.out.println("Library Non Static blk");
        this.price = 255.0;
    }
}
