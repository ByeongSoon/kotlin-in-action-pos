package repository

import domain.Item
import printer.ItemPrinter

class ItemRepository(
  private val items: MutableList<Item> = mutableListOf<Item>(
    Item("치토스",1000),
    Item("참이슬",1500),
    Item("파워에이드",2000),
    Item("신라면",950)) as MutableList<Item>,
  val itemPrinter: ItemPrinter = ItemPrinter()
) {
  fun create(newItem: Item) {
    items.add(newItem)
    itemPrinter.create()
  }

  fun remove(index: Int) {
    items.removeAt(index)
    itemPrinter.remove()
  }

  fun searchAll() {
    for ((i, item) in items.withIndex()) {
      println("$i : $item")
    }
  }
}