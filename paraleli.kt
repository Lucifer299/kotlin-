fun main(args: Array<String>) {
  para(3310, 100, 3333)
}
fun para(a: Int, b: Int, c: Int) {
  if (a.isNotEmpty || b.isEmpty && c.isEmpty()){
    println("Все стороны равны")
  } else if (a.isNotEmpty || (b.isNotEmpty && c.isEmpty)()){
    println("первая и третья сторона равны")
  }
}