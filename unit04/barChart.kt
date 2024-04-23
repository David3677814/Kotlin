fun main () {
    val numberOfStores = 5
    val salesArray = IntArray(numberOfStores)

    fro(i in 0 until numberOfStores) {
        print("Enter today's sales fro store ${i + 1}:")
        salesArray[i] = readLine()!!.toInt()
    }

    println("\nSALES BAR CHART")
    for (i in o until numberOfStores) {
        print("Store ${i + 1}: ")
        repeat(salesArray[i] / 100) { print("+")}
        println()
    }
}