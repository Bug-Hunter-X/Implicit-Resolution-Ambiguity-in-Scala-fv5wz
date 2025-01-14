```scala
class MyClass[T](val value: T) {
  def myMethod(implicit ev: Ordering[T]): T = value
}

val instance1 = new MyClass(10)
val instance2 = new MyClass("hello")

// To fix the ambiguity for String, we provide an explicit Ordering[String]
implicit val stringOrdering: Ordering[String] = Ordering.fromLessThan(_.compareTo(_) < 0)

// This now works without error
println(instance1.myMethod)
println(instance2.myMethod)
```