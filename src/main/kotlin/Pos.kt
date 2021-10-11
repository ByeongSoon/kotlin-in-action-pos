class Pos(
  private val staff: String
  ) {

  private val itemList: MutableList<Item> = mutableListOf()

  fun start() {
    println("***********Kotlin 편의점***********")
    println("POS 실행중....")
    init()
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

    // todo : while loop 돌면서 입력받아서 기능 수행
    while (!true) {
      var input: Int = 1 // 입력 받아야함
      if (input in 1..5) {
        println("올바른 명령어가 아닙니다.")
        return
      }

      when(input) {
        1 -> {
          printAll()
        }
        2 -> {
          // todo : 새로 등록할 물품 입력받기
          val newItemName = "바나나우유"
          val newItemPrice = 1200
          create(newItemName,newItemPrice)
        }
      }

      // todo : when 이용하여 입력값별로 프로세스 수행

    }
  }

  fun printAll() {
    println("***********현재 판매중인 상품은***********")
    var i = 0
      for (item in itemList) {
        println("${++i}. ${item.name} : ${item.price}원")
      }
    println("*************************************")
    println()
  }

  fun create(name: String, price:Int) {
    println("상품 등록중...")
    val newItem = Item(name, price)
    itemList.add(newItem)

    println("상품 추가가 완료되었습니다.")
    println()
  }

  fun remove(index: Int) {
    println("상품 삭제중..")
    itemList.removeAt(index - 1)
    println("상품 삭제가 완료되었습니다.")
    println()
  }

  fun init() {
    println("inti()...")

    val items = listOf<Item>(Item("치토스",1000),Item("참이슬",1500),Item("파워에이드",2000),Item("신라면",950))
    itemList.addAll(items)
  }

  fun payment(paymentList: List<Int>): Int {
    var totalPrice = 0
    for (payment in paymentList) {
      totalPrice += itemList.get(payment).price
//      totalPrice += itemList[payment].price
    }

    return totalPrice
  }

}
