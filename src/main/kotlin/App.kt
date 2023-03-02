fun main() {
    println("sophia for the win")

    var number1: Int = 5
    number1 = 10

    val number2: Int = 6
    //number2 = 9

    var str1: String? = "hello" //declared with ?
    str1 = null                 //no error

    var str2: String = "hello"  //declared without ?
    //str2 = null                 //compile error

println()
    println(plus())
    println(plus(3))
    println(plus(2,5))

    println()

    println(plus(num2 = 10))

    println()

    higherfunc(add)

}

val add: (Int, Int) -> Int = {num1, num2 -> num1 + num2}

fun higherfunc(addfunc: (Int, Int) -> Int) {
    val sum = addfunc(4,2)
    println("The sum of the two numbers is: $sum")
}


fun plus(num1: Int = 0, num2: Int = 2): Int{
    return num1 + num2
}




