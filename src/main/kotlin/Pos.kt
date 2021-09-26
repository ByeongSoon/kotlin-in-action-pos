class Pos(
  private val staff: String,
  private val itemList: List<Item>
  ) {

  fun start() {
    println("***********Kotlin 편의점***********")
    println("POS 실행중....")
    println("***********환영합니다***********")
  }

  fun init() {
    for (item in itemList) {
      println("${item.name} : ${item.price}원")
    }
  }

  fun addItem(name: String, price:Int) {

  }

}