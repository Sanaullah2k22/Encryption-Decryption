fun main() {
    // write your code here
    val age = readLine()!!.toInt()

    if(age in 18..59)
        println(true)
    else
        println(false)
}