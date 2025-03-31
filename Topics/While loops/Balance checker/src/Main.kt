import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var balance = readln().toInt()
    var amtNeeded = 0

    while (scanner.hasNextInt()) {

        val thisValue: Int = scanner.nextInt()

        if (balance - thisValue >= 0) {
            balance -= thisValue
        } else {
            val amtShort = thisValue - balance
            amtNeeded = balance + amtShort
            println("Error, insufficient funds for the purchase. Your balance is $balance, but you need $amtNeeded.")
            break
        }
    }

    if (amtNeeded == 0) {
        println("Thank you for choosing us to manage your account! Your balance is $balance.")
    }

}