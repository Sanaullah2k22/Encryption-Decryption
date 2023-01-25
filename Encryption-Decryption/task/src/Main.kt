package encryptdecrypt

import java.io.File
import java.io.FileNotFoundException

fun main(args: Array<String>) {

    var mode = "enc"
    var key = 0
    var data = ""
    var inNameFile = ""
    var outNameFile = ""
    var algo = ""
    for (i in args.indices) {
        if (args[i] == "-mode") mode = args[i + 1]
        if (args[i] == "-key") key = args[i + 1].toInt()
        if (args[i] == "-data") data = args[i + 1]
        if (args[i] == "-in") inNameFile = args[i +1]
        if (args[i] == "-out") outNameFile= args[i +1]
        if(args[i] == "-alg")  algo = args[i+1]
    }
    when (mode) {
        "enc" -> encryption(data, key, inNameFile, outNameFile,algo)
        "dec" -> decryption(data, key, inNameFile, outNameFile,algo)
    }
}

fun encryption(data: String, key: Int, inNameFile: String, outNameFile: String,algo:String) {
    if (inNameFile.isEmpty()) {
        if(algo =="shift" || algo ==""){
            print(shiftEnc(data,key))
        }else {
            for (i in data) {
                print((i.code + key).toChar())
            }
        }
    } else {
        val file = File(inNameFile).readText()
        File(outNameFile).writeText("")
        if(algo =="shift"){
            File(outNameFile).appendText(shiftEnc(file,key))
        }else {
            for (i in file.indices) {
                File(outNameFile).appendText((file[i].code + key).toChar().toString())
            }
        }
    }
}

fun decryption(data: String, key: Int, inNameFile: String, outNameFile: String,algo:String) {
    if (inNameFile.isEmpty()) {
        if(algo =="shift" || algo == ""){
            print(shiftDec(data,key))
        }else{
        for (i in data) {
            print((i.code - key).toChar())
        }
        }
    } else {
        val file = File(inNameFile).readText()
        File(outNameFile).writeText("")
        if(algo =="shift"){
            File(outNameFile).appendText(shiftDec(file,key))
        }else {
            for (i in file.indices) {
                File(outNameFile).appendText((file[i].code - key).toChar().toString())
            }
        }
    }
}

fun shiftEnc(data :String,key:Int):String{
    var encrypted = ""
    for (c in data) {
        if (c in 'a'..'z' || c in 'A'..'Z') {
            encrypted += when (c in 'a'..'z') {
                true -> ('a'.code + (c.code - 'a'.code + key) % ('z'.code - 'a'.code + 1)).toChar()
                false -> ('A'.code + (c.code - 'A'.code + key) % ('Z'.code - 'A'.code + 1)).toChar()
            }
        }else {
                encrypted+=c
            }

        }

    return encrypted
}
fun shiftDec(data:String,key:Int):String{
    var decode = ""

    var msglist = data.split(" ")
    for (word in msglist) {
        for (character in word) {
            if (character in 'a'..'z' || character in 'A'..'Z') {
                when (character) {
                    in 'a'..'a' + (key -1) -> {
                        decode += ('z'.code - (key - (character.code + 1 - 'a'.code))).toChar()

                    }
                    in 'A'..'A' + (key - 1) -> {
                        decode += ('Z'.code - (key - (character.code + 1 - 'A'.code))).toChar()

                    }
                    else -> {
                        decode+=character - key

                    }
                }
            }else
            {
                decode+=character
            }
        }
        decode +=" "
    }
    return decode
}