fun main() {
    // Loop from 1 through 10 to demonstrate falling distance calculation
    for (time in 1..10) {
        val distance = fallingDistance(time.toDouble())
        println("Time: $time seconds, Distance: $distance meters")
    }
}

fun fallingDistance(time: Double): Double {
    // Constants
    val g = 9.8 // Acceleration due to gravity in m/s^2

    // Calculate distance using the formula: d = 1/2 * g * t^2
    val distance = 0.5 * g * time * time
    return distance
}