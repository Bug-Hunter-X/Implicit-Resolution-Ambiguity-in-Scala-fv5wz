```scala
class MyClass[T](val value: T) {
  def myMethod(implicit ev: Ordering[T]): T = value
}

val instance1 = new MyClass(10)
val instance2 = new MyClass("hello")

// This will compile successfully
println(instance1.myMethod)

// This will cause a compilation error in some cases due to implicit resolution ambiguity
println(instance2.myMethod)
```