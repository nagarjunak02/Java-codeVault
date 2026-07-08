package Core.Oops.Constructor.ConstructorExample.WorkOnthisKeyword;

public class Employee2 {
    int id = 10;
    public void m1(){
        int id = 20;  //Local variable to method m1
        Employee2 e = new Employee2();;  //Object 2 is created and has id = 10

        e.id = 40; //here object2's value id is been set to 40
        id = 30; //Local variable updatation
        e.m2(); //object2 calling the m2 method

        //Before chaning the object1 id value
        System.out.println("Before chaning the object1 e id: "+this.id);

        this.id = 100; //changin the object1 id(this is refering to the calling object that is object1)
        System.out.println("After chaning the object1 e id: "+this.id);

    }

    public void m2(){
        int id = 40; //local variable to m2
        id= 50; //updating local variable
        System.out.println("M2 "+this.id);   //m2 is called by the object2 so this is currently pointing to 2nd object so it will print 40
    }

    public static void main(String[] args) {
        Employee2 e = new Employee2();   // 1. Creating the object1 e and has the id = 10
        e.m1(); //2. object1 is calling m1 method
    }
}


