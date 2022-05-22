package it.unibo

import it.unibo.*

def nativeUi: UI = (person: Person) => println(s"Hello, ${person}")

@main def main(): Unit =
  application(nativeUi)
