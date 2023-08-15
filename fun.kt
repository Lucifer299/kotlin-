fun main(args: Array<String>) {
  println(sum(1, 2))
}
fun sum(vararg numbers: Int): Int {
 var result = 0
 for (num in numbers ) {
   result += num
 }
 return result
}