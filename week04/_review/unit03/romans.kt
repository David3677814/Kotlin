fun main(args: Array<String>) {
    print("Enter a number between 1 and 10.")

    var number = readLine()!!

    var rom = number.toInt()

    if (rom == 1) {
        println("The roman numeral is I.")
    } else if (rom == 2) {
        println("The roman numeral is II")
    } else if (rom == 3) {
        println("The roman numeral is III")
    } else if (rom == 4 ) {
        println("The roman numeral is IV")
    } else if (rom == 5) {
        println("The roman numeral is V")
    } else if (rom == 6) {
        println("The roman numeral is VI")
    } else if (rom == 7) {
        println("The roman numeral is VII")
    } else if (rom == 8) {
        println("The roman numeral is VIII")
    } else if (rom == 9) {
        println("The room numeral is IX")
    } else if (rom == 10) {
        println("The roman numeral is X")
    }
}