package Core.Oops.Inheritance.MultiPerson;

public class Main {
    public static void main(String[] args) {
        Manger m = new Manger("Arjun",22,1010,7000000,"SDE");
        System.out.println();
        m.displayPerson();
        m.displayEmp();
        m.displayManger();
    }
}



/*
====================================================
MULTILEVEL INHERITANCE EXECUTION FLOW
(Person -> Employee -> Manager)
====================================================

Code:

Manager m =
new Manager(
    "Arjun",
    22,
    1010,
    7000000,
    "SDE"
);

----------------------------------------------------

1. JVM starts execution from main().

----------------------------------------------------

2. JVM sees:

    new Manager(...)

Before creating the object, JVM loads
the required classes.

----------------------------------------------------

CLASS LOADING ORDER

Main
↓
Person
↓
Employee
↓
Manager

----------------------------------------------------

STATIC BLOCK EXECUTION ORDER

Person SB
↓
Employee SB
↓
Manager SB

Static Blocks execute only once during
class loading.

----------------------------------------------------

OBJECT CREATION STARTS

JVM creates ONE Manager Object.

Important:

Separate Person and Employee objects
are NOT created.

Memory:

Manager Object
--------------------------------

Person Part
-----------
name
age

Employee Part
-------------
empId
salary

Manager Part
------------
dept

--------------------------------

----------------------------------------------------

CONSTRUCTOR CHAINING

Manager Constructor
contains super(...)

↓

Move to Employee Constructor

Employee Constructor
contains super(...)

↓

Move to Person Constructor

----------------------------------------------------

JVM MOVES UPWARD USING super()

Manager
↑
Employee
↑
Person

----------------------------------------------------

PERSON INITIALIZATION

Person Instance Variables
↓
Person NSB
↓
Person Constructor

Assignments:

this.name = name;
this.age = age;

Example:

name = "Arjun"
age = 22

----------------------------------------------------

Return to Employee

EMPLOYEE INITIALIZATION

Employee Instance Variables
↓
Employee NSB
↓
Employee Constructor

Assignments:

this.empId = empId;
this.salary = salary;

Example:

empId = 1010
salary = 7000000

----------------------------------------------------

Return to Manager

MANAGER INITIALIZATION

Manager Instance Variables
↓
Manager NSB
↓
Manager Constructor

Assignments:

this.dept = dept;

Example:

dept = "SDE"

----------------------------------------------------

FINAL OBJECT

Manager Object
--------------------------------

Person Part
-----------
name = Arjun
age = 22

Employee Part
-------------
empId = 1010
salary = 7000000

Manager Part
------------
dept = SDE

--------------------------------

----------------------------------------------------

IMPORTANT RULE

JVM first moves UPWARD through the
inheritance chain using super().

Manager
↑
Employee
↑
Person

After reaching the topmost parent,
initialization happens DOWNWARD.

Person
↓
Employee
↓
Manager

----------------------------------------------------

INITIALIZATION RULE FOR EVERY CLASS

Instance Variables
↓
NSB
↓
Constructor

----------------------------------------------------

GOLDEN RULES

1. Static Blocks execute during
   Class Loading.

2. NSBs execute during Object Creation.

3. Parent initializes before Child.

4. Only ONE Manager Object is created.

5. The Manager Object contains:

   Person Part
   +
   Employee Part
   +
   Manager Part

6. JVM moves upward using super()
   and initializes downward.

====================================================
*/