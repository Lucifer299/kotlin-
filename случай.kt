fun main() {
  val listOfNumbers = mutableListOf<Int>()
  for (i in 0 .. 1000) {
    listOfNumbers.add(i)
  }
  val listOfEvenNumbers = listOfNumbers.filter {number:Int -> number  % 5 == 0 && number % 3 == 0}
  val sortedDs = listOfNumbers.sortedDescending()
  val str = sortedDs.map {"Преобразован в строку $it"}
  for (i in str) {
    println(i)
    
  }
}