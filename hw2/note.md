# Homework2 Notes

## What are Primitive data types in Java?
Java has **8 primitive data types** that are predefined by the language and not objects:
- `byte` (8-bit)
- `short` (16-bit)
- `int` (32-bit)
- `long` (64-bit)
- `float` (32-bit floating point)
- `double` (64-bit floating point)
- `char` (16-bit Unicode character)
- `boolean` (true/false)

---

## What is the difference between `==` and `equals()`?
- `==` checks **reference equality** (for objects) or **value equality** (for primitives).
- `equals()` is a method defined in `Object` class, used to check **content/value equality** of two objects (can be overridden).

---

## What is String Pool?
The **String Pool** (or intern pool) is a special memory area inside the Java heap where string literals are stored.
- When you create a string literal, JVM first checks the pool. If the literal already exists, it reuses the same reference.
- This improves memory efficiency.

---

## What is Final, Finally and Finalize?
- `final` → Keyword used for constants, methods (cannot be overridden), and classes (cannot be inherited).
- `finally` → Block in exception handling that always executes (whether exception occurs or not).
- `finalize()` → Method in `Object` class, called by Garbage Collector before destroying an object (not guaranteed, rarely used).

---

## What is Static?
`static` means the member belongs to the **class**, not to instances:
- `static variable` → shared across all objects of the class.
- `static method` → can be called without creating an object.
- `static block` → executes once when the class is loaded.

---

## What is OOP (4 principles)?
1. **Encapsulation** → Hiding internal details, exposing only necessary information through getters/setters.
2. **Abstraction** → Hiding implementation details and showing only functionality (abstract classes, interfaces).
3. **Inheritance** → Acquiring properties and behaviors from a parent class.
4. **Polymorphism** → Same method or operator behaving differently in different contexts (overloading/overriding).

---

## What is Polymorphism?
Polymorphism means "many forms."
- **Compile-time polymorphism**: method overloading (decided at compile time).
- **Runtime polymorphism**: method overriding (decided at runtime, based on the object).

---

## What is method overriding and overloading?
- **Overriding** → A subclass provides a specific implementation of a method already defined in the parent class (same signature, runtime behavior).
- **Overloading** → Multiple methods with the same name but different parameter lists (number or type of arguments, compile-time).

---

## What is abstract class and interface? Difference?
- **Abstract class**:
    - Can have both abstract (unimplemented) and concrete (implemented) methods.
    - Supports inheritance (extends).
    - Can have instance variables.

- **Interface**:
    - Defines only method signatures (Java 8+ allows default and static methods).
    - Supports multiple inheritance (implements).
    - Fields are implicitly `public static final`.

**Difference**:  
Use abstract class when you need partial implementation; use interface when you want a contract for multiple unrelated classes.

---

## What is exception and error?
- **Exception** → Events that occur during program execution and can be handled (e.g., `NullPointerException`, `IOException`).
- **Error** → Serious problems that cannot be recovered (e.g., `OutOfMemoryError`, `StackOverflowError`).

---

## What is the difference between throw and throws?
- `throw` → Used to actually throw an exception inside a method or block. Example: `throw new IOException("error")`.
- `throws` → Used in a method signature to declare that the method may throw exceptions. Example: `public void read() throws IOException`.

---

## What is StringBuilder and StringBuffer?
- Both are used to create mutable (modifiable) strings.
- **StringBuilder** → Not thread-safe, but faster (no synchronization).
- **StringBuffer** → Thread-safe, synchronized methods, but slower.

---

## What are different access modifiers?
1. **public** → Visible everywhere.
2. **protected** → Visible within the same package and subclasses.
3. **default** (no modifier) → Visible only within the same package.
4. **private** → Visible only within the same class.
