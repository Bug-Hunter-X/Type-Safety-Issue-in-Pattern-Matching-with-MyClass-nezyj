```scala
class MyClass[T](val value: T) {
  def myMethod(other: MyClass[T]): T = {
    value match {
      case i: Int => i + other.value.asInstanceOf[Int]
      case s: String => s + other.value.asInstanceOf[String]
      case _ => throw new IllegalArgumentException("Unsupported type")
    }
  }
}

val num1 = new MyClass(1)
val num2 = new MyClass(2)
println(num1.myMethod(num2)) //3

val str1 = new MyClass("hello")
val str2 = new MyClass(" world")
println(str1.myMethod(str2)) //hello world

val mix1 = new MyClass(1)
val mix2 = new MyClass(" world")
println(mix1.myMethod(mix2))// Exception
```