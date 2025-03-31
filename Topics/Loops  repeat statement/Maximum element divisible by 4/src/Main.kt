fun main() {

    val numInputs = readln().toInt()
    var maxValue = 0
    var thisValue = 0

    repeat(numInputs) {
        thisValue = readln().toInt()
        if (thisValue % 4 == 0) {
            maxValue = maxOf(maxValue, thisValue)
        }
    }

    println(maxValue)
}