
1. Primitive data types in Java
Java has 8 primitive data types (stored directly in memory, not as objects):
•	byte (8-bit)
•	short (16-bit)
•	int (32-bit)
•	long (64-bit)
•	float (32-bit decimal)
•	double (64-bit decimal)
•	char (16-bit Unicode character)
•	boolean (true/false)
________________________________________
2. Difference between == and equals()
•	== → Compares references (memory addresses) for objects, values for primitives.
•	equals() → Compares content/data of objects (unless overridden).
Example:
String s1 = new String("Java");
String s2 = new String("Java");

System.out.println(s1 == s2);      // false (different objects)
System.out.println(s1.equals(s2)); // true  (same content)
________________________________________
3. String Pool
•	A special memory area in the heap where Java stores string literals for reuse.
•	Example:
String s1 = "Hello";
String s2 = "Hello"; // points to same object in String Pool
________________________________________
4. Final, Finally, Finalize
•	final → Keyword used for constants, methods (cannot override), and classes (cannot extend).
•	finally → Block used in exception handling, always executes (used to close resources).
•	finalize() → Method called by Garbage Collector before destroying an object (not reliable, rarely used).
________________________________________
5. Static
•	Belongs to the class, not instance.
•	Shared across all objects.
•	Can apply to variables, methods, blocks, and nested classes.
•	Example: static int count;
________________________________________
6. OOP (4 Principles)
1.	Encapsulation → Wrapping data + methods together, using access modifiers.
2.	Abstraction → Hiding implementation details, exposing only functionality (via abstract classes, interfaces).
3.	Inheritance → Child class inherits properties/methods from parent class.
4.	Polymorphism → One action, different implementations (method overloading & overriding).
________________________________________
7. Polymorphism
•	Compile-time (Overloading): Multiple methods with same name, different parameters.
•	Runtime (Overriding): Subclass provides specific implementation of parent’s method.
________________________________________
8. Method Overriding vs Overloading
•	Overloading: Same method name, different parameter list (compile-time).
•	Overriding: Same method signature in subclass, runtime binding.
________________________________________
9. Abstract Class vs Interface
•	Abstract Class:
o	Can have abstract & non-abstract methods.
o	Supports variables, constructors, and access modifiers.
o	Single inheritance.
•	Interface:
o	Only abstract methods (till Java 7), default & static methods (Java 8+).
o	Only public, static, final variables.
o	Multiple inheritance possible.
________________________________________
10. Exception vs Error
•	Exception: Recoverable, occurs due to program logic (e.g., NullPointerException).
•	Error: Unrecoverable, system-level (e.g., OutOfMemoryError).
________________________________________
11. Difference between throw and throws
•	throw → Used to throw an exception inside a method.
•	throws → Declares exceptions a method might throw.
________________________________________
12. StringBuilder vs StringBuffer
•	Both are mutable strings.
•	StringBuffer: Thread-safe (synchronized), slower.
•	StringBuilder: Not synchronized, faster, preferred in single-threaded use.
________________________________________
13. Access Modifiers in Java
1.	public → Accessible everywhere.
2.	protected → Accessible within package & subclasses.
3.	default (package-private) → Accessible within same package only.
4.	private → Accessible only within the same class.

