fun main(){
   val revenueWeek = listOf(listOf(8, 5, 4), listOf(7,2,9), listOf(1,0,4))
   val total = revenueWeek.flatMap { it } // либо flatten
   val average = total.average()
   println(average)
}