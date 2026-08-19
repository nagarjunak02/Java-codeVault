package Core.CollectionsFramework.Set.HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetMethods {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        // =========================================================
        // 1. METHODS FROM COLLECTION INTERFACE
        // =========================================================

        // add()
        // Adds one element.
        set.add(10);

        // addAll()
        // Adds all elements from another collection.
        HashSet<Integer> another = new HashSet<>();
        another.add(20);
        another.add(30);

        set.addAll(another);


        // remove()
        // Removes the specified element.
        set.remove(10);

        // removeAll()
        // Removes all elements that are also present in another collection.
        set.removeAll(another);

        // retainAll()
        // Keeps only elements that are also present in another collection.
        set.retainAll(another);

        // contains()
        // Checks whether an element exists.
        System.out.println(set.contains(20));

        // containsAll()
        // Checks whether all elements of another collection exist.
        System.out.println(set.containsAll(another));

        // size()
        // Returns number of elements.
        System.out.println(set.size());

        // isEmpty()
        // Checks whether the set contains no elements.
        System.out.println(set.isEmpty());

        // clear()
        // Removes all elements.
        set.clear();


        // =========================================================
        // 2. METHODS FROM ITERABLE INTERFACE
        // =========================================================

        // iterator()
        // Returns an Iterator for traversing the HashSet.
        // Iterator is obtained from Iterable.
        var iterator = set.iterator();


        // =========================================================
        // 3. METHODS FROM OBJECT
        // =========================================================

        // toString()
        // Returns string representation of the HashSet.
        System.out.println(set.toString());

        // equals()
        // Compares this set with another object/set.
        System.out.println(set.equals(another));

        // hashCode()
        // Returns hash code of the HashSet.
        System.out.println(set.hashCode());


        // =========================================================
        // 4. HASHSET'S OWN PUBLIC METHODS
        // =========================================================

        // IMPORTANT:
        // HashSet does NOT introduce a major unique public method
        // of its own.
        //
        // Most useful HashSet operations come from:
        //
        // Iterable
        //      ↓
        // Collection
        //      ↓
        // Set
        //
        // HashSet mainly provides the implementation of those
        // operations using a HashMap internally.
    }
}