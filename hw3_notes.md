Difference between ArrayList and LinkedList?
array list → dynamic array, access in O(1), slow insert/delete.
linked list → double linkedlist, insert/delete in O(1), slow access.

Difference between Vector and ArrayList?
vector → synchronized, thread-safe, slower.
arraylist → unsynchronized, not thread-safe, faster.

Time complexity of HashMap?
get(key) → Average: O(1), Worst-case: O(n)
put(key, value) → Average: O(1), Worst-case: O(n)
remove(key) → Average: O(1), Worst-case: O(n)
Iteration (over keys/values/entries) → O(n)

Java HashMap implementation?
HashMap uses an array of buckets (linked lists or trees) to store key-value pairs.

What happens if hash collision occurs?
add to the head of the linked list or tree in that bucket.

What are hashcode() and equals()
equals() compare value
hashCode return hash value.

Why need to implement the hashcode() when implementing equals()?
Because if two objects are equal by equals(), they must land in the same hash bucket; 
without overriding hashCode(), equal objects could have different hash codes, breaking HashMap/HashSet behavior.

HashMap vs TreeMap vs HashTable
HashMap → unsorted, allows null keys/values, not thread safe.
TreeMap → sorted by keys, no null keys, not thread safe.
HashTable → synchronized, no null keys/values, thread safe.

How does ConcurrentHashMap works?
thread-safe HashMap with minimal locking.