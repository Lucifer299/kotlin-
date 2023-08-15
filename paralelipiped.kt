fun main(args: Array<String>) {
 vok(10, 22, 44)
}
fun vok(a:Int, b:Int = a, c:Int = a) = println(a * b * c)
