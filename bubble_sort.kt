
fun main() {
  val arr = mutableListOf(5, 3, 2, 8, 1)
  buble(arr)
  println(arr) // [1, 2, 3, 5, 8] 
}
fun buble(arr: MutableList<Int>) {
  for (i in 0 until arr.size - 1) {
    for (j in 0 until arr.size - i - 1) {
      if (arr[j] > arr[j + 1]) {
        val temp = arr[j]
        arr[j] = arr[j + 1]
        arr[j + 1] = temp
   }
  }
 }
}