/*
 * Complete the 'miniMaxSum' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun miniMaxSum(arr: Array<Int>): Unit {
    var minSum = 0L
    var maxSum = 0L
    var sortedArray = arr.sorted()
    val minMaxSum : Array<Long>

    for (i in 0..arr.size-2) {
        minSum += sortedArray[i]
    }

    for (i in arr.size -1 downTo  1) {
        maxSum += sortedArray[i]
    }

    minMaxSum = arrayOf(minSum, maxSum)
    minMaxSum.forEach {
        print("$it ")
    }

}

fun main(args: Array<String>) {

    //val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

//    miniMaxSum(arr)
    miniMaxSum(arrayOf(1,2,3,4,5))
    println()
    miniMaxSum(arrayOf(7,69,2,221,8974))
    println()
    miniMaxSum(arrayOf(256741038, 623958417, 467905213, 714532089, 938071625))
}
