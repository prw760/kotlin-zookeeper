fun main() {

    val val1 = readln().toInt()
    val val2 = readln().toInt()
    val val3 = readln().toInt()

    if ((val1 + val2 == 20) || (val1 + val3 == 20) || (val2 + val3 == 20)) {
        println(true)
    } else {
        println(false)
    }

}