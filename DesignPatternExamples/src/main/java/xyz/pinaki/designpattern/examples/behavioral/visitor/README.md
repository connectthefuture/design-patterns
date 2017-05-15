## Visitor Pattern
* Used to add new functionality to pre-existing data structures without cjamging their code.
* 2 Hierarchies. One for the visitor:
<p align="center">
  <img src="../../../../../../../assets/visitor-hierarchy.png?raw=true" width="450"/>
</p>
The other for the visitable:
<p align="center">
  <img src="../../../../../../../assets/visitor-visitable-accept.png?raw=true" width="450"/>
</p>

## Structure and Participants
<p align="center">
  <img src="../../../../../../../assets/visitor-structure.png?raw=true" width="450"/>
</p>

## Implementation
* Create a Visitor class hierarchy that defines a pure virtual visit() method in the abstract base class for each concrete derived class in the aggregate node hierarchy. Each visit() method accepts a single argument - a pointer or reference to an original Element derived class.
* Each operation to be supported is modelled with a concrete derived class of the Visitor hierarchy. The visit() methods declared in the Visitor base class are now defined in each derived subclass by allocating the "type query and cast" code in the original implementation to the appropriate overloaded visit() method.
* Add a single pure virtual accept() method to the base class of the Element hierarchy. accept() is defined to receive a single argument - a pointer or reference to the abstract base class of the Visitor hierarchy.
* Each concrete derived class of the Element hierarchy implements the accept() method by simply calling the visit() method on the concrete derived instance of the Visitor hierarchy that it was passed, passing its "this" pointer as the sole argument. 
## Example
Visitor Interface:
~~~java
public interface Visitor {
    /** Visit a @a LeafNode. */
    void visit(LeafNode node);

    /** Visit a @a CompositeNegateNode. */
    void visit(CompositeNegateNode node);

    /** Visit a @a CompositeAddNode. */
    void visit(CompositeAddNode node);

    /** Visit a @a CompositeSubtractNode. */
    void visit(CompositeSubtractNode node);
    // ...
}
~~~
Visitor Implementation
~~~java
public class PrintVisitor implements Visitor {
    /** Ctor */
    public PrintVisitor() {    
    }

    /** Visits a @a LeafNode and prints it contents. */
    public void visit(LeafNode node) {
        Platform.instance().addString(node.item() + " ");
    }

    /** Visit a @a CompositeNegateNode and prints its contents. */
    public void visit(CompositeNegateNode node) {
        Platform.instance().addString("-");
    }

    /** Visit a @a CompositeAddNode and prints its contents. */
    public void visit(CompositeAddNode node) {
        Platform.instance().addString("+ ");
    }

    /** Visit a @a CompositeSubtractNode and prints its contents. */
    public void visit(CompositeSubtractNode node) {
        Platform.instance().addString("- ");
    }
    // ...
 }
~~~
## Consequences
* Flexibility: Visitor algorithms and object structure are independent.
* Separation of Concerns: Localized functionality of visitor subclass.
<p align="center">
  <img src="../../../../../../../assets/visitor-consequence.png?raw=true" width="450"/>
</p>

## Double Dispatch
<p align="center">
  <img src="../../../../../../../assets/visitor-double-dispatch.png?raw=true" width="450"/>
</p>

## Static Polymorphism

## References
* [SafariOnline](https://www.safaribooksonline.com/library/view/design-patterns-in/9780133489989/5_8.html)
* [Wiki](https://en.wikipedia.org/wiki/Visitor_pattern#Java_example)
* [SourceMaking](https://sourcemaking.com/design_patterns/visitor)
