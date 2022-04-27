import kotlin.math.abs

/*
 * Complete the 'diagonalDifference' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY arr as parameter.
 */

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    var leftDiagonal = 0
    var rightDiagonal = 0
    var count = 1

    for (i in arr.indices) {
        leftDiagonal += arr[i][i]
        rightDiagonal += arr[i][arr.size - count]
        count++
    }
    val diagonalDifference: Int = abs(leftDiagonal - rightDiagonal)


    return diagonalDifference

}

fun main() {
    val n = readLine()!!.trim().toInt()

    val arr = Array<Array<Int>>(n, { Array<Int>(n, { 0 }) })

    for (i in 0 until n) {
        arr[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }

    val result = diagonalDifference(arr)

    println(result)
}
