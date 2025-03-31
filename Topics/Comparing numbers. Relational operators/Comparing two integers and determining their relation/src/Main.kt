import java.util.*

fun main(args: Array<String>) {
    // Scanner object for reading inputs.
    val reader = Scanner(System.`in`)

    val val1 = reader.nextInt()
    val val2 = reader.nextInt()

    if (val1 < val2) {
        println("less")
    } else if (val1 > val2) {
        println("greater")
    } else {
        println("equal")
    }
}