# UML Class Diagram
## Class fields and methods
<p align="center">
  <img src="assets/class-fields.png?raw=true" width="350"/>
</p>

## Relationship Among Classes:
## Dependency
<p align="center">
  <img src="assets/dependence.png?raw=true" width="450"/>
</p>

## Association
<p align="center">
  <img src="assets/association.png?raw=true" width="450"/>
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
* Lifecycle of the part / contained class objects is controlled by the composing class.
Instances of part are created withing the (constructor of the) Composing class and destroyed by (the destructor) of
the Composing class.
<p align="center">
  <img src="assets/composition.png?raw=true" width="400"/>
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