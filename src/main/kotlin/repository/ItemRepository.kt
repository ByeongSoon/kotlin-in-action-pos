package repository

import domain.Item

class ItemRepository(
  private val items: MutableList<Item> = mutableListOf<Item>(
    Item("치토스",1000),
    Item("참이슬",1500),
    Item("파워에이드",2000),
    Item("신라면",950))
) {
  fun create(newItem: Item) {
    items.add(newItem)
  }

  fun remove(index: Int) {
    items.removeAt(index)
  }

  fun searchAll() {
    for ((i, item) in items.withIndex()) {
      println("$i : $item")
    }
  }
}