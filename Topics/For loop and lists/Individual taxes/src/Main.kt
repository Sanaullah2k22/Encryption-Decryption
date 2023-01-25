fun main() {
    // write your code here
    var countryIncome = mutableListOf<Double>()
    var countryTax = mutableListOf<Double>()
    var countryNumber = mutableListOf<Double>()

    val size = readLine()!!.toInt()

    repeat(size) {
        countryIncome.add(readLine()!!.toDouble())
    }
    repeat(size) {
        countryTax.add(readLine()!!.toDouble())
    }


    for(i in countryIncome.indices)
    {
        countryNumber.add(countryIncome[i] * countryTax[i])
    }
    println(countryNumber.indexOf(countryNumber.maxOrNull()) + 1)



}