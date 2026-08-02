package Core.Generics;
//Generic Interface
public interface Demo2<T> {
    public void print(T value);


    public  class StringPrinter implements Demo2<String>{

        @Override
        public  void print(String value) {
            System.out.println(value);
        }
    }

    public  class IntPrinter implements Demo2<Integer>{

        @Override
        public void print(Integer value) {
            System.out.println(value);
        }
    }

    public static void main(String[] args) {
        StringPrinter sp = new StringPrinter();
        sp.print("AVD");
        System.out.println();
        IntPrinter ip = new IntPrinter();
        ip.print(12);
    }
}
