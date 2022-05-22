package it.unibo

import scala.concurrent.{Await, Future}

case class Person(name: String, surname: String)
// Application specific
trait UI:
  def render(person: Person): Unit

def application(ui: UI): Unit =
  val me = Person("Gianluca", "Aguzzi")
  println("Shared part...")
  ui.render(me)