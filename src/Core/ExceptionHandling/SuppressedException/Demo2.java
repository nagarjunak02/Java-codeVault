//Case 2: No Exception in Try + Exception in Close

package Core.ExceptionHandling.SuppressedException;

class MyResourse1 implements AutoCloseable{
    @Override
    public void close()  {
        throw new RuntimeException(" Close falied ");
    }
}

public class Demo2 {
    public static void main(String[] args) {
        try (MyResourse1 r = new MyResourse1()){
            System.out.println("Inside try");
        }

    }
}


/*Create Resource
      │
      ▼
Enter try
      │
      ▼
Try Success
      │
      ▼
Call close()
      │
      ▼
Close Exception
      │
      ▼
No Primary Exception
      │
      ▼
Close Exception becomes Primary*/