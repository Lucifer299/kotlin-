fun main() {
  val listOfNumbers = mutableListOf<Int>()
  for (i in 0 .. 99) {
    listOfNumbers.add(i)
  }
  val listOfEvenNumbers = listOfNumbers.filter ({ number: Int -> number % 2 == 0 }) 
  val listOfEvenNumbers2 = listOfNumbers.filter {it % 3 == 0 }
  for (i in listOfEvenNumbers) {
    println(i)
    
  }
  for (i in listOfEvenNumbers2) {
    println(i)
    
  }
}