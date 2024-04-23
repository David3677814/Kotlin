data class Student(val name: String, val age : Int, val grade: Double)

fun main() {
    val student1 = Student("Alice", 20, 85.5)
    val student2 = Student("Bob", 22, 78.0)

    println("Student 1: $student1")
    println("Studdent 2: $student2")

    println("Are student1 and student2 the same? ${student1 == student2}")

    println("Hash code of student1 ${student1.hashCode()}")
    println("Hash code of student2 ${student2.hashCode()}")

    val student3 = student1.copy(name = "Charlie")
    println("Modified Student 1: $student3")
}