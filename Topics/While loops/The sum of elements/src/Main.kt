fun main() {

    var sumOfInputs = 0
    var thisInput: Int = 0

    do {

        thisInput = readln().toInt()
        sumOfInputs += thisInput

    } while (thisInput != 0)

    println(sumOfInputs)

}