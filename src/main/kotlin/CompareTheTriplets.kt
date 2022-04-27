/*
 * Complete the 'compareTriplets' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY a
 *  2. INTEGER_ARRAY b
 */

fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    var alicePoints = 0
    var bobPoints = 0
    val pointsComparison : Array<Int>?

    for(i in a.indices) {
        when {
            a[i] > b[i] -> alicePoints += 1
            b[i] > a[i] -> bobPoints += 1
        }
    }
    pointsComparison = arrayOf(alicePoints, bobPoints)

    return pointsComparison

}

fun main() {

    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val b = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = compareTriplets(a, b)

    println(result.joinToString(" "))
}
