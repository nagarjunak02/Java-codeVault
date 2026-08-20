package Core.CollectionsFramework.Map.HaspMap;
import java.util.HashMap;
import java.util.Map;

public class HashMapMethods {

    public static void main(String[] args) {

        // =========================================================
        // 1. put()
        // Adds a key-value pair.
        // If the key already exists, its old value is replaced.
        // Returns the previous value associated with the key.
        // =========================================================

        HashMap<Integer, String> map = new HashMap<>();

        System.out.println(map.put(101, "Rahul"));
        System.out.println(map.put(102, "Priya"));

        System.out.println(map);

        /*
        OUTPUT:

        null
        null
        {101=Rahul, 102=Priya}

        Why null?
        → These keys didn't exist before.
        */


        // =========================================================
        // 2. put() with existing key
        // Existing value is replaced.
        // Returns the OLD value.
        // =========================================================

        String oldValue = map.put(101, "Kiran");

        System.out.println(oldValue);
        System.out.println(map);

        /*
        OUTPUT:

        Rahul
        {101=Kiran, 102=Priya}
        */


        // =========================================================
        // 3. get()
        // Returns the value associated with the given key.
        // Returns null if the key doesn't exist.
        // =========================================================

        System.out.println(map.get(101));
        System.out.println(map.get(999));

        /*
        OUTPUT:

        Kiran
        null
        */


        // =========================================================
        // 4. getOrDefault()
        // Returns the value if key exists.
        // Otherwise returns the provided default value.
        // It does NOT add the default value to the map.
        // =========================================================

        System.out.println(
                map.getOrDefault(101, "Unknown")
        );

        System.out.println(
                map.getOrDefault(999, "Unknown")
        );

        /*
        OUTPUT:

        Kiran
        Unknown
        */


        // =========================================================
        // 5. containsKey()
        // Checks whether a key exists.
        // =========================================================

        System.out.println(map.containsKey(101));
        System.out.println(map.containsKey(999));

        /*
        OUTPUT:

        true
        false
        */


        // =========================================================
        // 6. containsValue()
        // Checks whether a value exists.
        // =========================================================

        System.out.println(map.containsValue("Kiran"));
        System.out.println(map.containsValue("Arun"));

        /*
        OUTPUT:

        true
        false
        */


        // =========================================================
        // 7. remove(key)
        // Removes the entry using the key.
        // Returns the value that was removed.
        // =========================================================

        String removed = map.remove(102);

        System.out.println(removed);
        System.out.println(map);

        /*
        OUTPUT:

        Priya
        {101=Kiran}
        */


        // =========================================================
        // 8. remove(key, value)
        // Removes ONLY if both key and value match.
        // Returns true if removed.
        // =========================================================

        boolean result1 =
                map.remove(101, "Kiran");

        System.out.println(result1);
        System.out.println(map);

        /*
        OUTPUT:

        true
        {}
        */


        // =========================================================
        // 9. putIfAbsent()
        // Adds the key-value pair ONLY if the key
        // does not already have a mapping.
        // =========================================================

        map.put(101, "Rahul");

        map.putIfAbsent(101, "Kiran");

        System.out.println(map);

        /*
        OUTPUT:

        {101=Rahul}

        Kiran was NOT inserted because 101 already exists.
        */


        map.putIfAbsent(102, "Priya");

        System.out.println(map);

        /*
        OUTPUT:

        {101=Rahul, 102=Priya}
        */


        // =========================================================
        // 10. replace(key, value)
        // Replaces the value ONLY when the key already exists.
        // =========================================================

        map.replace(101, "Kiran");

        System.out.println(map);

        /*
        OUTPUT:

        {101=Kiran, 102=Priya}
        */


        // =========================================================
        // 11. replace(key, oldValue, newValue)
        // Replaces only if the current value matches oldValue.
        // Returns true if replacement happens.
        // =========================================================

        boolean result2 =
                map.replace(101, "Kiran", "Arun");

        System.out.println(result2);
        System.out.println(map);

        /*
        OUTPUT:

        true
        {101=Arun, 102=Priya}
        */


        // =========================================================
        // 12. putAll()
        // Copies all mappings from another Map.
        // =========================================================

        HashMap<Integer, String> anotherMap =
                new HashMap<>();

        anotherMap.put(103, "Kiran");
        anotherMap.put(104, "Anu");

        map.putAll(anotherMap);

        System.out.println(map);

        /*
        OUTPUT:

        {101=Arun, 102=Priya, 103=Kiran, 104=Anu}
        */


        // =========================================================
        // 13. size()
        // Returns number of key-value pairs.
        // =========================================================

        System.out.println(map.size());

        /*
        OUTPUT:

        4
        */


        // =========================================================
        // 14. isEmpty()
        // Returns true if the map contains no entries.
        // =========================================================

        System.out.println(map.isEmpty());

        /*
        OUTPUT:

        false
        */


        // =========================================================
        // 15. keySet()
        // Returns a Set containing all keys.
        // =========================================================

        System.out.println(map.keySet());

        /*
        OUTPUT:

        [101, 102, 103, 104]

        Order may vary with HashMap.
        */


        // =========================================================
        // 16. values()
        // Returns a Collection containing all values.
        // =========================================================

        System.out.println(map.values());

        /*
        OUTPUT:

        [Arun, Priya, Kiran, Anu]

        Order may vary.
        */


        // =========================================================
        // 17. entrySet()
        // Returns a Set containing all key-value pairs.
        // =========================================================

        System.out.println(map.entrySet());

        /*
        OUTPUT:

        [101=Arun, 102=Priya, 103=Kiran, 104=Anu]

        Order may vary.
        */


        // =========================================================
        // 18. Map.Entry
        // Represents ONE key-value pair.
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

        101 -> Arun
        102 -> Priya
        103 -> Kiran
        104 -> Anu

        Order may vary.
        */


        // =========================================================
        // 19. entry.getKey()
        // Returns the key of one entry.
        // =========================================================

        for (Map.Entry<Integer, String> entry
                : map.entrySet()) {

            if (entry.getKey() == 101) {
                System.out.println(entry.getKey());
            }
        }

        /*
        OUTPUT:

        101
        */


        // =========================================================
        // 20. entry.getValue()
        // Returns the value of one entry.
        // =========================================================

        for (Map.Entry<Integer, String> entry
                : map.entrySet()) {

            if (entry.getKey() == 101) {
                System.out.println(entry.getValue());
            }
        }

        /*
        OUTPUT:

        Arun
        */


        // =========================================================
        // 21. entry.setValue()
        // Changes the value of an existing entry.
        // =========================================================

        for (Map.Entry<Integer, String> entry
                : map.entrySet()) {

            if (entry.getKey() == 101) {
                entry.setValue("Rahul");
            }
        }

        System.out.println(map);

        /*
        OUTPUT:

        {101=Rahul, 102=Priya, 103=Kiran, 104=Anu}
        */


        // =========================================================
        // 22. replaceAll()
        // Replaces the value of EVERY entry.
        // =========================================================

        map.replaceAll(
                (key, value) -> value.toUpperCase()
        );

        System.out.println(map);

        /*
        OUTPUT:

        {101=RAHUL, 102=PRIYA, 103=KIRAN, 104=ANU}
        */


        // =========================================================
        // 23. compute()
        // Calculates a new value using key + current value.
        // =========================================================

        map.compute(
                101,
                (key, value) -> value + "!"
        );

        System.out.println(map.get(101));

        /*
        OUTPUT:

        RAHUL!
        */


        // =========================================================
        // 24. computeIfAbsent()
        // Calculates a value ONLY if the key doesn't exist
        // (or doesn't currently map to a value).
        // =========================================================

        map.computeIfAbsent(
                105,
                key -> "STUDENT-" + key
        );

        System.out.println(map.get(105));

        /*
        OUTPUT:

        STUDENT-105
        */


        // =========================================================
        // 25. computeIfPresent()
        // Calculates a new value ONLY if the key exists
        // and currently has a value.
        // =========================================================

        map.computeIfPresent(
                102,
                (key, value) -> value + "-UPDATED"
        );

        System.out.println(map.get(102));

        /*
        OUTPUT:

        PRIYA-UPDATED
        */


        // =========================================================
        // 26. merge()
        //
        // If key doesn't exist:
        // → adds the given value.
        //
        // If key exists:
        // → combines old value + given value.
        // =========================================================

        map.merge(
                106,
                "NEW",
                (oldValue2, newValue) ->
                        oldValue2 + "-" + newValue
        );

        System.out.println(map.get(106));

        /*
        OUTPUT:

        NEW
        */


        map.merge(
                106,
                "STUDENT",
                (oldValue2, newValue) ->
                        oldValue2 + "-" + newValue
        );

        System.out.println(map.get(106));

        /*
        OUTPUT:

        NEW-STUDENT
        */


        // =========================================================
        // 27. forEach()
        // Performs an action for every key-value pair.
        // =========================================================

        map.forEach(
                (key, value) ->
                        System.out.println(
                                key + " -> " + value
                        )
        );

        /*
        OUTPUT will contain all entries.

        Example:

        101 -> RAHUL!
        102 -> PRIYA-UPDATED
        103 -> KIRAN
        104 -> ANU
        105 -> STUDENT-105
        106 -> NEW-STUDENT

        Order may vary.
        */


        // =========================================================
        // 28. clear()
        // Removes ALL entries.
        // =========================================================

        map.clear();

        System.out.println(map);

        /*
        OUTPUT:

        {}
        */


        // =========================================================
        // 29. equals()
        // Checks whether two Maps contain the same mappings.
        // =========================================================

        HashMap<Integer, String> map1 =
                new HashMap<>();

        map1.put(101, "Rahul");

        HashMap<Integer, String> map2 =
                new HashMap<>();

        map2.put(101, "Rahul");

        System.out.println(map1.equals(map2));

        /*
        OUTPUT:

        true
        */


        // =========================================================
        // 30. hashCode()
        // Returns the hash code of the Map.
        // Exact numeric output depends on the mappings.
        // =========================================================

        System.out.println(map1.hashCode());

        /*
        OUTPUT:

        78890814

        The exact number depends on the key/value mappings.
        */


        // =========================================================
        // 31. toString()
        // Returns String representation of the Map.
        // =========================================================

        System.out.println(map1.toString());

        /*
        OUTPUT:

        {101=Rahul}
        */
    }
}