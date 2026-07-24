package Book;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Book> library = new ArrayList<>();

        while (true) {

            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Add Book");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. Display Books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();

                    boolean exists = false;

                    for (Book b : library) {
                        if (b.getId() == id) {
                            exists = true;
                            break;
                        }
                    }

                    if (exists) {
                        System.out.println("Book ID already exists!");
                    } else {
                        library.add(new Book(id, title));
                        System.out.println("Book added successfully!");
                    }
                    break;

                case 2:
                    System.out.print("Enter Book ID to borrow: ");
                    int borrowId = sc.nextInt();

                    boolean borrowed = false;

                    for (Book b : library) {
                        if (b.getId() == borrowId) {

                            if (b.isAvailable()) {
                                b.borrowBook();
                                System.out.println("Book borrowed successfully!");
                            } else {
                                System.out.println("Book is already borrowed.");
                            }

                            borrowed = true;
                            break;
                        }
                    }

                    if (!borrowed) {
                        System.out.println("Book not found.");
                    }

                    break;

                case 3:
                    System.out.print("Enter Book ID to return: ");
                    int returnId = sc.nextInt();

                    boolean returned = false;

                    for (Book b : library) {
                        if (b.getId() == returnId) {

                            if (!b.isAvailable()) {
                                b.returnBook();
                                System.out.println("Book returned successfully!");
                            } else {
                                System.out.println("Book is already available.");
                            }

                            returned = true;
                            break;
                        }
                    }

                    if (!returned) {
                        System.out.println("Book not found.");
                    }

                    break;

                case 4:
                    if (library.isEmpty()) {
                        System.out.println("No books available.");
                    } else {
                        System.out.println("\n------ Library Books ------");
                        for (Book b : library) {
                            System.out.println(b);
                        }
                    }
                    break;

                case 5:
                    System.out.println("Thank you for using Library Management System.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}