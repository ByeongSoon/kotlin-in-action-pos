package printer

class ItemPrinter() {
  fun command() {
    println(
      """
        *****************상품 관리*****************
        1. 상품조회
        2. 상품추가
        3. 상품삭제
        4. 뒤로가기
        ****************************************
      """.trimIndent()
    )
  }

  fun create() {
    println("추가 완료!!")
  }

  fun remove() {
    println("삭제 완료!!!")
  }

}