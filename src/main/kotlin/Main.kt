fun main() {

  val myPos = Pos("byeongsoon")
  myPos.start()
  myPos.viewItemList()

  myPos.process()

  myPos.addItem("감자칩",2000)
  myPos.viewItemList()

  myPos.removeItem(2)
  myPos.viewItemList()

  myPos.exit()

  // todo : while loop 돌면서 입력받아서 기능 수행
  while (!true) {
    var input: Int = 1 // 입력 받아야함
    if (input in 1..5) {
      println("올바른 명령어가 아닙니다.")
      return
    }

    when(input) {
      1 -> {
        myPos.viewItemList()
      }
      2 -> {
        // todo : 새로 등록할 물품 입력받기
        val newItemName = "바나나우유"
        val newItemPrice = 1200
        myPos.addItem(newItemName,newItemPrice)
      }
    }

    // todo : when 이용하여 입력값별로 프로세스 수행

  }

}


