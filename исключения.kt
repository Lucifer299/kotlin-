fun main(args: Array<String>) {
  println(sum("1", "5"))
}
fun sum(a: String, b: String) : Int {
  
  
  return try {
    val nA = a.toInt()
    val nB = b.toInt()
    nA + nB
  } catch (e: Exception) {
     0
}
}