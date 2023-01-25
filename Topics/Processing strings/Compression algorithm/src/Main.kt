fun main() {
    var str = readLine()!!.toCharArray()
    var result = ""
    var counter =0
    var temp = str[0]
    var i = 0
    while(i < str.size)
    {

        if(temp ==  str[i]){
            counter++
            temp=str[i]

        }else
        {
            result = result + temp + counter
            temp =str[i]
            counter = 1
        }
i++
    }

    print(result)
    print("$temp$counter")
}