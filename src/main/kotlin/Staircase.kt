/*
 * Complete the 'staircase' function below.
 *
 * The function accepts INTEGER n as parameter.
 */

fun staircase(n: Int): Unit {

    for (i in 1..n) {
        repeat (n-i) {
            print(" ")
        }
        repeat(i) {
            print("#")
        }
        println()
    }

}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    staircase(n)
}
