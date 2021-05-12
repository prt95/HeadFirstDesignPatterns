# HeadFirstDesignPatterns

Build :
mvn package

Run:
java -cp /Users/pritkuma/Documents/HeadFirstDesignPattern/designs/target/designcodes-1.0-SNAPSHOT.jar com.design.pattern.App

Intro to design patterns :
        Chances are that someone has already solved your software design problem. Reading about design patterns is like taking advantage of the best design practices and experiences of those who have fought the beast of software design and triumphed.


Chapter 1:
Design Principle: Identify the aspects of your application that vary and separate them from what stays the same.
i.e
Take the parts that vary and encapsulate them, so that later you can alter or extend the parts that vary without affecting those that don’t.


Design Principle: Program to an interface, not an implementation.

clarification: There's the concept of the interface, but there's also the java construct interface. You can program to an interface without having to actually use a java interface. The point is to exploit polymorphism by programming to a supertype so that the actual runtime object isn’t locked into the code.
To achieve programming to an interface we could use an abstract class or an interface.

Design Principle: favor composition over inheritance.

i.e HAS-A can be better than IS-A


Strategy Pattern: Defines a family of algorithms, encapsulates each one, and makes them interchangeable. The strategy pattern lets the algorithm vary independently from clients that use it.


Chapter 2
Design Principle: Strive for loosely coupled designs between objects that interact.

loose coupling: When two objects are loosely coupled, they can interact but they have very little knowledge of each other.



Observer Pattern:  It defines one-to-many dependencies between objects so that when one object changes state, all of its dependents are notified and updated automatically.

Java has built in support for observer pattern. This is achieved using Observer interface and Observable class.

Drawbacks of Java's built in implementation :
Observable is a class that you have to subclass. It means you can't add the observable behavior to an existing class that already extends another superclass.
There isn't any Observable interface so you can’t even create your own implementation that plays well with Java's built-in observer API.


Chapter 3
Design Principle: Classes should be open for extension, but closed for modification.

Decorator Pattern: It attaches additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.


extract :
used to give your objects new responsibilities without changing any of the underlying classes.
Decorators have the same supertype as the objects they decorate.
You can use one or more decorators to decorate an object.
Drawback: This can result in many small objects in the project
Confusion over Inheritance vs Composition in Decorator Pattern: Inheritance in decorator pattern is used to achieve the type matching(decorators have the same type as the objects they are going to decorate), but it is not used to get behavior.


Chapter 4

Design Principle: Depend upon abstraction. Do not depend upon concrete classes. Also known as Dependency Inversion Principle.
extract: It suggests that our high-level components should not depend on low-level components, rather they should both depend on abstraction.

Factory Pattern: It defines an interface for creating an object but lets subclasses decide which class to instantiate. i.e Factory method defers instantiation to subclasses.

extract:
take all the parts of your application that instantiate concrete classes and separate or encapsulate them from the rest of your application. By doing this we will have only one place to make modifications when the implementation changes.
Defining a simple factory as a static method is a common technique because you don't need to instantiate an object to make use of the create method. But it also has the disadvantage that you cant subclass and changes the behavior of the create method.

The factory method pattern encapsulates object creation by letting subclasses decide what objects to create.

Abstract Factory Pattern: It provides an interface for creating families of related or dependent objects without specifying their concrete classes.


Factory pattern: Use me to decouple your client code from concrete classes you need to instantiate or if you don’t know ahead of time all the concrete classes you are going to need. To use me just subclass me and implement my factory method.
Abstract Factory pattern: Use me whenever you have families of products you need to create and you want to make sure your clients create products that belong together.

Abstract factory pattern is another layer of abstraction over factory pattern.


