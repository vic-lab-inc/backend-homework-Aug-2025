1. Difference between ArrayList and LinkedList?
    1. ArrayList is backed by a dynamic array, so it’s faster for random access but slower for inserts/deletes in the middle.
    2. LinkedList is backed by a doubly linked list, so it’s faster for frequent insertions/deletions but slower for random access.
    3.
    - **ArrayList**
        - Uses a **dynamic array** underneath.
        - Provides **O(1)** time for random access (`get(index)` is fast).
        - But inserting or removing elements in the middle requires shifting elements, which is **O(n)**.
        - Better when you need fast reads and don’t modify the list much.
    - **LinkedList**
        - Uses a **doubly linked list** underneath.
        - Insertions and deletions are fast (just update pointers), so adding/removing in the middle is **O(1)** once you have the node.
        - But accessing by index requires traversal from the start or end, which is **O(n)**.
        - Also uses a bit more memory because of the node pointers.

   **In short:**

    - **ArrayList → fast lookup, bad at middle inserts/deletes.**
    - **LinkedList → slow lookup, good at frequent inserts/deletes.**
2. Difference between Vector and ArrayList?
    1. Both `Vector` and `ArrayList` use a dynamic array underneath. The main difference is that **`Vector` is synchronized** (thread-safe but slower), while **`ArrayList` is not synchronized** (faster, but not thread-safe).
    2.
    - **ArrayList**
        - Introduced in Java 1.2 as part of the Collections Framework.
        - Backed by a dynamic array.
        - **Not synchronized** → faster in single-threaded environments.
        - Preferred in modern code unless you specifically need thread safety.
    - **Vector**
        - Older class (Java 1.0), also backed by a dynamic array.
        - **Synchronized** → all methods are thread-safe.
        - But synchronization overhead makes it slower compared to `ArrayList`.
        - Considered a legacy class; usually replaced by `ArrayList` + external synchronization (`Collections.synchronizedList` or `CopyOnWriteArrayList`) if thread safety is needed.

   **In short:**

    - Both store elements in a resizable array.
    - `Vector` = thread-safe but slower (legacy).
    - `ArrayList` = faster, more commonly used in modern applications.
3. Time complexity of HashMap?
    1. For a `HashMap`, the average time complexity of **get()** and **put()** is **O(1)**, but in the worst case (when lots of keys collide) it can degrade to **O(log n)** in Java 8+ because collisions are handled with balanced trees.
    2.
    - **Average case:**
        - `put(key, value)` and `get(key)` are usually **O(1)** because the hash function distributes keys evenly across buckets.
        - Most operations only need one array lookup and maybe a short linked list/tree traversal.
    - **Worst case:**
        - If many keys hash to the same bucket, earlier Java versions used a linked list, so worst-case lookup was **O(n)**.
        - Since Java 8, if a bucket becomes too full, it switches to a **balanced tree (red-black tree)**, which makes the worst-case lookup **O(log n)**.
    - **Other operations:**
        - `remove()` → same complexity as `get()`, so average O(1), worst O(log n).
        - Iterating through a HashMap → **O(n)**.

   **In short:**

    - Average: O(1) for get/put/remove.
    - Worst case: O(log n) since Java 8 (used to be O(n)).
4. Java HashMap implementation?
    1. A `HashMap` in Java is implemented as an **array of buckets**, where each bucket stores entries (`key, value`). The bucket is chosen using the key’s `hashCode()`. If multiple keys land in the same bucket, Java stores them in a **linked list** or, since Java 8, a **red-black tree** when collisions get too large. This makes lookups usually O(1), but worst-case O(log n).
5. What happens if hash collision occurs?
    1. If two keys have the same hash and end up in the same bucket, that’s a collision. Java handles it by putting the entries in a **linked list**, or in Java 8+ it switches to a **red-black tree** if the bucket gets too crowded.
6. What are hashcode() and equals()
    1.
    - **`hashCode()`** returns an integer hash value for an object, used to decide which bucket it goes into in hash-based collections.
    - **`equals()`** checks if two objects are logically equal.

      Together: if two objects are equal (`equals()` is true), they **must** have the same hash code.


    In Java:
    
    - **`hashCode()`**
        - It returns an integer hash that helps quickly locate an object in hash-based collections like `HashMap` and `HashSet`.
        - Example: when you do `map.put(key, value)`, the `hashCode()` decides which bucket the key goes into.
    - **`equals()`**
        - It checks whether two objects are logically the same.
        - Example: two different `String` objects with the same characters (`"abc".equals(new String("abc"))`) return `true`.
    
    **Contract between them (super important in interviews):**
    
    - If two objects are equal (`a.equals(b) == true`), then `a.hashCode()` must equal `b.hashCode()`.
    - If two objects are not equal, their hash codes *can* still collide, but good practice is to minimize collisions.
    
    **Why it matters:**
    
    - Hash-based collections first use `hashCode()` to find the right bucket.
    - Then they use `equals()` to check if the object is actually the same as the key/value you’re looking for.
    
    **Example with `String`:**
    
    ```java
    String a = new String("hello");
    String b = new String("hello");
    
    System.out.println(a.hashCode() == b.hashCode()); // true
    System.out.println(a.equals(b)); // true
    
    ```
    
    ---

7. Why need to implement the hashcode() when implementing equals()?
    1. If you override `equals()` but don’t override `hashCode()`, two objects that are “equal” may end up in different hash buckets. That breaks hash-based collections like `HashMap` and `HashSet`, causing duplicates or lookup failures.
    2.

   In Java, `equals()` and `hashCode()` have a **contract**:

    - If `a.equals(b)` is true, then `a.hashCode()` must equal `b.hashCode()`.
    - If this rule is broken, collections like `HashMap`, `HashSet`, and `Hashtable` won’t work correctly.

   **Why it matters:**

    - Hash-based collections first use `hashCode()` to find the right bucket.
    - Then inside the bucket, they use `equals()` to check equality.
    - If two objects are equal but have different hash codes, they’ll land in different buckets → the collection won’t find them as duplicates.

   **Example:**

    ```java
    class Person {
        String name;
        Person(String name) { this.name = name; }
    
        @Override
        public boolean equals(Object o) {
            return (o instanceof Person) && ((Person) o).name.equals(this.name);
        }
        // hashCode NOT overridden
    }
    
    Person p1 = new Person("Alice");
    Person p2 = new Person("Alice");
    
    HashSet<Person> set = new HashSet<>();
    set.add(p1);
    set.add(p2);
    
    System.out.println(set.size()); // 2 instead of 1 (broken!)
    
    ```

   Here, `equals()` says the two objects are equal, but since `hashCode()` wasn’t overridden, they ended up in different buckets.

   **In short:**

   Always override `hashCode()` whenever you override `equals()`, otherwise hash-based collections behave incorrectly.

8. HashMap vs TreeMap vs HashTable
    1.
    - **HashMap** → unsorted, allows one `null` key and multiple `null` values, not thread-safe, average O(1) operations.
    - **TreeMap** → sorted by key (natural order or comparator), no `null` keys, log(n) operations, not thread-safe.
    - **Hashtable** → legacy class, synchronized (thread-safe but slower), no `null` keys or values.
9. How does ConcurrentHashMap works?
    1. `ConcurrentHashMap` is a thread-safe version of `HashMap`. Instead of locking the whole map like `Hashtable`, it uses finer-grained locking (segments in Java 7, bucket-level locks and CAS in Java 8). This allows multiple threads to read and write concurrently with much less contention.

`ConcurrentHashMap` is designed for high-concurrency environments where multiple threads need to access and modify a map safely.

- **Thread safety model:**
    - Unlike `Hashtable` (which synchronizes every method), `ConcurrentHashMap` uses **lock striping** (Java 7) or **bucket-level synchronization + CAS** (Java 8+).
    - This means only part of the map is locked during updates, so other threads can still operate on different buckets at the same time.
- **Reads:**
    - Most read operations (`get`) are non-blocking and run in **O(1)** using volatile semantics for visibility.
- **Writes:**
    - When inserting/updating, it uses **synchronized blocks on the specific bucket** (not the whole map).
    - In Java 8+, it uses a mix of **synchronized blocks and CAS (Compare-And-Swap)** for better performance.
- **Structure:**
    - Like `HashMap`, it’s an array of buckets.
    - Collisions are handled by linked lists, which are converted to **red-black trees** when too many collisions occur (same as HashMap).
- **Null handling:**
    - Does **not** allow `null` keys or `null` values, to avoid ambiguity in concurrent access.
- **Performance:**
    - Multiple threads can read/write concurrently without blocking each other most of the time.
    - Much faster than `Hashtable` in multi-threaded applications.

---

**In short:**

ConcurrentHashMap works by splitting the map into smaller parts and only locking the piece you’re updating, instead of the whole map. Reads are usually lock-free, and writes use bucket-level locks or CAS, which makes it safe and efficient in multi-threaded environments.