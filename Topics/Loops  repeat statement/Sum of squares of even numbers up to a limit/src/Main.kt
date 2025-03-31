import java.util.Scanner

fun main(args: Array<String>) {
    // Create a Scanner object for taking input
    val reader = Scanner(System.`in`)

    // Read an integer input
    val limit = reader.nextInt()

    // Check if limit is less than 0
    if (limit < 0) {
        println("Invalid Input")
    } else {

        var i = 0
        var thisSum = 0

        repeat(limit) {
            ++i
            if (i % 2 == 0) {
                thisSum += (i * i)
            }
        }

        println(thisSum)
    }
}