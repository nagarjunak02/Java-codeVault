package Core.ExceptionHandling;

public class Demo9 {
    public static int test() {

        try {

            System.out.println("Try");

            return 10;

        } finally {

            System.out.println("Finally");

        }
    }

    public static void main(String[] args) {
        System.out.println(test());
    }
}
/*   test() called
      │
      ▼
Enter try
      │
      ▼
Print "Try"
      │
      ▼
return 10 encountered
      │
      ▼
JVM DOES NOT return immediately ❌
      │
      ▼
It remembers the return value (10)
      │
      ▼
Execute finally block
      │
      ▼
Print "Finally"
      │
      ▼
Now return 10 to the caller ✅*/