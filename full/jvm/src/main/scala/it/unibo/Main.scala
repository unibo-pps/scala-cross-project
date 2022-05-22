package it.unibo
import scala.swing.*

def render: UI = (person) =>
  new Frame {
    title = s"Hello"
    size = new Dimension(600, 100)
    contents = new FlowPanel {
      contents += Label(s"${person.surname} ${person.name} this is a JVM App!!")
    }
    centerOnScreen()
    pack()
    open()
  }
@main def main(): Unit = application(render)
