package Core.Oops.Constructor.ConstructorExample.WorkOnthisKeyword;

public class Employee {
    int id = 10;
    public void m1(){
        id = 20;
        m2();
    }

    public void m2() {
        Employee e = new Employee();
        e.id = 50;
        System.out.println("This is objects id: "+this.id);
        System.out.println(e.id);
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.m1();
    }
}
/*
 * Understanding 'this' with this example:
 *
 * Object1 is created in main() and calls m1().
 * Therefore inside m1() and m2():
 *
 *      this ---> Object1
 *
 * In m2(), a new object (Object2) is created:
 *
 *      Employee e = new Employee();
 *
 *      e ---> Object2
 *
 * After:
 *
 *      e.id = 50;
 *
 * Memory:
 *
 *      Object1.id = 10
 *      Object2.id = 50
 *
 * 'this' NEVER refers to the most recently created object.
 *
 * 'this' ALWAYS refers to the object that invoked
 * the current non-static method.
 *
 * Therefore:
 *
 *      this.id  -> Object1.id (10)
 *      e.id     -> Object2.id (50)
 *
 * To access another object, we must use its
 * reference variable (e), not 'this'.
 */

/*
this Keyword:

1. this refers to the current object.
2. Current object = object that invoked the current non-static method or constructor.
3. this does not refer to the latest created object.
4. To access another object, use its reference variable.
5. Creating new objects does not change the value of this.
* */