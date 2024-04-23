fun main() {
    // Prompting the user to enter wholesale cost and markup percentage
    println("Enter the wholesale cost:")
    val wholesaleCost = readLine()?.toDoubleOrNull()
    if (wholesaleCost == null || wholesaleCost < 0) {
        println("Invalid input for wholesale cost. Please enter a valid positive number.")
        return
    }

    println("Enter the markup percentage:")
    val markupPercentage = readLine()?.toDoubleOrNull()
    if (markupPercentage == null || markupPercentage < 0) {
        println("Invalid input for markup percentage. Please enter a valid positive number.")
        return
    }

    // Calling calculateRetail function to get the retail price
    val retailPrice = calculateRetail(wholesaleCost, markupPercentage)
    println("The item's retail price is: $retailPrice")
}

fun calculateRetail(wholesaleCost: Double, markupPercentage: Double): Double {
    // Calculating the retail price using the formula: retail price = wholesale cost + (wholesale cost * markup percentage / 100)
    return wholesaleCost + (wholesaleCost * markupPercentage / 100)
}
