package Oops.Abstraction.Sample;

public class Demo extends Sample{
    Demo(){
        System.out.println("Demo class construcot");
    }

    @Override
    public void test() {
        System.out.println("Demo test method");
    }

    static {
        System.out.println("Demo static blk..");
    }

    {
        System.out.println("Demo Non static blk");
    }

    public static void main(String[] args) {
        Demo d = new Demo();
    }
}


/*
Step 1
JVM enters the main() method.

↓

The statement

new Demo()

is encountered.

↓

Before creating an object, JVM checks whether
the Demo class is loaded into memory.
Step 2
Demo extends Sample.

↓

JVM first loads the Parent class (Sample).

↓

During class loading,

Parent Static Block executes.

↓

Output

Sample static blk..
Step 3
After loading the Parent class,

JVM loads the Child class (Demo).

↓

Child Static Block executes.

↓

Output

Demo static blk..

Note: Static blocks execute only once when the class is loaded.

Step 4
Now both classes are loaded.

↓

JVM allocates memory for the Demo object.

↓

Object creation starts.

↓

Demo constructor is called.

↓

Compiler has already inserted

super();

as the first statement inside Demo().
Step 5
Control moves to the Parent constructor.

↓

Before executing the Parent constructor,

JVM executes all Parent Non-Static Blocks
(Instance Initializer Blocks).

↓

Output

sample Non static blk
Step 6
Now the Parent constructor executes.

↓

Output

Sample constructor..
Step 7
Parent constructor completes.

↓

Control returns to the Child class.

↓

Before executing the Child constructor,

JVM executes all Child Non-Static Blocks
(Instance Initializer Blocks).

↓

Output

Demo Non static blk
Step 8
Now the Child constructor executes.

↓

Output

Demo class construcot
Step 9
Constructor execution completes.

↓

Object creation is successful.

↓

Reference variable 'd'
now points to the Demo object.

* */