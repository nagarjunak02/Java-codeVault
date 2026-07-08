package Core.Oops.Examples.LibraryBookSystem;

public class main {
    public static void main(String[] args) {
        Library l = new Library("Coding with me");
        l.display();
        l.display("Available");
        System.out.println("_____________________________");
        Library l1 = new Library("Java book","Arjun",250);
        l1.display("Available");

        System.out.println("_________________________");
        Library l2 = new Library("Java book","Arjun",250);
        l2.display("Available");
    }
}



/*
===============================================================================
                     JVM EXECUTION FLOW - LIBRARY PROGRAM
===============================================================================

1. javac compiles Library.java and Main.java.

2. During compilation, the compiler checks all constructor signatures.

      Library(String)
      Library(String, String)
      Library(String, String, double)

   and method signatures.

      display()
      display(String)

   Since all signatures are different, compilation succeeds.

3. JVM starts execution.

4. JVM first loads Main.class into the Method Area.

5. JVM starts execution from main().

6. JVM encounters:

      Library l = new Library("Coding with me");

7. Since Library.class is not loaded yet,
   JVM loads Library.class into the Method Area.

   Method Area contains:
   -------------------------------------
   • Class Metadata
   • Constructors
   • Methods
   • Static Variables
   • Static Block
   • NSB Information
   -------------------------------------

8. During Class Loading,

   Static variables receive default values.

      library = null

9. Static Block executes ONLY ONCE.

      static{
          library = "Central Library";
      }

   Now,

      library = "Central Library"

10. Compiler had already selected

      Library(String)

    during compilation because

      new Library("Coding with me")

    exactly matches

      Library(String)

11. JVM allocates memory for the object in Heap.

      title  = null
      author = null
      price  = 0.0

12. Instance variables are initialized with default values.

13. NSB (Instance Initialization Block) executes.

      price = 255.0

14. Constructor executes.

      Library(String)

      this.title = title;

15. Object becomes

      title  = "Coding with me"
      author = null
      price  = 255.0

16. Reference variable 'l' in Stack points to
    the Library object in Heap.

17. Method call

      l.display();

    Compiler had already selected

      display()

    during compilation.

18. JVM creates a new Stack Frame for display(),
    executes it, prints the values,
    then removes the Stack Frame.

19. Method call

      l.display("Available");

    Compiler had already selected

      display(String)

    during compilation.

20. JVM executes display(String),
    prints the values,
    removes the Stack Frame.

21. Next Object

      Library l1 =
      new Library("Java","Arjun",250);

22. Static Block DOES NOT execute again
    because Library.class is already loaded.

23. Heap Memory is allocated.

24. Default values assigned.

25. NSB executes.

      price = 255

26. Constructor Chaining begins.

      Library(String,String,double)

                 ↓ this(title,author)

      Library(String,String)

                 ↓ this(title)

      Library(String)

27. Execution Order

      Library(String)
            ↓
      Library(String,String)
            ↓
      Library(String,String,double)

28. Constructor Execution

      Library(String)
      -----------------
      title initialized

      Library(String,String)
      -----------------------
      author initialized

      Library(String,String,double)
      ------------------------------
      price initialized (250)

29. Constructor execution completes.

30. Reference variable l1 points to the object.

31. Same process repeats for every new object.

===============================================================================
IMPORTANT POINTS

✔ Static Block executes only once during Class Loading.

✔ NSB executes every time an object is created.

✔ Constructor executes after NSB.

✔ Compiler selects the constructor during Compilation.

✔ JVM only executes the constructor selected by the compiler.

✔ Constructor Chaining follows:

      this()
           ↓
      Called Constructor Completes
           ↓
      Returns to Current Constructor
           ↓
      Current Constructor Continues

===============================================================================*/