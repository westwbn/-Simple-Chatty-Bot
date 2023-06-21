package bot

const val BOTNAME = "Aid"
const val YEAR = 2020
const val INPUT = 3

fun main() {
    greet(BOTNAME, YEAR)
}

fun greet(assistantName: String, year: Int) {
    println("Hello! My name is ${assistantName}.\nI was created in ${year}.")
    remindName()
}

fun remindName() {
    println("Please, remind me your name")

    val name = readln()

    println("What a great name you have, ${name}!")
    guessAge()
}

fun guessAge() {
    val remainders = mutableListOf<Int>()

    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")

    repeat(INPUT) {
        remainders.add(readln().toInt())
    }
    val age = (remainders[0] * 70 + remainders[1] * 21 + remainders[2] * 15) % 105

    println("Your age is ${age}; that's a good time to start programming!")
    count()
}

fun count() {
    println("Now I will prove to you that I can count to any number you want.")
    val number = readln().toInt()
    for (num in 0..number) {
        println("${num}!")
    }
    test()
}

fun test() {
    val quiz = mutableListOf(
        "Let's test your programming knowledge.",
        "Why do we use methods?",
        "1. To repeat a statement multiple times.",
        "2. To decompose a program into several small subroutines.",
        "3. To determine the execution time of a program.",
        "4. To interrupt the execution of a program."
    )

    for (question in quiz) {
        println(question)
    }

    while (true) {
        val answer = readln().toInt()
        if (answer != 2) {
            println("Please, try again.")
            continue
        } else {
            println("Congratulations, have a nice day!")
            break
        }
    }
}