fun main() {

  val myPos = Pos("byeongsoon")
  myPos.start()
  myPos.printAll()

  myPos.process()

  myPos.create("감자칩",2000)
  myPos.printAll()

  myPos.remove(2)
  myPos.printAll()

  myPos.exit()

}


