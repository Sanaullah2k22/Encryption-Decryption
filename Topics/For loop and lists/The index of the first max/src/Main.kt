fun main() {
    // write your code here
    val size = readLine()!!.toInt()
    var list= mutableListOf<Int>()
    repeat(size){
        list.add(readLine()!!.toInt())
    }
    println(list.indexOf(list.maxOrNull()))
}