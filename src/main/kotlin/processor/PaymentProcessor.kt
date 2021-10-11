package processor

import printer.PaymentPrinter
import repository.ItemRepository

class PaymentProcessor(
  private val itemRepository: ItemRepository,
  private val paymentPrinter: PaymentPrinter = PaymentPrinter()
) {
  fun toPay() {
    itemRepository.searchAll()
    paymentPrinter.choiceItem()
    val input = readLine()

    // todo : 입력받은 데이터 구분자로 쪼개서 그에 해당하는 Item 정보 get 한 뒤에 가격정보 더하기
    // todo : 데이터에 대한 결재 시 현금, 카드, 카카오페이 선택해서 결재
  }
}