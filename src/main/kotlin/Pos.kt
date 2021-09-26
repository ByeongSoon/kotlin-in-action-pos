class Pos(
  private val staff: String
  ) {

  private val itemList: MutableList<Item> = mutableListOf()

  fun start() {
    println("***********Kotlin 편의점***********")
    println("POS 실행중....")
    makeItemList()
    println("접속 직원은 ${staff}님 입니다.")
    println("***********환영합니다***********")
    println()
  }

  fun exit() {
    println("***********종료합니다***********")
    println("POS 종료중....")
  }

  fun process() {
    println("*****************작업 선택*****************")
    println("1. 상품조회 | 2. 상품등록 | 3. 상품삭제 | 4.결재")
    println()
  }

  fun viewItemList() {
    println("***********현재 판매중인 상품은***********")
    var i = 0
      for (item in itemList) {
        println("${++i}. ${item.name} : ${item.price}원")
      }
    println("*************************************")
    println()
  }

  fun addItem(name: String, price:Int) {
    println("상품 등록중...")
    val newItem = Item(name, price)
    itemList.add(newItem)

    println("상품 추가가 완료되었습니다.")
    println()
  }

  fun removeItem(index: Int) {
    println("상품 삭제중..")
    itemList.removeAt(index - 1)
    println("상품 삭제가 완료되었습니다.")
    println()
  }

  fun makeItemList() {
    println("inti()...")

    val items = listOf<Item>(Item("치토스",1000),Item("참이슬",1500),Item("파워에이드",2000),Item("신라면",950))
    itemList.addAll(items)
  }

}
