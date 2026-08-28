package Core.CollectionsFramework.TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapAllMethods {

    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();


        // =========================================================
        // 1. put()
        // Adds a key-value pair.
        // If key already exists, value is replaced.
        // =========================================================

        map.put(50, "A");
        map.put(10, "B");
        map.put(30, "C");
        map.put(20, "D");
        map.put(40, "E");

        System.out.println(map);

        /*
        OUTPUT:

        {10=B, 20=D, 30=C, 40=E, 50=A}

        TreeMap automatically sorts keys.
        */


        // =========================================================
        // 2. get()
        // Returns value associated with the key.
        // =========================================================

        System.out.println(map.get(30));

        /*
        OUTPUT:

        C
        */


        // =========================================================
        // 3. getOrDefault()
        // Returns value if key exists.
        // Otherwise returns default value.
        // =========================================================

        System.out.println(map.getOrDefault(30, "Unknown"));
        System.out.println(map.getOrDefault(100, "Unknown"));

        /*
        OUTPUT:

        C
        Unknown
        */


        // =========================================================
        // 4. containsKey()
        // Checks whether a key exists.
        // =========================================================

        System.out.println(map.containsKey(30));
        System.out.println(map.containsKey(100));

        /*
        OUTPUT:

        true
        false
        */


        // =========================================================
        // 5. containsValue()
        // Checks whether a value exists.
        // =========================================================

        System.out.println(map.containsValue("C"));
        System.out.println(map.containsValue("X"));

        /*
        OUTPUT:

        true
        false
        */


        // =========================================================
        // 6. size()
        // Returns number of key-value pairs.
        // =========================================================

        System.out.println(map.size());

        /*
        OUTPUT:

        5
        */


        // =========================================================
        // 7. isEmpty()
        // Checks whether TreeMap is empty.
        // =========================================================

        System.out.println(map.isEmpty());

        /*
        OUTPUT:

        false
        */


        // =========================================================
        // 8. firstKey()
        // Returns the smallest key.
        // =========================================================

        System.out.println(map.firstKey());

        /*
        OUTPUT:

        10
        */


        // =========================================================
        // 9. lastKey()
        // Returns the largest key.
        // =========================================================

        System.out.println(map.lastKey());

        /*
        OUTPUT:

        50
        */


        // =========================================================
        // 10. firstEntry()
        // Returns the smallest key-value pair.
        // Does NOT remove it.
        // =========================================================

        System.out.println(map.firstEntry());

        /*
        OUTPUT:

        10=B
        */


        // =========================================================
        // 11. lastEntry()
        // Returns the largest key-value pair.
        // Does NOT remove it.
        // =========================================================

        System.out.println(map.lastEntry());

        /*
        OUTPUT:

        50=A
        */


        // =========================================================
        // 12. lowerKey()
        // Returns greatest key STRICTLY LESS than given key.
        // =========================================================

        System.out.println(map.lowerKey(30));

        /*
        OUTPUT:

        20

        Because:
        20 < 30
        30 itself is NOT accepted.
        */


        // =========================================================
        // 13. floorKey()
        // Returns greatest key LESS THAN OR EQUAL to given key.
        // =========================================================

        System.out.println(map.floorKey(30));
        System.out.println(map.floorKey(35));

        /*
        OUTPUT:

        30
        30
        */


        // =========================================================
        // 14. ceilingKey()
        // Returns smallest key GREATER THAN OR EQUAL to given key.
        // =========================================================

        System.out.println(map.ceilingKey(30));
        System.out.println(map.ceilingKey(35));

        /*
        OUTPUT:

        30
        40
        */


        // =========================================================
        // 15. higherKey()
        // Returns smallest key STRICTLY GREATER than given key.
        // =========================================================

        System.out.println(map.higherKey(30));
        System.out.println(map.higherKey(35));

        /*
        OUTPUT:

        40
        40
        */


        // =========================================================
        // 16. lowerEntry()
        // Returns complete entry whose key is
        // strictly less than the given key.
        // =========================================================

        System.out.println(map.lowerEntry(30));

        /*
        OUTPUT:

        20=D
        */


        // =========================================================
        // 17. floorEntry()
        // Returns complete entry whose key is
        // less than or equal to given key.
        // =========================================================

        System.out.println(map.floorEntry(30));
        System.out.println(map.floorEntry(35));

        /*
        OUTPUT:

        30=C
        30=C
        */


        // =========================================================
        // 18. ceilingEntry()
        // Returns complete entry whose key is
        // greater than or equal to given key.
        // =========================================================

        System.out.println(map.ceilingEntry(30));
        System.out.println(map.ceilingEntry(35));

        /*
        OUTPUT:

        30=C
        40=E
        */


        // =========================================================
        // 19. higherEntry()
        // Returns complete entry whose key is
        // strictly greater than given key.
        // =========================================================

        System.out.println(map.higherEntry(30));
        System.out.println(map.higherEntry(35));

        /*
        OUTPUT:

        40=E
        40=E
        */


        // =========================================================
        // 20. headMap()
        // Returns keys LESS THAN the given key.
        // =========================================================

        System.out.println(map.headMap(30));

        /*
        OUTPUT:

        {10=B, 20=D}
        */


        // =========================================================
        // 21. tailMap()
        // Returns keys GREATER THAN OR EQUAL to given key.
        // =========================================================

        System.out.println(map.tailMap(30));

        /*
        OUTPUT:

        {30=C, 40=E, 50=A}
        */


        // =========================================================
        // 22. subMap()
        // Returns keys from fromKey (inclusive)
        // to toKey (exclusive).
        // =========================================================

        System.out.println(map.subMap(20, 50));

        /*
        OUTPUT:

        {20=D, 30=C, 40=E}

        20 → included
        50 → excluded
        */


        // =========================================================
        // 23. comparator()
        // Returns the Comparator used for ordering.
        //
        // null means natural ordering is being used.
        // =========================================================

        System.out.println(map.comparator());

        /*
        OUTPUT:

        null

        Because Integer's natural ordering is being used.
        */


        // =========================================================
        // 24. keySet()
        // Returns all keys as a Set.
        // TreeMap's keys are sorted.
        // =========================================================

        System.out.println(map.keySet());

        /*
        OUTPUT:

        [10, 20, 30, 40, 50]
        */


        // =========================================================
        // 25. navigableKeySet()
        // Returns a NavigableSet view of the keys.
        // =========================================================

        System.out.println(map.navigableKeySet());

        /*
        OUTPUT:

        [10, 20, 30, 40, 50]
        */


        // =========================================================
        // 26. descendingKeySet()
        // Returns keys in descending order.
        // =========================================================

        System.out.println(map.descendingKeySet());

        /*
        OUTPUT:

        [50, 40, 30, 20, 10]
        */


        // =========================================================
        // 27. descendingMap()
        // Returns the map in descending key order.
        // =========================================================

        System.out.println(map.descendingMap());

        /*
        OUTPUT:

        {50=A, 40=E, 30=C, 20=D, 10=B}
        */


        // =========================================================
        // 28. pollFirstEntry()
        // Returns AND removes the smallest entry.
        // =========================================================

        System.out.println(map.pollFirstEntry());

        /*
        OUTPUT:

        10=B
        */

        System.out.println(map);

        /*
        OUTPUT:

        {20=D, 30=C, 40=E, 50=A}
        */


        // =========================================================
        // 29. pollLastEntry()
        // Returns AND removes the largest entry.
        // =========================================================

        System.out.println(map.pollLastEntry());

        /*
        OUTPUT:

        50=A
        */

        System.out.println(map);

        /*
        OUTPUT:

        {20=D, 30=C, 40=E}
        */


        // =========================================================
        // 30. putIfAbsent()
        // Adds only if key doesn't already exist.
        // =========================================================

        map.putIfAbsent(30, "NEW");
        map.putIfAbsent(60, "F");

        System.out.println(map);

        /*
        OUTPUT:

        {20=D, 30=C, 40=E, 60=F}

        30 already existed → C remains.
        60 didn't exist → F added.
        */


        // =========================================================
        // 31. replace()
        // Replaces value of an existing key.
        // =========================================================

        map.replace(30, "NEW-C");

        System.out.println(map);

        /*
        OUTPUT:

        {20=D, 30=NEW-C, 40=E, 60=F}
        */


        // =========================================================
        // 32. remove()
        // Removes mapping using key.
        // Returns removed value.
        // =========================================================

        System.out.println(map.remove(60));

        /*
        OUTPUT:

        F
        */

        System.out.println(map);

        /*
        OUTPUT:

        {20=D, 30=NEW-C, 40=E}
        */


        // =========================================================
        // 33. entrySet()
        // Returns all key-value entries.
        // =========================================================

        for (Map.Entry<Integer, String> entry
                : map.entrySet()) {

            System.out.println(
                    entry.getKey() + " -> " +
                            entry.getValue()
            );
        }

        /*
        OUTPUT:

        20 -> D
        30 -> NEW-C
        40 -> E
        */


        // =========================================================
        // 34. clear()
        // Removes all mappings.
        // =========================================================

        map.clear();

        System.out.println(map);

        /*
        OUTPUT:

        {}
        */
    }
}