package Core.CollectionsFramework.Map.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapOrderMethods {

    public static void main(String[] args) {

        LinkedHashMap<Integer, String> map =
                new LinkedHashMap<>();

        // =====================================================
        // 1. put()
        // Adds entries normally at the end.
        // =====================================================

        map.put(101, "Rahul");
        map.put(102, "Priya");
        map.put(103, "Arun");

        System.out.println(map);

        // OUTPUT:
        // {101=Rahul, 102=Priya, 103=Arun}


        // =====================================================
        // 2. putFirst()
        // Adds/repositions an entry at the FRONT.
        // =====================================================

        map.putFirst(104, "Kiran");

        System.out.println(map);

        // OUTPUT:
        // {104=Kiran, 101=Rahul, 102=Priya, 103=Arun}


        // =====================================================
        // 3. putLast()
        // Adds/repositions an entry at the BACK.
        // =====================================================

        map.putLast(105, "Anu");

        System.out.println(map);

        // OUTPUT:
        // {104=Kiran, 101=Rahul, 102=Priya, 103=Arun, 105=Anu}


        // =====================================================
        // 4. firstEntry()
        // Returns the FIRST entry.
        // Does NOT remove it.
        // =====================================================

        Map.Entry<Integer, String> first =
                map.firstEntry();

        System.out.println(first);

        // OUTPUT:
        // 104=Kiran

        System.out.println(map);

        // OUTPUT:
        // {104=Kiran, 101=Rahul, 102=Priya, 103=Arun, 105=Anu}


        // =====================================================
        // 5. lastEntry()
        // Returns the LAST entry.
        // Does NOT remove it.
        // =====================================================

        Map.Entry<Integer, String> last =
                map.lastEntry();

        System.out.println(last);

        // OUTPUT:
        // 105=Anu

        System.out.println(map);

        // OUTPUT:
        // {104=Kiran, 101=Rahul, 102=Priya, 103=Arun, 105=Anu}


        // =====================================================
        // 6. pollFirstEntry()
        // Returns AND removes the FIRST entry.
        // =====================================================

        Map.Entry<Integer, String> firstRemoved =
                map.pollFirstEntry();

        System.out.println(firstRemoved);

        // OUTPUT:
        // 104=Kiran

        System.out.println(map);

        // OUTPUT:
        // {101=Rahul, 102=Priya, 103=Arun, 105=Anu}


        // =====================================================
        // 7. pollLastEntry()
        // Returns AND removes the LAST entry.
        // =====================================================

        Map.Entry<Integer, String> lastRemoved =
                map.pollLastEntry();

        System.out.println(lastRemoved);

        // OUTPUT:
        // 105=Anu

        System.out.println(map);

        // OUTPUT:
        // {101=Rahul, 102=Priya, 103=Arun}


        // =====================================================
        // 8. reversed()
        // Returns a REVERSE-ORDERED VIEW of the map.
        // =====================================================

        Map<Integer, String> reversedMap =
                map.reversed();

        System.out.println(reversedMap);

        // OUTPUT:
        // {103=Arun, 102=Priya, 101=Rahul}


        // =====================================================
        // 9. putFirst() with an EXISTING key
        //
        // The existing entry is moved to the FRONT.
        // =====================================================

        map.putFirst(103, "Arun");

        System.out.println(map);

        // OUTPUT:
        // {103=Arun, 101=Rahul, 102=Priya}


        // =====================================================
        // 10. putLast() with an EXISTING key
        //
        // The existing entry is moved to the BACK.
        // =====================================================

        map.putLast(101, "Rahul");

        System.out.println(map);

        // OUTPUT:
        // {103=Arun, 102=Priya, 101=Rahul}


        // =====================================================
        // 11. No putMiddle()
        //
        // LinkedHashMap does NOT provide:
        //
        // map.putMiddle(...)
        //
        // If you need arbitrary middle insertion,
        // use an appropriate data structure such as
        // LinkedList, depending on the requirement.
        // =====================================================
    }
}