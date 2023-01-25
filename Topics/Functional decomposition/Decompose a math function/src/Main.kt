fun f(x: Double): Double {
    if(x <= 0)
       return  f1(x)
    else if(x > 0  && x < 1)
        return f2(x)

       return f3(x)
}

// implement your functions here
fun f1(number:Double):Double{
    return ((number * number) + 1)
}

fun f2(number:Double):Double{
    return (1 /(number * number))
}

fun f3(number:Double):Double{
return((number * number) - 1)
}