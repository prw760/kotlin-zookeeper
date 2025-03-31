import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    // Read the two numbers
    val val1 = scanner.nextInt()
    val val2 = scanner.nextInt()

    if (val1 < val2) {
        println("<")
    } else if (val1 > val2) {
        println(">")
    } else {
        println("=")
    }
}
