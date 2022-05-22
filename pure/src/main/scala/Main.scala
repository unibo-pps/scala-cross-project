import upickle.default.*

case class Person(name: String, surname: String)
given ReadWriter[Person] = macroRW

// Same application work in several platform (with the additional library!)
// start an sbt shell
// type pure(JS|JVM|Native) => e.g. pureJS
// type run
@main def main(): Unit =
  val me = Person("Gianluca", "Aguzzi")
  println(write(me))
