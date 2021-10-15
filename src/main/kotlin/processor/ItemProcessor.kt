package processor

import domain.Item
import printer.ItemPrinter
import repository.ItemRepository

class ItemProcessor(
  private val itemRepository: ItemRepository,
  private val itemPrinter: ItemPrinter = ItemPrinter()
) {
  fun run() {
    while (true) {
      itemPrinter.command()
      when(readLine()) {
        "1" -> itemRepository.searchAll()
        "2" -> create()
        "3" -> delete()
        "4" -> return
        else -> continue
      }
    }
  }

  fun create() {
    println("추가하실 상품명과 가격을 입력해주세요.")
    val input = readLine()
    if (input != null) {
      itemRepository.create(
        try {
          Item(
            input.substringBeforeLast(","),
            input.substringAfterLast(",").toInt(),
          )
        } catch (e: Exception) {
          println("구분자가 잘못되었거나 입력에 오류가 있습니다.")
          return
        }
      )
    }
    itemPrinter.create()
  }

  fun delete() {
    println("삭제하실 상품 번호를 입력하세요.")
    val input = readLine()?.toInt()
    if (input != null)
      itemRepository.remove(input)
    else
      println("해당 상품 번호는 없습니다.")
    itemPrinter.remove()
  }
}