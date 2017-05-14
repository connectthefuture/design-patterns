## Why Composite Design Pattern 
* Tight coupling of the data structure and functionality imdepedes extensability. Composite Pattern helps in loose coupling.
* For instance, in  a tree with differenet types of nodes (operator and operand in an expression tree), it might be difficult to add new type of node if the 
  data structure is tightly coupled with the functionality.
* Will be useful to represent has-a or part-whole hierarchies where both the part and whole are represented uniformly.  
<p align="center">
  <img src="../../../../../../../assets/composite-definition.png?raw=true" width="450"/>
</p>

## Intent
* Treat individual objects and multiple recursively composable objects uniformly.

## Applicability
<p align="center">
  <img src="../../../../../../../assets/ccomposite-applicability.png?raw=true" width="450"/>
</p>
Example hierarchy:
<p align="center">
  <img src="../../../../../../../assets/composite-example-hierarchy.png?raw=true" width="450"/>
</p>

## Consequences
* Uniformity: E.g., we can iterate through the tree without knowing the internal structure.
<p align="center">
  <img src="../../../../../../../assets/composite-uniformity.png?raw=true" width="450"/>
</p>

* Extensibility
<p align="center">
  <img src="../../../../../../../assets/composite-extensibility.png?raw=true" width="450"/>
</p>

* Parsimony
<p align="center">
  <img src="../../../../../../../assets/composite-parsimony.png?raw=true" width="450"/>
</p>

## References
* [YT Video](https://www.youtube.com/watch?v=2HUnoKyC9l0&index=18&list=PLF206E906175C7E07)
* [SafariOnline](https://www.safaribooksonline.com/library/view/design-patterns-in/9780133489989/5_2.html)