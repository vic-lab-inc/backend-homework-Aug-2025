HW2
1. What are Primitive data types in Java?
   byte, short, int, long, float, double, char, boolean.
   Numbers use the integer or floating types, char holds one character, boolean is only true or false.
2. What is the difference between == and equals()? What is String Pool?
   == compares values for primitives, and compares references for objects.
   equals() compares content, if the class overrides it. String does, so it checks text.
   The String Pool is a JVM area for string literals. The same literal points to the same object. new String("abc") makes a new one unless you call intern(). 
3. What is Final, Finally and Finalize?
   final means no more changes. A final variable is constant, a final method cannot be overridden, a final class cannot be extended.
   finally is the cleanup block in try finally or try catch finally and it almost always runs.
   finalize ran before garbage collection. It is obsolete. Do not use it. 
4. What is Static?
   It belongs to the class, not to any single object. Static fields are shared. Static methods cannot use this and cannot directly use instance fields. There are static blocks for one time init, and static nested classes that do not need an outer instance. 
5. What is OOP (4 principles)?
   Encapsulation: Keep data and methods together and hide internals.
   Inheritance: Reuse code from a parent class.
   Polymorphism: One call, different behavior by actual type at run time.
   Abstraction: Keep only the essential parts and the common idea. 
6. What is Polymorphism?
   You call through a parent type, and at run time the actual object decides which overridden method runs. 
7. What is method overriding and overloading?
   Override: A child class replaces a parent method with the same name and same parameters. Chosen at run time.
   Overload: Same method name in one class but different parameter lists. Chosen at compile time.

8. What is abstact class and interface? Difference?
   Abstract class Can have fields, a constructor, normal methods, and abstract methods. Single inheritance. Good when there is shared state or default behavior.
   Interface Defines capabilities and rules. Can have default and static methods. No instance fields. A class can implement many interfaces.
   Rule of thumb Shared state or base logic use an abstract class. Pure capability use an interface.

9. What is exception and error?
   Exception is a problem you can handle. Checked exceptions must be handled or declared. Runtime exceptions are unchecked.
   Error is a serious problem like out of memory. You usually do not catch it.

10. What is the difference between throw and throws?
    throw actually throws an exception object.
    throws in a method signature declares that this method may throw those exceptions, so the caller must handle them.

11. What is StringBuilder and StringBuffer?
    Both are mutable strings. StringBuffer is thread safe and slower. StringBuilder is not thread safe and faster, so use it in single thread code. 
12. What are different access modifiers
    public visible everywhere.
    protected visible in the same package, and in subclasses from other packages.
    default with no modifier visible only in the same package.
    private visible only inside the class.

HW3
1. Difference between ArrayList and LinkedList?
   ArrayList uses a dynamic array. Fast random access, slow insert or delete in the middle, fast append at the end.
   LinkedList uses a doubly linked list. Slow by index, but once you have a node, insert or delete is quick. Good when you change elements a lot.

2. Difference between Vector and ArrayList?
   Vector is synchronized by default, thread safe but slower and old.
   ArrayList is not synchronized, faster in single thread code.

3. Time complexity of HashMap?
   Average put, get, remove are O(1).
   With many collisions, buckets can become trees, then lookup is about O(log n).

4.  Java HashMap implementation?
   Array of buckets plus linked lists that can turn into red black trees. Key hash is mixed, then mapped to a bucket. In a bucket it checks hash first, then equals. Load factor is 0.75 by default. When size passes the threshold, capacity doubles.

5. What happens if hash collision occurs?
   Keys land in the same bucket.
   If equals says it is the same key, value is replaced.
   Otherwise it is stored in that bucket’s list or tree.
6. what are hashcode() and equals()
   hashCode decides the bucket. equals decides if two keys are the same logical key.  7. Why need to implement the hashcode() when implementing equals()?
   Contract says equal objects must have the same hash code.
   If not, HashMap and HashSet will not find them correctly, which leads to weird bugs.

8. HashMap vs TreeMap vs HashTable
   HashMap is unordered, allows one null key and many null values, not thread safe, fastest in general.
   TreeMap is sorted by key, uses a red black tree, no null key, operations are O(log n).
   Hashtable is the old synchronized map, no null key or value, thread safe but slower. Rarely recommended now.
 9. How does ConcurrentHashMap works?
   First, reads are mostly lock free because the map uses volatile reads and CAS.
   When you write, it uses small locks on the buckets, and each bucket can be a list or a tree.
   As the map grows, resizing happens in steps, and other threads can help move data, which keeps things smooth.
   Also, the iterators are weakly consistent, so they do not throw concurrent modification errors.
   Finally, it does not allow null keys or null values.

