package Core.CollectionsFramework.Vector;

import java.util.Vector;

public class Demo1 {
        public static void main(String[] args) {

            // =====================================================
            // Constructor
            // =====================================================
            Vector<String> v = new Vector<>();

            // =====================================================
            // -------- Inherited Methods (from List Interface) -----
            // =====================================================

            // add(E) -> Adds an element at the end
            v.add("Java");
            v.add("Python");
            v.add("C++");

            System.out.println("After add() : " + v);

            // add(index, E) -> Inserts an element at a specific index
            v.add(1, "JavaScript");
            System.out.println("After add(index, element) : " + v);

            // get(index) -> Returns the element at the given index
            System.out.println("get(2) : " + v.get(2));

            // set(index, E) -> Replaces the element at the given index
            v.set(2, "Spring");
            System.out.println("After set() : " + v);

            // contains(Object) -> Checks whether an element exists
            System.out.println("Contains Java ? " + v.contains("Java"));

            // indexOf(Object) -> Returns first occurrence index
            System.out.println("Index of Java : " + v.indexOf("Java"));

            // remove(index) -> Removes element at the specified index
            v.remove(1);
            System.out.println("After remove(index) : " + v);

            // size() -> Returns number of elements
            System.out.println("Size : " + v.size());

            System.out.println();

            // =====================================================
            // -------- Vector Specific Methods ---------------------
            // =====================================================

            // capacity() -> Returns current capacity of Vector
            System.out.println("Current Capacity : " + v.capacity());

            // addElement(E) -> Adds element at the end
            v.addElement("MySQL");
            System.out.println("After addElement() : " + v);

            // elementAt(index) -> Returns element at given index
            System.out.println("elementAt(1) : " + v.elementAt(1));

            // firstElement() -> Returns first element
            System.out.println("First Element : " + v.firstElement());

            // lastElement() -> Returns last element
            System.out.println("Last Element : " + v.lastElement());

            // insertElementAt(E,index) -> Inserts element at given index
            v.insertElementAt("HTML", 2);
            System.out.println("After insertElementAt() : " + v);

            // setElementAt(E,index) -> Replaces element at given index
            v.setElementAt("CSS", 2);
            System.out.println("After setElementAt() : " + v);

            // removeElement(Object) -> Removes first matching element
            v.removeElement("MySQL");
            System.out.println("After removeElement() : " + v);

            // removeElementAt(index) -> Removes element at given index
            v.removeElementAt(1);
            System.out.println("After removeElementAt() : " + v);

            // ensureCapacity(n) -> Ensures minimum capacity
            v.ensureCapacity(20);
            System.out.println("Capacity after ensureCapacity(20) : " + v.capacity());

            // trimToSize() -> Reduces capacity equal to current size
            v.trimToSize();
            System.out.println("Capacity after trimToSize() : " + v.capacity());

            // removeAllElements() -> Removes all elements
            v.removeAllElements();
            System.out.println("After removeAllElements() : " + v);

            System.out.println("Size : " + v.size());
        }
    }
