package Core.ExceptionHandling.ThrowandThrows.BankAcc;

public class Demo10 {
    public static int test() {

        try {

            return 10;

        } finally {

            return 20;

        }
    }

    public static void main(String[] args) {
        System.out.println(test()   );
    }
}

/*test() called
      │
      ▼
Enter try
      │
      ▼
return 10 encountered
      │
      ▼
JVM stores 10 temporarily
      │
      ▼
Before returning...
execute finally
      │
      ▼
return 20 encountered
      │
      ▼
20 replaces the previous return value (10)
      │
      ▼
Method returns 20*/
