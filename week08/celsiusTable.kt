fun main() {
    println("Fahrenheit   Celsius")
    println("---------------------")
    // Loop through Fahrenheit temperatures from 0 to 20 and display their Celsius equivalents
    for (fahrenheit in 0..20) {
        val celsius = celsius(fahrenheit)
        println("$fahrenheit°F         $celsius°C")
    }
}

fun celsius(fahrenheit: Int): Double {
    // Convert Fahrenheit to Celsius using the formula: C = 5/9 * (F - 32)
    val celsius = 5.0 / 9.0 * (fahrenheit - 32)
    return celsius
}