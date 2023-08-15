fun main() {
  val array = (0..1000).toList()
  val employees = array.map { "Сотрудники $it"}
  val firt_ten = employees.take(10)
  for (i in firt_ten) { //  take с начала первые
    println(i)
    
  }
  why()
  dr()
  drl()
}
fun why() {
  val array_2 = (0..1000).toList()
  val employees_2 = array_2.map { "Сотрудники $it"}
  val firt_ten_2 = employees_2.takeLast(10) // takeLast с конца первые 
  for (i in firt_ten_2) {
    println(i)
  }
}
fun dr() {
  val array_3 = (0..1000).toList()
  val employees_3 = array_3.map { "Сотрудники $it"}
  val firt_ten_3 = employees_3.drop(450) // drop с начала первые выбрасывает 
  for (i in firt_ten_3) {
    println(i)
  }
}
fun drl() {
  val array_4 = (0..1000).toList()
  val employees_4 = array_4.map { "Сотрудники $it"}
  val firt_ten_4 = employees_4.dropLast(200) // dropLast с конца первые  выбрасывает
  for (i in firt_ten_4) {
    println(i)
  }
}