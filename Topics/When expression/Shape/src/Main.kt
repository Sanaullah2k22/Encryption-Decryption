fun main(args: Array<String>) {
    // write your code here
    var op = readLine()!!.toInt()
    var result = "You have chosen a"
    when(op)
    {
        1 -> print("$result square")
        2 -> print("$result circle")
        3 -> print("$result triangle")
        4 -> print("$result rhombus")
        else ->print("There is no such shape!")

    }
}