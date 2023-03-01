import kotlin.random.Random

fun main() {
    game()
}

var guessedNum = ""
var userInput = ""


fun random() {
    val size = 4

    val s = HashSet<Int>(size)
    while (s.size < size){
        s += Random.nextInt(0,9)
    }

    for (i in s){
        val n = i.toString()
        guessedNum += n
    }

}



fun UserInput(){
    userInput = readLine()!!

    if (userInput.length > 4 || userInput.contains("[A-z]".toRegex())){
        println("Only 4 digits are allowed!!")
        UserInput()
    }else {
        println("Your guess is: $userInput")
    }
}

fun compare(userInput: String, guessedNum: String) {

    if (userInput.equals(guessedNum)){
        println("Congrats! You guessed it correctly!!")
    }
}


fun game() {

    random()
    println("Random 4-digit number was generated! Now we can start the game!")
    println("Enter 4 digits to guess the number:")
    UserInput()

    compare(userInput, guessedNum)

    println("You guessed this correctly: ")


}





