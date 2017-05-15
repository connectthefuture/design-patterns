## Why Decorator
* The decorator pattern can be used to extend (decorate) the functionality of a certain object statically, or in some cases at run-time, independently of other instances of the same class.
* This is achieved by designing a new Decorator class that wraps the original class.
* What is it
<p align="center">
  <img src="../../../../../../../assets/decorator.png?raw=true" width="450"/>
</p>

## How to create this pattern
Use the following Steps (see UML diagram below)
* Subclass the original Component class into a Decorator class.
* In the Decorator class, add a Component pointer as a field.
* In the Decorator class, pass a Component to the Decorator constructor to initialize the Component pointer.
* In the Decorator class, forward all Component methods to the Component pointer.
* In the ConcreteDecorator class, override any Component method(s) whose behavior needs to be modified.
<p align="center">
  <img src="../../../../../../../assets/decorator-uml.png?raw=true" width="450"/>
</p>

## Example 
See YT Video Ref for details.
<p align="center">
  <img src="../../../../../../../assets/decorator-example-uml.png?raw=true" width="450"/>
</p>

## References
* [Wiki](https://en.wikipedia.org/wiki/Decorator_pattern#Java)
* [YT Video](https://www.youtube.com/watch?v=j40kRwSm4VE&list=PLF206E906175C7E07&index=11)