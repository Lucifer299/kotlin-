fun main() {
  dataUser(lastName = "Smith")
}
fun dataUser(name: String = "", lastName:String = "", surName: String = "") {
  if (name.isNotEmpty()) {
    println("Имя ${name}")
  }
  
  if (lastName.isNotEmpty()) {
    println("Фамилия ${lastName}")
  }

  if (surName.isNotEmpty()) {
    println("Отчество ${surName}")
  }

  
  }


