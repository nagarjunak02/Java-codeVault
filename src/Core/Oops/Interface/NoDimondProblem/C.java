package Core.Oops.Interface.NoDimondProblem;

public class C implements A,B{

    @Override
    public void test() {
        System.out.println("No implementaion for both mehtods so no dimaond problem..");
    }
}


/*
*
* C implements A, B

↓

A requires test()

↓

B requires test()

↓

Does C implement test()?

↓

YES

↓

A's contract satisfied

↓

B's contract satisfied

↓

Compilation Successful*/

/*

If a class implements multiple interfaces
having the same abstract method,

only one implementation is required.

The single implementation satisfies the
contract of all the interfaces.

Since interfaces contain only method
declarations, there is no ambiguity
or Diamond Problem.*/
