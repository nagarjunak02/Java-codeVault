//Case 1: Exception in Try + Exception in Close


package Core.ExceptionHandling.SuppressedException;


class MyResourse implements AutoCloseable{
    @Override
    public void close() throws Exception {
        throw new RuntimeException(" Close Exception ");
    }
}
public class Demo1 {

    public static void main(String[] args) {

        try(MyResourse r = new MyResourse()){
            throw new RuntimeException("Main Exception");
        }catch (Exception e){
            System.out.println("Primary: "+e.getMessage());

            for( Throwable t : e.getSuppressed()){
                System.out.println("Suppressed: "+t.getMessage());
            }

//            e.printStackTrace(); //it will give both main and suppressed excetion
        }
    }
}


//*
// Create Resource
//      │
//      ▼
//Enter try
//      │
//      ▼
//Main Exception
//      │
//      ▼
//Remember Main Exception
//      │
//      ▼
//Call close()
//      │
//      ▼
//Close Exception
//      │
//      ▼
//Attach Close Exception
//as Suppressed
//      │
//      ▼
//Throw Main Exception*/