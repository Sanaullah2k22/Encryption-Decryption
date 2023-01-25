fun main() {
    // put your code here
    val size =readLine()!!.toInt()
    var grade = 0
    var two :Int =0
    var three :Int =0
    var four :Int =0
    var five :Int =0

    var i :Int = 0

    while(i < size)
    {
        grade = readLine()!!.toInt()
        when(grade){
            2 -> two++
            3 -> three++
            4 -> four++
            5 -> five++

        }
        i++
    }
    println("$two $three $four $five")

}