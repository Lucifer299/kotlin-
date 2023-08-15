fun main(){
  val data = mapOf(
    "Январь" to listOf(100,400,1000,5600,7600),
    "Февраль" to listOf(100,400,1000,5600,7600),
    "Март" to listOf(100,400,1000,5600,7600),
    "Апрель" to listOf(100,400,1000,-5600,7600),
    "Май" to listOf(100,400,1000,5600,7600),
    "Июнь" to listOf(100,400,1000,5600,7600)
  )
    printInfo(data)
  }
fun printInfo(data: Map<String, List<Int>>) {
  val validData = data.filterNot {it.value.any {it < 0}}
  val average = validData.flatMap{it.value}.average()
  println("Средняя выручка в неделю $average")
  
  val listOfSum = validData.map { it.value.sum() }
  val max = listOfSum.max()
  val min = listOfSum.min()
  val averageMonth = listOfSum.average()

  val maxMonths = validData.filter {it.value.sum() == max}.keys
  val minMonths = validData.filter {it.value.sum() == min}.keys

  println("Средняя выручка: $averageMonth")
  println("Максимальная выручка в месяц: $max")
  println("Была в следующих месяцах: ")
  for (month in maxMonths) {
    println(" $month")
  }
  
  println(" Минимальная выручка в месяц: $min")
  println("Была в следующих месяцах: ")
  for (month in minMonths) {
    println(" $month")
  }
  val invalidData = data.filter {it.value.any {it < 0}}
  val errorMonth = invalidData.keys
  println(" Ошибки произошли в следующих месяцах:")
  for (error in errorMonth) {
    println(" $error")
  }

}



