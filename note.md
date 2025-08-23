Write your tech question answers here

1.Difference between ArrayList and LinkedList?
<br>ArrayList is implemented by an array. It gives fast random access (O(1) for get/set) but slow insertion/deletion in the middle (O(n)) since elements must be shifted.
<br>LinkedList uses a doubly linked list. It gives fast insertions and deletions (O(1) if node reference is known), but slow random access (O(n)) because traversal is required.

2.Difference between Vector and ArrayList?
<br>Vector is a legacy class, introduced in Java 1.0. It is synchronized, meaning it is thread-safe but slower in single-threaded use.
<br>ArrayList is part of the Collections Framework, not synchronized, hence faster, but must be wrapped with Collections.synchronizedList() for thread safety.

3.Time complexity of HashMap?
- Average case: O(1) for put, get, and remove operations.
- Worst case: In case of many hash collisions, like containsKey(key), iteration, linked lists could degrade to O(n).
- Java 8+: When collisions exceed a threshold, buckets switch to red-black trees, improving worst-case to O(log n).

4.Java HashMap implementation?
<br>HashMap implementation is a resizable hash table backed by an array of buckets, where each bucket can hold a linked list or a balanced tree of entries. A key’s hashCode() is used to compute the bucket index, and equals() is used to resolve conflicts when multiple keys land in the same bucket.


5.What happens if hash collision occurs?
<br>A hash collision means two keys generate the same bucket index.
<br>HashMap handles this by:
- Storing entries in a linked list initially
- If the list exceeds a threshold, it converts to a Red-Black Tree for faster lookup (O(log n)).

6.What are hashcode() and equals()
<br>hashCode(): Returns an integer hash value, used to determine the bucket index.
<br>equals(): Defines logical equality between two objects.
<br>Contract:
- If two objects are equal (equals() returns true), their hashCode() must be the same.
- If hashCode() differs, objects are definitely not equal.

7.Why need to implement the hashcode() when implementing equals()?
Hashing retrieval is a **two-step process**:
1. Find the right bucket (using `hashCode()`)
2. Search the bucket for the right element (using `equals()` )
3. If `hashCode` is not override, object with same content(equals() == true) will not hash to the same bucket.
4. If `equals` is not override, we cannot find the same object(key) in the bucket.

8.HashMap vs TreeMap vs HashTable
<br>**HashMap**
- Stores data in key-value pairs using array + linked list/tree.
- Unordered, no guarantees on iteration order.
- Not thread-safe.
- Allows 1 null key and multiple null values.
- Fast performance (O(1) average for get/put).

**TreeMap**
- Stores entries in a Red-Black Tree.
- Keys are sorted (natural order or comparator).
- Not thread-safe.
- Does not allow null keys (but allows null values).
- Slower operations (O(log n) for get/put).

**Hashtable**
- Legacy class (pre-Java Collections Framework).
- Similar to HashMap, but synchronized (thread-safe).
- Does not allow null keys or null values.
- Slower than HashMap in single-threaded scenarios due to synchronization overhead.

9.How does ConcurrentHashMap works?
<br>ConcurrentHashMap in Java is a thread-safe hash-based map that enables concurrent access without locking the entire structure. It achieves this by using a bucket-level design with arrays and segmented buckets, combined with fine-grained locking and CAS (Compare-And-Swap) operations for atomic updates. This approach allows multiple threads to read and write simultaneously with minimal contention, making it highly efficient and scalable.Performance is comparable to HashMap in single-threaded use, while still guaranteeing thread safety in concurrent environments.