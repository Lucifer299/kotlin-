fun main() {
  val names = listOf("Aleks", "Alina", "Andrey", "Bruno", "Vreis")
  val values = names.filter { it.startsWith("A") }
  for (i in values) {
    println(i)
  } 
}