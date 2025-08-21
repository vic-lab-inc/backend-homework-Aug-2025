What are Primitive data types in Java?
byte (8-bit)
short (16-bit)
int (32-bit)
long (64-bit)
float (32-bit, decimal)
double (64-bit, decimal)
char (16-bit, Unicode character)
boolean (true/false)

What is the difference between == and equals()?
== → reference (same object?)
.equals() → value (same content?)

What is String Pool?
memory area in the heap to store string literals.
When you create a string literal, Java checks the pool first.

What is Final, Finally and Finalize?
final → keyword to make variable constant, method non-overridable, class non-inheritable.
finally → block that always executes after try-catch (for cleanup).
finalize → method called by GC before destroying an object (rarely used).


What is Static?
shared by all objects, tied to the class.

What is OOP (4 principles)?
Encapsulation – hide data, expose only through methods.
Abstraction – show only essential details, hide complexity.
Inheritance – child class reuses parent’s code.
Polymorphism – one interface, many implementations (method overriding/overloading).

What is Polymorphism?
one interface, many implementations (method overriding/overloading).

What is method overriding and overloading?
Overriding = child changes behavior, Overloading = same method, different inputs.

What is abstact class and interface? Difference?
Abstract class → can have abstract + concrete methods, supports single inheritance, can hold state (fields).
Interface → all methods abstract (until Java 8+ default/static allowed), supports multiple inheritance, usually no state.

What is exception and error?
Exception → issue that can be handled (e.g., IOException, NullPointerException).
Error → serious problem that can’t be handled (e.g., OutOfMemoryError, StackOverflowError).

What is the difference between throw and throws?
Throw → used to explicitly throw an exception in code.
Throws → used in method signature to declare that a method can throw an exception.

What is StringBuilder and StringBuffer?
StringBuilder → mutable, not thread-safe, faster.
StringBuffer → mutable, thread-safe, slower.

What are different access modifiers
public – accessible everywhere.
protected – accessible within package + subclasses.
default (no keyword) – accessible only within package.
private – accessible only within the same class.
public > protected > default > private (broad → narrow).