# Implicit Resolution Ambiguity in Scala
This repository demonstrates a common issue in Scala programming: implicit resolution ambiguity.  When multiple implicit instances are in scope that match a parameter type, the compiler might fail to choose one, resulting in a compilation error. This issue is particularly prevalent when dealing with generic types and implicit parameters.

The `bug.scala` file contains code that highlights the problem.  The `bugSolution.scala` file offers a solution to resolve the ambiguity.