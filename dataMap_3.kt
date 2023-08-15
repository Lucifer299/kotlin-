fun main() {
  val data = mapOf(
    "file_0" to listOf(12,78,33,54,11),
    "file_1" to listOf(82,114,33,88,171),
    "file_2" to listOf(12,667,33,54,711)
  ) 
  val average = data.flatMap { it.value }.average()
  println(average)

}