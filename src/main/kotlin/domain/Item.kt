package domain

data class Item(
  val name: String,
  val price: Int
  ) {
  override fun toString(): String {
    return "상품명 : $name, 가격 : $price"
  }
}