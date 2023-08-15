fun main() {
  val numbers = (0..100).toList()
  val doubleList = numbers.map { number: Int -> number * 2} // работает только если указан один параметр иначе при указании метода надо ставить круглые скобки а внутри фигурные
  val strMut = numbers.map { "Вещей № $it " }
  for (i in doubleList) {
     println(i)
  }
  for (i in strMut) {
    println(i)
}
}