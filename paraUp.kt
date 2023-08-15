fun main() {
  para(0, 1, 2) 
}

fun para(a: Int, b: Int, c: Int) {
  if ((a != 0 || b != 0) && c != 0) {
    println("Все стороны равны")
  } else if (a != 0 && b != 0 && a == c) { 
    println("первая и третья сторона равны")
  }
}