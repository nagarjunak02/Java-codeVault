package Core.Oops.Interface.NoDimondProblem;

public class Main {
    public static void main(String[] args) {
        A a = new C();
        a.test();

        System.out.println();
        B b = new C();
        b.test();
    }
}


/*A requires show()

↓

B requires show()

↓

Does class C provide show()?

↓

YES

↓

The implementation in C satisfies
the contract of Interface A.

↓

The same implementation also satisfies
the contract of Interface B.

↓

Compilation Successful.8*/