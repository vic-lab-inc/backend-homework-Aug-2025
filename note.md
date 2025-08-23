Write your tech question answers here
Write your tech question answers here

1.What are Primitive data types in Java?
<br>byte, short, int, long, float, double, char, boolean

2.What is the difference between == and equals()?
<br>== is used to compare primitive data types and check reference equality for objects.
<br>equals() is used to compare the content of objects and can be overridden by classes like String

3.What is String Pool?
<br>A special memory area in Java where String literals are stored. If a string literal already exists in the pool, Java reuses it instead of creating a new object.
Helps save memory and improves performance.

4.What is Final, Finally and Finalize?
<br>final: Keyword to declare constants, prevent inheritance, or prevent method overriding.
<br>finally: Block in try-catch used to execute code regardless of exception, often for cleanup.
<br>finalize(): Method called by garbage collector before an object is removed from memory.

5.What is Static?
<br>Belongs to the class rather than an instance.  
<br>Can be applied to variables, methods, blocks, nested classes.
<br>Accessed using ClassName.member.

6.What is OOP (4 principles)?
<br>Encapsulation – Hiding data using private fields and providing getters/setters.
<br>Abstraction – Interface and Abstract class, hide complexity and only expose essential features.
<br>Inheritance – subclass can extend superclass to acquire methods/fields, good for code reuse
<br>Polymorphism – Overloading and Overriding, write loose coupling code

7.What is Polymorphism?
<br>Polymorphism allows methods to do different things based on the object that it is acting upon, even if they share the same name.
<br>Two types:
<br>Compile-time (method overloading)
<br>Runtime (method overriding)


8.What is method overriding and overloading?
<br>Overloading: Overloading occurs when two or more methods in the same class have the same name but different parameters (Return type can be different).
<br>Overriding: A subclass provides a different implementation of a method of its superclass, they must have the same name, return type, and parameters

9.What is abstact class and interface? Difference?
<br>Abstract class: A class that cannot be instantiated and is intended to be extended. It may contain abstract methods (without body) and concrete methods (with body).
<br>An **abstract class** can have everything else as same as a normal Java class has i.e. constructor, `static`variables and methods.
1. Non-abstract/Normal methods can be implemented in an abstract class
2. An abstract class cannot be instantiated
3. Child classes must implement all the abstract methods declared in the parent abstract class.

<br>Interface: An interface in Java is a contract that defines a set of abstract behaviors (methods) that a class must implement.
1. An **interface** can have:
    1. methods -> by **default** **`public abstract`**
    2. variables -> by **default `public static final`**
2. Cannot be instantiated, No constructors
3. An interface **cannot** be declared **`private`** or **`protected`**
4. To use an interface, a class **must** **`implement`** all of the **`abstract`** method(s) declared in it.
5. An interface **can** **`extend`** from another interface


<br>Difference:
1. Abstract class can have constructors, but interface cannot (Why?)
2. A class can only extend one abstract class, but can implement multiple interfaces
3. All methods in interface is `public abstract`, but abstract class can have others
4. All fields in interface is `static final`, but abstract class can have others

10.What is exception and error?
**`Error`** and **`Exception`** both are subclasses of **`Throwable`**
- **`Error`** is unrecoverable, severe failure in JVM, like `OutOfMemoryError` , `StackOverflowError`
- **`Exception`** caused by the application itself, and an application can catch them
    - **`Checked Exception`**: Checked at compile-time, force the programmer to handle them, like `IOException` ,`SQLException`
    - **`Unchecked Exception`**: Not checked at compile-time, do not need programer to handle them, like `NullPointerException` ,`ArrayIndexOutOfBoundsException`

11.What is the difference between throw and throws?
<br>throw: Used within a method to actually throw a single exception object.
<br>throws: The throws keyword is used in the signature of method to indicate that this method might throw one of the listed type exceptions.
The caller to these methods has to handle the exception using a try-catch block or throws it further

12.What is StringBuilder and StringBuffer?
<br>Both are mutable sequences of characters, unlike String which is immutable.
<br>StringBuilder: Not synchronized (not thread-safe), faster, recommended for single-threaded use.
<br>StringBuffer: Synchronized (thread-safe), slightly slower, recommended when multiple threads may access it.

13.What are different access modifiers
<br>private – accessible only within the class.
<br>default (no modifier) – accessible within the same package.
<br>protected – accessible within the same package and subclasses.
<br>public – accessible from anywhere.