fun main() {
  val array = generateSequence(0) {it + 2}
  val sterg = array.take(20) // в этом случае take помогает не входить в бесконечный цикл
  for (i in sterg) {
    println(i) 
  }
}