package Core.Generics;

import Core.Oops.Interface.NoDimondProblem.B;

public class Box<T> {
    T value;
        public void setValue(T value){
            this.value = value;
        }
        public T getValue(){
            return this.value;
        }

    public static void main(String[] args) {

        //String as PlaceHolder
        Box<String> bs = new Box<>();
        bs.setValue("ABC");
        System.out.println(bs.getValue());

        //Integer as PlaceHolder
        Box<Integer> bi = new Box<>();
        bi.setValue(100);
        System.out.println(bi.getValue());
    }
}
