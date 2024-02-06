fun main(){
    for (i in 0..3){
        println("Hey $i!")
    }
    val range1 = 1..10
    val range2 = 0 until 10
    println(range1)
    println(range2)

    var sum = 0
    for (n in 10..100){
        sum += n
        println(sum)
    }
    println("sum = $sum")
}
