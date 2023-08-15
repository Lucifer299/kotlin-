fun main() {
  val lastName = mutableListOf<String>()
  val name = mutableListOf<String>()
  for (i in 0 .. 10) {
    lastName.add("Имя $i")
    name.add(" Фамилия " + (Math.random() * 10))
    val users = lastName.zip(name)
    for (user in users) {
      println("${user.first} ${user.second}")

  }
}
}