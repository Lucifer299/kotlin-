fun main() {
  val array = generateSequence {(Math.random() * 100).toInt()}
  val stopR = array.take(100)
  for (i in stopR) {
    println("Сотрудник №$i;")
  }
}