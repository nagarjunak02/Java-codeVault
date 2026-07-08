package Core.Oops.Inheritance.SingleEmployee;

public class MainEmp {
    public static void main(String[] args) {
        Developer d = new Developer("Amazon",2,"java");
        d.work();
        d.code();
        d.displayDeveloper();
        d.normes();

    }
}


/*
====================================================
INHERITANCE EXECUTION FLOW
(Employe -> Developer)
====================================================

Code:

Developer d =
    new Developer("Amazon",2,"Java");

----------------------------------------------------

1. JVM starts execution from main().

----------------------------------------------------

2. JVM sees:

    new Developer(...)

Before creating the object, JVM must load
the required classes.

----------------------------------------------------

3. Since Developer extends Employe,

Parent class (Employe) is loaded first.

----------------------------------------------------

4. Employe Static Block executes.

Static blocks execute during class loading
and execute only once.

----------------------------------------------------

5. Developer class is loaded.

----------------------------------------------------

6. Developer Static Block executes.

Static blocks execute during class loading
and execute only once.

----------------------------------------------------

CLASS LOADING COMPLETED

----------------------------------------------------

7. JVM creates ONE Developer Object.

Important:

A separate Employe object is NOT created.

Memory:

Developer Object
----------------
Employe Part
Developer Part

At this point default values are assigned.

Example:

id = 0
language = null
name = null

----------------------------------------------------

8. Constructor Chaining Begins.

Developer constructor contains:

    super(company,id);

So JVM first initializes the Parent Part.

----------------------------------------------------

PARENT (EMPLOYE) INITIALIZATION

----------------------------------------------------

9. Employe Instance Variables initialize.

Example:

id = 0

(or assigned value if initialized)

----------------------------------------------------

10. Employe NSB executes.

Rule:

Instance Variables
↓
NSB
↓
Constructor

----------------------------------------------------

11. Employe Constructor executes.

Example:

this.id = id;
Employe.company = company;

Parent Part is now fully initialized.

----------------------------------------------------

12. Control returns to Developer.

----------------------------------------------------

CHILD (DEVELOPER) INITIALIZATION

----------------------------------------------------

13. Developer Instance Variables initialize.

Example:

language = null
name = null

(or assigned values if initialized)

Example:

String language = "Java";

This assignment happens here.

----------------------------------------------------

14. Developer NSB executes.

Rule:

Instance Variables
↓
NSB
↓
Constructor

----------------------------------------------------

15. Developer Constructor Body executes.

Example:

this.language = language;

Child Part is now fully initialized.

----------------------------------------------------

16. Reference Assignment happens.

d ------> Developer Object

----------------------------------------------------

17. Method Calls execute.

d.work();

d.code();

d.displayDeveloper();

----------------------------------------------------

IMPORTANT UNDERSTANDING

Developer Constructor does NOT immediately
execute its body.

When JVM sees:

super();

It first completely initializes the
Parent Part.

After Parent Constructor finishes:

Child Instance Variables initialize
↓
Child NSB executes
↓
Child Constructor Body executes

----------------------------------------------------

MEMORY RULE

Only ONE object is created.

Developer Object
----------------

Employe Part
------------
company
id

Developer Part
--------------
language
name

A separate Employe object is NOT created.

----------------------------------------------------

FINAL EXECUTION ORDER

Parent Static Block
↓
Child Static Block
↓
Create Developer Object
↓
Parent Instance Variables
↓
Parent NSB
↓
Parent Constructor
↓
Child Instance Variables
↓
Child NSB
↓
Child Constructor
↓
Reference Assignment
↓
Method Calls

====================================================

GOLDEN RULES

1. Static Blocks execute during Class Loading.

2. NSBs execute during Object Creation.

3. For every class:

   Instance Variables
   ↓
   NSB
   ↓
   Constructor

4. Parent initializes first,
   Child initializes next.

5. Only ONE Child Object is created.
   Parent object is NOT created separately.

6. super() initializes the Parent Part
   completely before the Child Part starts.

====================================================
*/