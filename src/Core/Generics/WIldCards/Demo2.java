package Core.Generics.WIldCards;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {
    static class Animal<T>{
        void eat(){
            System.out.println("eating..");
        }
    }
    static class Dog extends Animal{
        void bark(){
            System.out.println("barking..");
        }
    }
    static class Puppy extends Dog{
        void play(){
            System.out.println("playing...");
        }
    }

    static void printAnimal(List<? super Dog>list){
        list.add(new Dog());
        System.out.println("Successfull");
        System.out.println(list.get(0));

    }

    public static void main(String[] args) {
        List<Dog> l = new ArrayList<>();
        l.add(new Dog());
        l.add(new Dog());
        printAnimal(l);

        List<Animal> a = new ArrayList<>();
        a.add(new Dog());
        printAnimal(a);

        List<Puppy> p = new ArrayList<>();
        p.add(new Puppy());
//        printAnimal(p);  error
    }
}
