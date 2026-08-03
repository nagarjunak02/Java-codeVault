package Core.NestesClasses.AnonymousClass;

public class Animal {
    void sound(){
        System.out.println("Animal sound");
    }

    public static void main(String[] args) {
        Animal a = new Animal(){
            @Override
            void sound() {
                System.out.println("Dog barking" );
            }
        };
        a.sound();
    }
}

