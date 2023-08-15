fun main() {
  val array = generateSequence {(Math.random() * 100000).toDouble()}
  for (i in array) {
    println(i)
  }
}