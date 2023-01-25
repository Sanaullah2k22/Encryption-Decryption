// You can experiment here, it won’t be checked

fun main(args: Array<String>) {
  // put your code here
    var counter: () -> Int = { -42 }
}
fun reinitializeCounter(): Int {
    var value = 0
    counter = { ++value }
    return value
}