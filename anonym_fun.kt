fun main(args: Array<String>) {
  val sum = {a: Int, b: Int -> a + b}
  println(sum(6,8)) // два вида записи этих лямбда выражений
  val sum2: (Int, Int ) -> Int = {a, b -> a * b} // анонимная функции это люмбда выражения
  println(sum2(200,99))
  println(square(100))
  println(square2(300))
  println(parallel(33, 22))
  name("Alex")
  for (i in sortedArray) {
  println(i)
}

}
val square = {x: Int -> x * x}
val square2: (Int) -> Int = {it * it}

val parallel: (Int,Int) -> Int = {a, b -> (a + b) * 2} 
val name: (String) -> Unit = {println("Привет, $it!")}
val sort: (Array<Int>) -> Array<Int> = { 
  for (i in it.size - 2 downTo 0) {
    for (j in 0..i) {
      if (it[j] > it[j + 1]) {
        val temp = it[j]
        it[j] = it[j + 1]
        it[j + 1] = temp
      }
    }
  }
  
  it 
}

val sortedArray = sort(arrayOf(1, 2, 6, 36, -17, 3, 4, 5))

