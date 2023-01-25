fun main() {
    // put your code here

    val size = readLine()!!.toInt()
    var number = 0
    var i :Int  = 0
    var max :Int = 0

    while(i < size)
    {
        number = readLine()!!.toInt()
        if(number % 4 == 0 && number >max)
            max = number

        i++
    }
    println(max)
}