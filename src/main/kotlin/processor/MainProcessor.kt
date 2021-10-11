package processor

import domain.Pos
import printer.PosPrinter
import repository.ItemRepository
import kotlin.system.exitProcess

class MainProcessor(
  private val itemRepository: ItemRepository = ItemRepository(),
  private val posPrinter: PosPrinter = PosPrinter(),
  private val POS: Pos = Pos("v1.0","byeongsoon")
) {

  fun run() {
    posPrinter.start()
    while (true) {
      posPrinter.command()
      when(readLine()) {
        "1" -> PaymentProcessor(itemRepository).toPay()
        "2" -> ItemProcessor(itemRepository).run()
        "3" -> CalculateProcessor().calculate()
        "4" -> exit()
        "5" -> info()
      }
    }
  }

  fun exit() {
    posPrinter.exit();
    exitProcess(0)
  }

  fun info() {
    println(POS)
  }

}