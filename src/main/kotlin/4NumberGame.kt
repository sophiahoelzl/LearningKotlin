import kotlin.random.Random

fun main() {
    game()
}

var userInput = ""  //String that hold user input
var h = HashSet<Int>(4) //HashSet for random number (Hashset because easier with duplicates)

var check: Boolean = false //boolean to check if game is over


fun random(): Array<Int> {  //random number generator, returns Array<Int> (easier for me to compare)

    while (h.size < 4){
        h += Random.nextInt(0,9)
    }

    return h.toTypedArray()
}


fun UserInput(): IntArray { //Method for User input
    userInput = readLine()!! //same as nextLine() in java

    if (userInput.length != 4 || userInput.contains("[A-z]".toRegex())){    //to check if only 4 numbers are entered
        println("Only 4 digits are allowed!!")
        UserInput()
    }else {
        println("Your guess is: $userInput")
    }

    var user = IntArray(4)

    var e = 0
    for (i in userInput){
        user[e] = i.digitToInt() //put user input also in Array
        e++
    }

    return user
}

var rightNumWrongPlace = 0 //Right digit but wrong place
var rightNumRightPlace = 0 //Right digit and right place

fun compare(userInput: IntArray, guessedNum: IntArray): Boolean { //copmares the two arrays, returns boolean if number was guessed

    for (a in userInput){ // checks the right digit but wrong place
        for (b in guessedNum){
            if (a.equals(b)){
                rightNumWrongPlace++
            }
        }
    }

    for (i in 0..3){    // checks the right digit and right place
        if (userInput[i] == guessedNum[i]){
            rightNumRightPlace++

        }
    }


    if (rightNumRightPlace == 4){ //checks if number was guessed correct if rightNumRightPlace is 4
        return true
    }

    return false
}

fun game() {

    var a = IntArray(4)     //
    var w = 0                    //
                                 //
    var arr = random()           //
                                 //     initializes the generated random number
    for (i in arr){              //
        a[w] = i                 //
        w++                      //
    }                            //

    /*
    for (i in h){
        print(i)
    }*/

    println()
    println("Random 4-digit number was generated! Now we can start the game:)!")
    println()

    while (check == false){     // checks if the number was already guessed

        println("*************************************")
        println("Enter 4 digits to guess the number:")
        var user = UserInput()

        check = compare(user, a)

        println("You guessed this correctly: $rightNumWrongPlace : $rightNumRightPlace ")
        println()

        rightNumWrongPlace = 0
        rightNumRightPlace = 0
    }

    println("=================================================")
    println("   Congrats!! You guessed the number correct:)   ")
    println("=================================================")

}





