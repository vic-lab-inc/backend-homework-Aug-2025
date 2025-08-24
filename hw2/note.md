1. What are Primitive data types in Java?
    1. Primitive data types in Java are basic, built-in data types that directly store values in memory. And Java has 8 primitive data types: **byte, short, int, long, float, double, char, and boolean**.
    2. In Java, primitive types are the simplest kinds of data. There are **eight of them**:
        - **byte, short, int, long** → for integer numbers of different sizes.
        - **float, double** → for decimal numbers (floating point).
        - **char** → for a single character, like `'a'`.
        - **boolean** → for `true` or `false`.

       They’re called “primitive” because they’re not objects—they hold values directly in memory. For example, `int x = 5;` stores the number directly, while something like `Integer x = 5;` is an object wrapper. Primitives are faster and more lightweight compared to objects.

2. What is the difference between == and equals()?
    1. == compares references (memory addresses) of objects. equals() compares the actual contents (characters) of objects.
    2. `==` checks if two string references point to the **same object** in memory, while `equals()` checks if the **actual string values** are the same.
    3. In Java, `==` compares object references. So if you do:

    ```java
    String a = "hello";
    String b = "hello";
    System.out.println(a == b); // true, because both point to the same string in the pool
    
    ```

   But if you use `new`:

    ```java
    String a = new String("hello");
    String b = new String("hello");
    System.out.println(a == b); // false, different objects
    System.out.println(a.equals(b)); // true, same value
    
    ```

   So the key difference is:

    - **`==`** → compares memory addresses (reference equality).
    - **`equals()`** → compares the content (value equality).

   That’s why for strings, we almost always use `.equals()` instead of `==`.

3. What is String Pool?
    1.  The string constant pool in Java is a memory area where String literals are stored.
        1. When you use a String literal, Java checks the pool:
           If the string is already there, Java returns its reference.
           If not, Java creates a new String object in the pool and returns its reference.
           This helps conserve memory by reusing existing strings.
    2. The String Pool is a special area in the Java heap where string literals are stored. If two strings have the same literal value, they point to the same object in the pool instead of creating duplicates.
    3. The **String Pool** (also called the intern pool) is a part of the heap memory in Java where all string literals are stored. The idea is to save memory by reusing the same string object instead of creating new ones.

   For example:

    ```java
    String a = "hello";
    String b = "hello";
    System.out.println(a == b); // true, both point to the same pool object
    
    ```

   But if you explicitly create a new object:

    ```java
    String a = new String("hello");
    String b = "hello";
    System.out.println(a == b); // false, different objects
    
    ```

   You can also use `intern()` to force a string into the pool:

    ```java
    String a = new String("world");
    String b = a.intern();
    
    ```

   Here `b` will point to the pooled `"world"`.

   So in short: **the String Pool helps Java save memory and speed up comparisons by reusing string literals.**

4. What is Final, Finally and Finalize?
    1. **final** → a keyword; it makes variables constant, methods non-overridable, and classes non-inheritable.
        - **finally** → a block in a try–catch that always runs (for cleanup).
        - **finalize()** → a method called by the Garbage Collector before an object is destroyed (rarely used now).

       These three sound similar but mean different things:

        - **`final` (keyword):** Used to add restrictions. If a variable is `final`, its value can’t change. If a method is `final`, it can’t be overridden. If a class is `final`, it can’t be extended. For example:

            ```java
            final int x = 10; // can’t reassign
            
            ```

        - **`finally` (block):** Part of exception handling. It comes after `try` or `catch` and always executes, no matter what happens (exception or not). Typically used for cleanup like closing files or releasing resources.

            ```java
            try {
                // code
            } catch (Exception e) {
                // handle
            } finally {
                // always runs
            }
            
            ```

        - **`finalize()` (method):** A method that the Garbage Collector calls before destroying an object, giving it a chance to clean up resources. But in modern Java, it’s rarely used and is actually deprecated, because it’s unpredictable and not reliable.

       **In short:**

        - `final` → keyword for restrictions,
        - `finally` → cleanup block,
        - `finalize()` → GC callback (legacy, not recommended).
5. What is Static?
    1. In Java, `static` means the member belongs to the class rather than an instance. For example, a `static` variable is shared by all objects, and a `static` method can be called without creating an object.
    2. The `static` keyword in Java is used to define members that belong to the class itself, not to individual objects.
    - **Static variables** → There’s only one copy shared across all instances. For example, a `static int counter` is the same for every object.
    - **Static methods** → Can be called without creating an object. For example, `Math.max(5, 10)` works because `max` is static. But static methods can’t access instance variables directly.
    - **Static blocks** → Run once when the class is loaded, often used for initialization.
    - **Static classes (nested)** → An inner class can be marked static, meaning it doesn’t depend on an instance of the outer class.

   So basically, `static` is about class-level members. It’s great for utility methods or constants, but overusing it can reduce flexibility.

6. What is OOP (4 principles)?
    1. OOP stands for Object-Oriented Programming, which means OOPS is a way to create software around objects.
    2. OOPs provide a clear structure for the software's and web applications.
    3. OOP stands for Object-Oriented Programming. Its four main principles are:
        1. **Encapsulation** → hiding data and exposing only what’s needed.
        2. **Abstraction** → focusing on what an object does, not how it does it.
        3. **Inheritance** → reusing code by creating subclasses from a parent class.
        4. **Polymorphism** → the ability of methods or objects to take many forms.

   OOP, or Object-Oriented Programming, is about organizing software around objects rather than just functions. The four key principles are:

    1. **Encapsulation** → This means bundling data and methods together, and hiding the internal details. For example, using private fields and exposing getters/setters so the object controls how its data is accessed.
    2. **Abstraction** → This is about exposing only the essential features and hiding the implementation details. For instance, when you use a `List` interface, you don’t care if it’s backed by an `ArrayList` or a `LinkedList`.
    3. **Inheritance** → This allows one class to inherit fields and methods from another. It helps with code reuse. For example, a `Dog` class can extend an `Animal` class and get common behavior.
    4. **Polymorphism** → This means “many forms.” In practice, it usually shows up as method overriding or interface implementation. For example, calling `animal.makeSound()` will run differently if `animal` is a `Dog` vs a `Cat`.

   Together, these principles make code more modular, reusable, and easier to maintain.

7. What is Polymorphism?
    1. Polymorphism is the ability of a function to take on multiple forms.
    2. Polymorphism means “many forms.” In Java, it lets one method or object behave differently depending on the context—for example, the same method name can have different implementations in subclasses.
    3. Polymorphism is one of the key principles of OOP. The idea is that the same operation can behave differently depending on the object.
    - **Compile-time polymorphism (method overloading):** Same method name with different parameter lists. For example:

        ```java
        void print(int x);
        void print(String s);
        
        ```

      Both are `print`, but the compiler picks the right one based on the arguments.

    - **Runtime polymorphism (method overriding):** A subclass provides its own version of a method from the parent class. For example:

        ```java
        Animal a = new Dog();
        a.makeSound(); // runs Dog’s version
        
        ```


    This is powerful because you can write flexible code. For example, you can have a method that takes an `Animal`, and it will work for `Dog`, `Cat`, or any other subclass without changing the code.

8. What is method overriding and overloading?
    1. Overloading Overriding
        1. Multiple methods with same name are in
           the same class.
           Multiple methods with same name are in the
           different classes.
        2. Methods have the same name but
           different parameter lists.
           Method name and signature (parameter list)
           must be same.
        3. Compile-time polymorphism. Runtime polymorphism.
        4. No annotation or special keyword is
           required.
           @Override annotation is used over method
           of child class to specify that it's overriding a
           superclass method.
        5. Constructors can also be overloaded. Constructors cannot be overridden.
    2. **Overloading** → Same method name, but different parameter lists (happens at compile time).
        1. **Overriding** → A subclass provides its own implementation of a parent class method (happens at runtime).

   **Method Overloading** is when you have multiple methods with the same name but different parameter lists (different number or types of parameters). This is decided at **compile time**. For example:

    ```java
    void print(int x) { ... }
    void print(String s) { ... }
    
    ```

   Both are `print`, but the compiler decides which one to call based on the argument type.

   **Method Overriding** is when a subclass redefines a method that already exists in the parent class, using the exact same name and parameters. This is resolved at **runtime**. For example:

    ```java
    class Animal {
        void makeSound() { System.out.println("Animal sound"); }
    }
    class Dog extends Animal {
        @Override
        void makeSound() { System.out.println("Bark"); }
    }
    
    ```

   If you run:

    ```java
    Animal a = new Dog();
    a.makeSound(); // "Bark" (Dog’s version at runtime)
    
    ```

   So in short:

    - **Overloading = same name, different parameters, compile-time.**
    - **Overriding = same name + parameters, different class (inheritance), runtime.**
9. What is abstact class and interface? Difference?

   1. An **abstract class** is a class you can’t instantiate, but it can have both abstract methods (no body) and regular methods.

       An **interface** is like a contract: it only declares methods (and since Java 8, it can also have default and static methods).

       **Key difference:** A class can extend only one abstract class, but it can implement multiple interfaces.


    **Abstract Class:**
    
    - It’s a class that can’t be instantiated directly.
    - It can have abstract methods (no implementation) as well as concrete methods (with implementation).
    - Good when you want to provide a base class with some shared code plus some methods that subclasses must implement.
    
    ```java
    abstract class Animal {
        abstract void makeSound();
        void eat() { System.out.println("Eating..."); }
    }
    
    ```
    
    **Interface:**
    
    - It’s a pure contract that defines *what* a class should do, not *how*.
    - By default (before Java 8), all methods are abstract; since Java 8, it can also have `default` and `static` methods.
    - A class can implement multiple interfaces, which helps with multiple inheritance.
    
    ```java
    interface Flyable {
        void fly();
    }
    
    ```
    
    **Differences (口语总结):**
    
    - Abstract class → “is-a” relationship with partial implementation.
    - Interface → “can-do” capability, no state (usually).
    - One class can only extend **one** abstract class but can implement **many** interfaces.
    - Abstract class can have constructors and member variables; interface can only have constants (`public static final`).
10. What is exception and error?
    1. In Java, an **exception** is something that happens during program execution that you can catch and handle, like `NullPointerException` or `IOException`.

       An **error** is a serious problem that usually comes from the JVM or system, like `OutOfMemoryError`, and you normally can’t recover from it.


    In Java, both **exceptions** and **errors** are subclasses of `Throwable`, but they represent different things:
    
    - **Exception:**
        - Represents conditions your program might reasonably handle.
        - For example, trying to open a missing file throws `FileNotFoundException`, and you can catch it with `try-catch`.
        - Exceptions are usually problems caused by your code or environment, but you’re expected to recover or handle them gracefully.
        - They’re divided into **checked exceptions** (must be declared or caught, like `IOException`) and **unchecked exceptions** (runtime exceptions like `NullPointerException`).
    - **Error:**
        - Represents serious issues that happen inside the JVM or system, not your code logic.
        - Examples include `OutOfMemoryError`, `StackOverflowError`, or `VirtualMachineError`.
        - These usually mean the program is in a bad state, and you’re not expected to catch or fix them in normal code.
    
    **In short:**
    
    - **Exception → recoverable, can be caught.**
    - **Error → not recoverable, usually not handled.**
11. What is the difference between throw and throws?

    1. **`throw`** → actually *throws* an exception object inside a method. Example: `throw new IOException("error");`
    - **`throws`** → used in a method signature to declare that the method *might throw* certain exceptions. Example: `void readFile() throws IOException`.
    -

    In Java, both are related to exceptions, but they’re used in different places:

    - **`throw` (statement):**
        - Used inside a method or block to actually throw an exception object.
        - You only throw one exception at a time.
        - Example:

            ```java
            if (file == null) {
                throw new NullPointerException("File is missing");
            }
            
            ```

    - **`throws` (keyword in method signature):**
        - Declares that a method can potentially throw one or more exceptions.
        - It doesn’t throw anything by itself; it just warns callers that they need to handle it.
        - Example:

            ```java
            void readFile() throws IOException {
                // code that might throw IOException
            }
            
            ```


    **In short:**
    
    - `throw` → actually throws an exception.
    - `throws` → declares possible exceptions a method might throw.
12. What is StringBuilder and StringBuffer?
    1. Both `StringBuilder` and `StringBuffer` are used to create mutable strings in Java. The main difference is that **`StringBuffer` is thread-safe** (synchronized) but slower, while **`StringBuilder` is faster** but not thread-safe.
    2.

    In Java, normal `String` objects are **immutable**—once created, they can’t be changed. If you do string concatenation in a loop, it creates a lot of temporary objects.

    - **`StringBuffer`**
        - Introduced first (Java 1.0).
        - Mutable string, so you can modify the same object without creating new ones.
        - It is **synchronized**, meaning multiple threads can safely use it.
        - Downside: synchronization makes it a bit slower.
    - **`StringBuilder`**
        - Added later (Java 5).
        - Also mutable, but **not synchronized**, so it’s faster.
        - Should be used when you’re working in a **single-threaded** environment.

    **Example:**

    ```java
    StringBuilder sb = new StringBuilder("Hello");
    sb.append(" World");
    System.out.println(sb); // Hello World
    
    ```

    **In short:**

    - `StringBuffer` → thread-safe, slower.
    - `StringBuilder` → not thread-safe, faster.
    - Both are better than plain `String` when you’re doing lots of modifications.
13. What are different access modifiers
    1. Java has four main access modifiers:
    - **public** → accessible everywhere.
    - **protected** → accessible within the same package and by subclasses.
    - **default** (no keyword) → accessible only within the same package.
    - **private** → accessible only within the same class.
-

Access modifiers in Java control the visibility of classes, methods, and variables:

1. **public**
    - Visible to all classes, everywhere.
    - Example: `public class MyClass {}`
2. **protected**
    - Visible within the same package **and** to subclasses (even in different packages).
    - Often used when you want to share with child classes but not the whole world.
3. **default (package-private)**
    - If you don’t write any modifier, it’s the default.
    - Accessible only within the same package.
    - Example: `class MyHelper {}` (no modifier = package-private).
4. **private**
    - Visible only inside the same class.
    - Often used for fields and helper methods to enforce encapsulation.