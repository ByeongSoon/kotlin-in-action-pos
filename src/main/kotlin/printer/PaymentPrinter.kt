package printer

class PaymentPrinter {
  fun choiceItem() {
    println(
      """
        결재하실 상품을 골라주세요.
        예시) 0,2,4 / 번호와 구분자(,)로만 입력해주세요.
      """.trimIndent()
    )
  }
}