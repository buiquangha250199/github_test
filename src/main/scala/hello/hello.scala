package hello
import greeting._
import goodbye.sayGoodbye

object hello extends App {
  val g = greeting
  g.SayHello

  val b = sayGoodbye
}
