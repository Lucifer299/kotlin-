fun copyListOf(list: MutableList<Int>): List<Int> {
  return list.toList()
}
fun main() {
  println(copyListOf(100))
}
