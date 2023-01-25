fun validatePassword(password: String): Boolean {
    // write your code here

    return if(password.length >= 5)
    {
        println("Good Password")
        true
    }
    else
    {
        println("Your password should be longer than five characters, please write a new password")
        false
    }

}

// do not change the code below
fun main() {
    var validationResult = false
    while (!validationResult) {
        val password = readln()
        validationResult = validatePassword(password)
    }
}

