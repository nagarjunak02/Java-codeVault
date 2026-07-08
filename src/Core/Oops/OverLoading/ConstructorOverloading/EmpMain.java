package Core.Oops.OverLoading.ConstructorOverloading;

public class EmpMain {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.display();
        System.out.println();
        Employee e1 = new Employee(1);
        e1.display();
    }
}





/*
==================== CONSTRUCTOR OVERLOADING - JVM EXECUTION FLOW ====================

Example:
Employee e = new Employee(101, "Arjun", 70000);

1. javac compiles the program.

2. During compilation, the compiler checks all constructor signatures.

   Employee()
   Employee(int)
   Employee(int, String)
   Employee(int, String, double)

3. The compiler sees:

      new Employee(101, "Arjun", 70000);

   It matches the constructor signature:

      Employee(int, String, double)

   This decision is made during COMPILE TIME.

4. JVM starts execution.

5. JVM loads Employee.class and Main.class into the Method Area.

   Method Area contains:
   - Class Metadata
   - Constructors
   - Methods
   - Static Variables (if any)
   - Static Blocks (if any)

6. JVM starts execution from main().

7. Stack Frame for main() is created.

8. JVM encounters:

      Employee e = new Employee(101, "Arjun", 70000);

9. JVM allocates memory for Employee object in the Heap.

10. Before constructor body executes,
    JVM initializes instance variables with default values.

      id = 0
      name = null
      salary = 0.0

11. If an Instance Initialization Block (NSB) is present,
    it executes before the constructor.

12. JVM executes the constructor already selected by the compiler.

      Employee(int, String, double)

13. Constructor initializes the object.

      this.id = 101;
      this.name = "Arjun";
      this.salary = 70000;

14. Constructor execution completes.

15. Reference variable 'e' in the Stack now points to the Employee object in the Heap.

                    STACK

                main()

      e -----------------------> Employee Object


                     HEAP

      -------------------------------
      id      = 101
      name    = "Arjun"
      salary  = 70000
      -------------------------------

16. When display() is called,

      e.display();

    A new stack frame is created for display().

17. display() accesses the object's instance variables
    using 'this' reference and prints them.

18. After display() finishes,
    its stack frame is removed.

19. After main() completes,
    the main stack frame is removed.

20. The Employee object becomes eligible for Garbage Collection
    when no reference points to it.

======================================================================================
*/