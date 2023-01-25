fun main() {

    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()

    // put your code here
    val max = when (a > b){
       true -> a
        false -> b
    }

    println(max)
}