# UML Class Diagram
## Class fields and methods
<p align="center">
  <img src="assets/class-fields.png?raw=true" width="350"/>
</p>

## Relationship Among Classes:
## Dependency
* Used to avoid tight coupling. See dependency injection.
* Enable loose coupling.
* Dog is passed to WashedAnimal only for a method. It might be discarded within the method.
* A dependency is a semantic connection between dependent and independent model elements.
* It exists between two elements if changes to the definition of one element (the server or target) may cause changes
to the other (the client or source).
* This association is uni-directional.
* Often not shown.
<p align="center">
  <img src="assets/dependence.png?raw=true" width="450"/>
</p>

## Association
* One class knows about the other without being directly dependent, e.g. using attributes.
* A binary association (with two ends) is normally represented as a line. Usually shown with a line without arrows.
* For instance, Teacher and Student and related through school without being dependent.
<p align="center">
  <img src="assets/association.png?raw=true" width="450"/>
</p>

* An association can link any number of classes. An association with three links is called a ternary association.
* An association can be named, and the ends of an association can be adorned with role names, ownership indicators,
multiplicity, visibility, and other properties.
* There are four different types of association: bi-directional, uni-directional, aggregation (includes composition
aggregation) and reflexive. Bi-directional and uni-directional associations are the most common ones.
<p align="center">
  <img src="assets/binary-association.png?raw=true" width="350"/>
</p>

## Aggregation
* Weak Has-A or Whole-Part Relationship
* Represented by a hollow diamond next to the class that is whole.
* This is called *weak* since the part instances can exist independently of the whole / container instances.
* For instance, Aggregation can occur when a class is a collection or container of other classes, but the contained classes do not have a strong lifecycle dependency on the container. The contents of the container are not automatically destroyed when the container is.
In the example below, the SimpleMessage objects are created independently and added to the collection in MultiMessage.
<p align="center">
  <img src="assets/aggregation.png?raw=true" width="350"/>
 </p>

*Example: Library has Students and books. Here the student can exist without library, the relation between student and library is aggregation.
* Example: Lake has a slide, but the slide can exist independently out of the lake.
<p align="center">
  <img src="assets/aggregation-lake.png?raw=true" width="350"/>
 </p>

## Composition
* Strong "Has-A" relationship
* Represented by a  filled diamond on the container / Whole class.
<p align="center">
  <img src="assets/composition.png?raw=true" width="400"/>
</p>

* Lifecycle of the part / contained class objects is controlled by the composing class.
Instances of part are created withing the (constructor of the) Composing class and destroyed by (the destructor) of
the Composing class.
<p align="center">
  <img src="assets/composition-lifecycle.png?raw=true" width="350"/>
</p>

* Example
<p align="center">
  <img src="assets/composition-example.png?raw=true" width="350"/>
</p>

* Difference between Aggregation adn Compositon
<p align="center">
  <img src="assets/aggregation-vs-composition.png?raw=true" width="400"/>
</p>

## Inheritance / Generalization
* This relationship is between classes themselves -- not between instances.
<p align="center">
  <img src="assets/generalization.png?raw=true" width="350"/>
</p>

### Relation Notation
<p align="center">
  <img src="assets/class-notation.png?raw=true" width="200"/>
</p>

### Example
<p align="center">
  <img src="assets/house-example.png?raw=true" width="350"/>
</p>

## References:
* https://www.youtube.com/watch?v=5Q0ZM6ODBHw
* https://www.youtube.com/watch?v=BhEoV57nj0Q
* https://www.youtube.com/watch?v=3cmzqZzwNDM