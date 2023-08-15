fun main(){
   val revenueWeek = listOf(listOf(8, 5, 4), listOf(7,2,9), listOf(1,0,4))
   val total = mutableListOf<Int>()
   revenueWeek.map {
    for (i in it) {
      total.add(i)
    }
   }
   val average = total.average()
   println(average)
}