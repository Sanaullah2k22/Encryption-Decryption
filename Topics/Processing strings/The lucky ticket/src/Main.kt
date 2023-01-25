fun main() {
    // write your code here

    var ticket = readLine()!!.toCharArray()
    var first = 0
    var last = 0
    for (i in 0..2) {
        first += ticket[i].toString().toInt()
    }
    for (i in 3..5) {
        last += ticket[i].toString().toInt()
    }
    if (first == last) println("Lucky") else println("Regular")

}