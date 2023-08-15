fun main() {
  val l = listOf(15443,43434,5454,332,434,222,334)
  val k = l.sorted()
  for (i in k) {
    println(i)
    mai() // по возрастанию
  }
}
fun mai() {
  val h = listOf(15443,43434,5454,332,434,222,334)
  val j = h.sortedDescending() // по убыванию
  for (i in j) {
    println(i)
  }
}