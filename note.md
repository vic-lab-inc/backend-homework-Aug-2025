1. What are Primitive data types in Java? 

​	Primitive data types are the most basic data types that store simple values directly in memory.

​	byte, short, int, long, float, double, char, boolean



2. What is the difference between == and equals()? 

- ==compares **object references** (or primitive values).
- **`equals()`** is a method (from `Object` class) that compares **object values/content** (if overridden).
- If equals() not been overridden, It inherits `Object`’s default implementation, which works like `==` 



3. What is String Pool? 

a special area in Heap stores all String literals, it helps save memory



4. What is Final, Finally and Finalize? 

- **`Final`** is a keyword; **`final`** variable… **`final`** method… **`final`** class…
- **`Finally`** is a block used in exception handling
- finalize() is a method called by Garbage Collector (perform cleanup before an object is garbage collected)



5. What is Static? 

a keyword in Java means that the member (variable, method, block, or nested class) belongs to the **class itself** rather than to any specific object. This means it can be accessed without creating an instance of the class.



6. What is OOP (4 principles)? 

programming paradigm centered around objects and classes. It promotes four principles encapsulation, inheritance, polymorphism, and abstraction.



7. What is Polymorphism? 

In programming, *polymorphism* refers to the same object exhibiting different forms and behaviors.

Polymorphism allows one interface or method name to represent multiple implementations—**overloading** at compile time, and **overriding** at runtime.



8. What is method overriding and overloading? 

- Overriding (Runtime Polymorphism): A subclass provides a different implementation of a method of its superclass
- Overloading (Compile-time Polymorphism): Two or more methods in the same class with the same name but different parameter lists



9. What is abstact class and interface? Difference? 

- Common: Interface and Abstract class are used to achieve abstraction
- Abstract class can have constructors, but interface cannot (Why?)
  - Interfaces cannot be instantiated
  - The constructor of the class implements the interface is responsible for initialization
- A class can only extend one abstract class, but can implement multiple interfaces 3. All methods in interface is `public abstract`, but abstract class can have others
- All fields in interface is `static final`, but abstract class can have others



10. What is exception and error?

- **`Error`** and **`Exception`** both are subclasses of **`Throwable`**

- **`Error`** is unrecoverable, severe failure in JVM, like `OutOfMemoryError` , `StackOverflowError`

- `Exception` caused by the application itself, and an application can catch them

  - **`Checked Exception`**: Checked at compile-time, force the programmer to handle them, like `IOException` ,`SQLException`
  - **`Unchecked Exception`**: Not checked at compile-time, do not need programer to handle them, like `NullPointerException` ,`ArrayIndexOutOfBoundsException`

  

11. What is the difference between throw and throws? 

- **`throw`**: explicitly throw an exception from a method
- **`throws`**: The throws keyword is used in the signature of method to indicate that this method might throw one of the listed type exceptions.

- The caller to these methods has to handle the exception using a try-catch block or throws it further

​	

12. What is StringBuilder and StringBuffer? 

`StringBuilder` and `StringBuffer` are **mutable classes** in Java used to create and manipulate strings

- `StringBuffer` synchronized, thread-safe, slower.
- `StringBuilder` non-synchronized, faster, single-threaded.



13. What are different access modifiers

- public **Accessible from anywhere** 
- protected **same package + subclasses**
- default **same package only**
- private **same class only**

