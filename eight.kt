fun main() {
  val array = generateSequence(0) {it + 2}
  for (i in array) {
    println(i) // бесконечность не предел
  }
  asmr()
}

fun asmr() {
  val array = generateSequence(0) {it + 2}
  val sterg = array.take(20) // в этом случае take помогает не входить в бесконечный цикл
  for (i in sterg) {
    println(i) 
  }
}