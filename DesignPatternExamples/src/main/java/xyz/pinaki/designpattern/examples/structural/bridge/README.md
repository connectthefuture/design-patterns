## Why Bridge Pattern
* The primary function of a Bridge is to decouple an abstraction from its implementation. 
E.g., [Decouple API from Implementation](https://en.wikipedia.org/wiki/Bridge_pattern#Java).
<p align="center">
  <img src="../../../../../../../assets/bridge-why.png?raw=true" width="750"/>
</p>

* For instance, same API needs to run on mobile vs desktops which have very memory / processing power.
 Bridge pattern lets the API remain constant while the internal implementation might vary.
* Client calls to the abstraction are forwarded to the correct implementation.
* When to use bridge pattern
<p align="center">
  <img src="../../../../../../../assets/bridge-when.png?raw=true" width="450"/>
</p>

## Goals 
<p align="center">
  <img src="../../../../../../../assets/bridge-goals.png?raw=true" width="450"/>
</p>

## Bridge Example
<p align="center">
  <img src="../../../../../../../assets/bridge-example.png?raw=true" width="450"/>
</p>
<p align="center">
  <img src="../../../../../../../assets/bridge-example-2.png?raw=true" width="450"/>
</p>
<p align="center">
  <img src="../../../../../../../assets/bridge-uml.png?raw=true" width="450"/>
</p>

## Application in Java
* Used in Java Sockets
<p align="center">
  <img src="../../../../../../../assets/bridge-use-java-socket.png?raw=true" width="450"/>
</p>

## Bridge vs Adapter
* "Adapter makes things work after they're designed; Bridge makes them work before they are. [GoF, p219]"

## References
* [SafariOnline](https://www.safaribooksonline.com/library/view/design-patterns-in/9780133489989/5_3.html)
* [YT Video](https://www.youtube.com/watch?v=9jIgSsIfh_8&index=15&list=PLF206E906175C7E07)
