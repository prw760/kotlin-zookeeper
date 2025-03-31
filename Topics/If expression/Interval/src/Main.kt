fun main() {

    val int1 = readln().toInt()

   if ((int1 in 12 downTo -14) || (int1 in 15..16) || (int1 >= 19)) {
       println("True")
    } else {
        println("False")
   }

}